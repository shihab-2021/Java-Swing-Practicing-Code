// FlowLayout arrange the components in a row, one after another(in a flow).
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class FlowLayoutSetup1 extends JFrame {
    private Container c;
    private JButton btn[];
    private FlowLayout fLayout;

    FlowLayoutSetup1(){
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane();
        fLayout = new FlowLayout();
        c.setLayout(fLayout);

        btn = new JButton[10];

        for(int i=0; i<10; i++){
            btn[i] = new JButton(""+(i+1));
            c.add(btn[i]);
        }
    }
    public static void main(String[] args){
        FlowLayoutSetup1 frame = new FlowLayoutSetup1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("FlowLayout");
    }
}
// Alignment of FlowLayout
class FlowLayoutSetup2 extends JFrame {
    private Container c;
    private JButton btn[];
    private FlowLayout fLayout;

    FlowLayoutSetup2(){
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane();
        fLayout = new FlowLayout(FlowLayout.LEFT);
        c.setLayout(fLayout);

        btn = new JButton[10];

        for(int i=0; i<10; i++){
            btn[i] = new JButton(""+(i+1));
            c.add(btn[i]);
        }
    }
    public static void main(String[] args){
        FlowLayoutSetup2 frame = new FlowLayoutSetup2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("FlowLayout");
    }
}
// HORIZONTAL AND VERTICAL ALIGNMENT
class FlowLayoutSetup3 extends JFrame {
    private Container c;
    private JButton btn[];
    private FlowLayout fLayout;

    FlowLayoutSetup3(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        fLayout = new FlowLayout(FlowLayout.LEFT, 10, 20);
        // fLayout.setHgap(10);
        // fLayout.setVgap(20);
        c.setLayout(fLayout);
        c.setBackground(hsb);

        btn = new JButton[10];

        for(int i=0; i<10; i++){
            btn[i] = new JButton(""+(i+1));
            c.add(btn[i]);
        }
    }
    public static void main(String[] args){
        FlowLayoutSetup3 frame = new FlowLayoutSetup3();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("FlowLayout");
    }
}