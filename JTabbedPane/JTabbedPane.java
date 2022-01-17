import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

class JTabbedPanneSetup1 extends JFrame {
    private Container c;
    private JTabbedPane tp;
    private JPanel panel1, panel2, panel3;
    private Font f1, f2;
    private JLabel label1, label2, label3;

    JTabbedPanneSetup1(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);
        f1 = new Font("Tahoma", Font.BOLD, 25);
        f2 = new Font("Tahoma", Font.BOLD, 20);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);

        tp = new JTabbedPane();
        tp.setBounds(50, 50, 590, 250);
        c.add(tp);

        label1 = new JLabel("Home Panel.");
        label1.setFont(f1);
        label2 = new JLabel("Help Panel.");
        label2.setFont(f1);
        label3 = new JLabel("Edit Panel.");
        label3.setFont(f1);

        panel1 = new JPanel();
        panel1.add(label1);
        panel1.setBackground(Color.PINK);
        panel2 = new JPanel();
        panel2.add(label2);
        panel2.setBackground(Color.cyan);
        panel3 = new JPanel();
        panel3.add(label3);
        panel3.setBackground(Color.LIGHT_GRAY);

        tp.addTab("Home", panel1);
        tp.addTab("Help", panel2);
        tp.addTab("Edit", panel3);
    }

    public static void main(String[] args){
        JTabbedPanneSetup1 frame = new JTabbedPanneSetup1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.setTitle("JTabbedPane");
    }
}

class JTabbedPanneSetup2 extends JFrame {
    private Container c;
    private JTabbedPane tp;
    private JPanel panel1, panel2, panel3;
    private Font f1, f2;
    private JLabel label1, label2, label3;

    JTabbedPanneSetup2(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);
        f1 = new Font("Tahoma", Font.BOLD, 25);
        f2 = new Font("Tahoma", Font.BOLD, 20);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);

        tp = new JTabbedPane(JTabbedPane.BOTTOM);
        // tp.setTabPlacement(JTabbedPane.BOTTOM);
        tp.setBounds(50, 50, 590, 250);
        c.add(tp);

        label1 = new JLabel("Home Panel.");
        label1.setFont(f1);
        label2 = new JLabel("Help Panel.");
        label2.setFont(f1);
        label3 = new JLabel("Edit Panel.");
        label3.setFont(f1);

        panel1 = new JPanel();
        panel1.add(label1);
        panel1.setBackground(Color.PINK);
        panel2 = new JPanel();
        panel2.add(label2);
        panel2.setBackground(Color.cyan);
        panel3 = new JPanel();
        panel3.add(label3);
        panel3.setBackground(Color.LIGHT_GRAY);

        tp.addTab("Home", panel1);
        tp.addTab("Help", panel2);
        tp.addTab("Edit", panel3);
    }

    public static void main(String[] args){
        JTabbedPanneSetup2 frame = new JTabbedPanneSetup2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.setTitle("JTabbedPane");
    }
}