package Deck;

import java.awt.*;

public class Deck {
    private char[][] deck;
    private boolean KQ, kq;

    public Deck(){
        deck = new char[][]

        {
                {'r','n','b','q','k','b','n','r'},
                {'p','p','p','p','p','p','p','p'},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {'P','P','P','P','P','P','P','P'},
                {'R','N','B','Q','K','B','N','R'}
        };

        KQ = true;
        kq = true;
    }

    public Deck(String FEN)
    {


    }

    public char[][] getDeck(){return deck;}

    public void setElem(Point point, char value){
        this.deck[point.x][point.y] = value;
    }
    public char getElem(Point point){return this.deck[point.x][point.y];}

}
