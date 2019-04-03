package wormgame.domain;

import wormgame.Direction;

import java.util.*;

public class Worm {

    private Direction direction;
    private List<Piece> worm;
    private int size;

    public Worm(int originalX, int originalY, Direction originalDirection){
        setDirection(originalDirection);
        worm = new ArrayList<Piece>();
        worm.add(new Piece(originalX,originalY));
        grow();
    }

    public Direction getDirection(){
        return direction;
    }

    public void setDirection(Direction dir){
        direction=dir;
    }

    public int getLength(){
        return worm.size();
    }

    public List<Piece> getPieces(){
        return worm;
    }

    public void move(){
        if (direction==Direction.RIGHT){
            worm.add(new Piece(wormHead().getX()+1,wormHead().getY()));
        }

        if (direction==Direction.LEFT){
            worm.add(new Piece(wormHead().getX()-1,wormHead().getY()));
        }

        if (direction==Direction.UP){
            worm.add(new Piece(wormHead().getX(),wormHead().getY()-1));
        }

        if (direction==Direction.DOWN){
            worm.add(new Piece(wormHead().getX(),wormHead().getY()+1));
        }
        if (size<3){
            grow();
        }
        if(!(getLength()<=size)){ // If size complete, removes first piece and adds a new one to move
            worm.remove(worm.get(0));
        }
    }

    public void grow(){
        size++;
    }

    public boolean runsInto(Piece piece){
        for (Piece p:worm){
            if (p.equals(piece)){
                return true;
            }
        }return false;
    }

    public boolean runsIntoItself(){
        ArrayList<Piece> mirror = new ArrayList<Piece>();
        for (Piece p:worm){
            if (!(mirror.contains(p))){
                mirror.add(p);
            }else{
                return true;
            }
        }return false;
    }

    public Piece wormHead(){
        return worm.get(worm.size()-1);
    }






}
