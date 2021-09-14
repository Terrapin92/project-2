import java.awt.*;
import javax.swing.*;


public class MApp extends JPanel implements MouseListener
{
    private boolean clicked;
    private Rectangle r;
    public MApp()     {

        clicked = false;
        r = new Rectangle(15, 15, 50, 50);
        addMouseListener(this);
    }

    public void paintComponent(Graphics g)    {

        if(clicked)
        {
            g.setColor(Color.BLUE);
        }
        else
        {
            g.setColor(Color.RED);
        }
        g.fillRect((int)r.getX(), (int)r.getY(),
                (int)r.getWidth(), (int)r.getHeight());
    }
    public void mouseClicked (MouseEvent e)
    {
        Point p = new Point(e.getX(),e.getY());
        if(r.contains(p))
        {
            clicked = !clicked;
        }
        repaint();
    }

    public void Circle()    {
        g.fillOval(0, 0, s, s);
    }

    public void mousePressed (MouseEvent evnt) {}
    public void mouseReleased (MouseEvent evnt) {}
    public void mouseEntered (MouseEvent evnt) {}
    public void mouseExited (MouseEvent evnt) {}
}
