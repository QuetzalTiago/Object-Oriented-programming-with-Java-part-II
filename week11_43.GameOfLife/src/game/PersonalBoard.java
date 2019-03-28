package game;

import gameoflife.GameOfLifeBoard;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double v) {
        int i = 0;
        int i1 = 0;
        if (!(v==0)&&!(v==1)) {
            v = v * 100;
            int height = getPercentage(getHeight(), (int) v);
            int width = getPercentage(getWidth(), (int) v);
            for (int j = 0; j < height; j++) {
                turnToLiving(i, i1);
                i1++;
            }
            i1 = 0;
            while (i1 < width) {
                for (int h = 0; h < getWidth(); h++) {
                    turnToLiving(i, i1);
                    i++;
                }
                i1++;
                i = 0;
            }

        } else if (v==1){
            int height = getHeight();
            int width = getWidth();
            for (int j = 0; j <= height; j++) {
                turnToLiving(i, i1);
                i1++;
            }
            i1 = 0;
            while (i1 <= width) {
                for (int h = 0; h < getWidth(); h++) {
                    turnToLiving(i, i1);
                    i++;
                }
                i1++;
                i = 0;
            }
        }
    }


    @Override
    public boolean isAlive(int i, int i1) {
        try {
            if (getBoard()[i][i1]) {
                return true;
            }
        }catch (Exception e){
            return false;
        }
        return false;
    }

    @Override
    public void turnToLiving(int i, int i1) {
        try{
            getBoard()[i][i1]=true;
        }catch (Exception e){

        }

    }

    @Override
    public void turnToDead(int i, int i1) {
        try{
            getBoard()[i][i1]=false;
        }catch (Exception e){

        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int livingNeighbours = 0;

        if (isAlive(i+1,i1)){
            livingNeighbours++;
        }

        if (isAlive(i+1,i1+1)){
            livingNeighbours++;
        }
        if (isAlive(i,i1+1)){
            livingNeighbours++;
        }
        if (isAlive(i-1,i1+1)){
            livingNeighbours++;
        }
        if (isAlive(i-1,i1)){
            livingNeighbours++;
        }
        if (isAlive(i,i1-1)){
            livingNeighbours++;
        }
        if (isAlive(i-1,i1-1)){
            livingNeighbours++;
        }
        if (isAlive(i+1,i1-1)){
            livingNeighbours++;
        }

        return livingNeighbours;
    }

    @Override
    public void manageCell(int x, int y, int ln) {
        if (ln<2){
            turnToDead(x,y);
        }

        if (ln>3){
            turnToDead(x,y);
        }

        if (ln==3){
            turnToLiving(x,y);
        }



    }

    public int getPercentage(int number, int percentage) {
        if (percentage > 0) {
            return (int) ((percentage * number) / 100.0);
            //return (int)(number*(percentage/100.0f));
        }return 0;
    }
}
