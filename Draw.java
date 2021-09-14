import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Draw extends JPanel implements ActionListener
{
    JTextField tfInfo;
    JLabel lblColor, lblShapes;
    JCheckBox cbRed, cbBlue;
    ButtonGroup shapes;
    JRadioButton rbCircle, rbSquare;
    JButton btnSubmit;
    public Draw(JPanel panel)
    {
        GridBagConstraints c = new GridBagConstraints();
        tfInfo = new JTextField("Color", 15);
        tfInfo = new JTextField("Shapes", 50);
        lblColor = new JLabel("Colors:");
        cbRed = new JCheckBox("Red");
        cbBlue = new JCheckBox("Blue");
        lblShapes = new JLabel("Shapes:");
        shapes = new ButtonGroup();
        rbCircle = new JRadioButton("Circle");
        rbSquare = new JRadioButton("Square");
        btnSubmit = new JButton("Draw");
        btnSubmit.addActionListener(this);
        this.setBackground(Color.WHITE);

        add(lblColor);
        add(cbRed);
        add(cbBlue);
        add(lblShapes);
        add(rbCircle);
        add(rbSquare);
        add(btnSubmit);
        shapes.add(rbCircle);
        shapes.add(rbSquare);
    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource() == btnSubmit)
        {
            if(cbRed.isSelected()&&cbBlue.isSelected())
            {
                if(rbCircle.isSelected())
                {

                }
                else if(rbSquare.isSelected())
                {

                }
            }
            else if(cbRed.isSelected())
            {
                if(rbCircle.isSelected())
                {

                }
                else if(rbSquare.isSelected())
                {

                }
            }
            else if(cbBlue.isSelected())
            {
                if(rbCircle.isSelected())
                {

                }
            }
            else if(rbSquare.isSelected())
            {

            }
        }
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
