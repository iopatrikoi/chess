package App;

import javax.swing.*;

public class App extends JFrame{
    private static final int  WIDTH;
    private static final int HEIGHT;

    static {
        WIDTH = 640;
        HEIGHT = 640;
    }
    public App(String Name){
        super(Name);
        Mouse mouse = new Mouse();
        this.addMouseListener(mouse);
    }

    public void run(){
        this.setSize(WIDTH,HEIGHT);
        this.setVisible(true);
        this.setResizable(false);
    }

    public static int getHEIGHT() {
        return App.HEIGHT;
    }

    public static int getWIDTH() {
        return App.WIDTH;
    }

    public static void main(String[] args)
    {
        App chess = new App("test");
        chess.run();
    }

}
