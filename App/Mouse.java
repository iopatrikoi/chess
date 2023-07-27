package App;
import App.App.*;
import org.ietf.jgss.Oid;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse implements MouseListener {

    public Point current;

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        current = new Point(mouseEvent.getX()/(App.getWIDTH()/8), mouseEvent.getY()/(App.getHEIGHT()/8));
        System.out.println(current);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}

