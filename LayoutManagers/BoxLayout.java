import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class BoxLayoutSetup1 extends JFrame {
    private Container c;
    private JButton btn[];
    private BoxLayout box;

    BoxLayoutSetup1(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        // BoxLayout(Container c, int axis)
        // box = new BoxLayout(c, BoxLayout.Y_AXIS);
        box = new BoxLayout(c, BoxLayout.X_AXIS);
        c.setLayout(box);
        c.setBackground(hsb);

        btn = new JButton[10];

        for(int i=0; i<10; i++){
            btn[i] = new JButton(""+(i+1));
            c.add(btn[i]);
            c.add(Box.createHorizontalStrut(10));
        }
    }
    public static void main(String[] args){
        BoxLayoutSetup1 frame = new BoxLayoutSetup1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setTitle("FlowLayout");
    }
}
