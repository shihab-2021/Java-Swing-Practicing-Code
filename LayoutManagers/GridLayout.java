import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class GridLayoutSetup1 extends JFrame {
    private Container c;
    private JButton btn[];
    private GridLayout gl;

    GridLayoutSetup1(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        gl = new GridLayout();
        c.setLayout(gl);
        c.setBackground(hsb);

        btn = new JButton[4];

        for(int i=0; i<4; i++){
            btn[i] = new JButton(""+(i+1));
            c.add(btn[i]);
        }
    }
    public static void main(String[] args){
        GridLayoutSetup1 frame = new GridLayoutSetup1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setTitle("FlowLayout");
    }
}

class GridLayoutSetup2 extends JFrame {
    private Container c;
    private JButton btn[];
    private GridLayout gl;

    GridLayoutSetup2(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        gl = new GridLayout(2, 2);
        c.setLayout(gl);
        c.setBackground(hsb);

        btn = new JButton[4];

        for(int i=0; i<4; i++){
            btn[i] = new JButton(""+(i+1));
            c.add(btn[i]);
        }
    }
    public static void main(String[] args){
        GridLayoutSetup2 frame = new GridLayoutSetup2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setTitle("FlowLayout");
    }
}

class GridLayoutSetup3 extends JFrame {
    private Container c;
    private JButton btn[];
    private GridLayout gl;

    GridLayoutSetup3(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        gl = new GridLayout(2, 2, 5, 5);
        // gl.setHgap(5);
        // gl.setVgap(5);
        c.setLayout(gl);
        c.setBackground(hsb);

        btn = new JButton[4];

        for(int i=0; i<4; i++){
            btn[i] = new JButton(""+(i+1));
            c.add(btn[i]);
        }
    }
    public static void main(String[] args){
        GridLayoutSetup3 frame = new GridLayoutSetup3();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setTitle("FlowLayout");
    }
}
