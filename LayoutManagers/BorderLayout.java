// The BorderLayout is used to arrange the components in five regions: north, south, east, west and center.
//       north
//west   center   east
//       south
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class BorderLayoutSetup extends JFrame{
    private Container c;
    private BorderLayout bLayout;
    private JButton btn1, btn2, btn3, btn4, btn5;

    BorderLayoutSetup(){
        initComponent();
    }

    public void initComponent(){
        c = this.getContentPane();
        bLayout = new BorderLayout(10, 5);
        c.setLayout(bLayout);

        btn1 = new JButton("NORTH");
        btn2 = new JButton("WEST");
        btn3 = new JButton("CENTER");
        btn4 = new JButton("EAST");
        btn5 = new JButton("SOUTH");

        c.add(btn1, BorderLayout.NORTH);
        c.add(btn2, BorderLayout.WEST);
        c.add(btn3, BorderLayout.CENTER);
        c.add(btn4, BorderLayout.EAST);
        c.add(btn5, BorderLayout.SOUTH);
    }
    public static void main(String[] args){
        BorderLayoutSetup frame = new BorderLayoutSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("BorderLayout");
    }
}