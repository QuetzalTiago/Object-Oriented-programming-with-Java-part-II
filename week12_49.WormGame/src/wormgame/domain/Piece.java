package wormgame.domain;

public class Piece {
    private int x;
    private int y;

    public Piece(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean runsInto(Piece piece){
        if (piece.getX()==this.getX()&&piece.getY()==this.getY()){
            return true;
        }return false;
    }

    public String toString(){
        return "("+x+","+y+")";
    }

    @Override
    public boolean equals(Object p){
        if (this.getX()== ((Piece) p).getX()&&this.getY()== ((Piece) p).getY()){
                return true;
        }return false;
    }

}
