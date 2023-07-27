package App;

import javax.swing.*;

public class App extends JFrame{

    private final int  WIDTH;
    private final int HEIGHT;
    public App(int WIDTH, int HEIGHT, String Name){
        super(Name);
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }

    public void run(){

    }


    public static void main(String[] args)
    {
        new App(1280,720,"test");
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }
}
