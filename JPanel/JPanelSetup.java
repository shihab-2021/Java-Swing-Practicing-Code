import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class JPanelSetup extends JFrame{
    private Container c;
    private JPanel panel1, panel2;

    JPanelSetup(){
        initComponent();
    }
    public void initComponent(){

        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        c.setLayout(null);

        panel1 = new JPanel();
        panel1.setBounds(10, 20, 460, 200);
        panel1.setBackground(Color.PINK);
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(10, 240, 460, 200);
        panel2.setBackground(hsb);
        c.add(panel2);
    }
    public static void main(String[] args){
        JPanelSetup frame = new JPanelSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("JPanel");
    }
}