import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class CardLayoutSetup1 extends JFrame implements ActionListener{
    private Container c;
    private JButton btn[];
    private CardLayout cl;

    CardLayoutSetup1(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        cl = new CardLayout();
        c.setLayout(cl);
        c.setBackground(hsb);

        btn = new JButton[10];

        for(int i=0; i<10; i++){
            btn[i] = new JButton("Button "+(i+1));
            c.add(btn[i]);
            btn[i].addActionListener(this);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        cl.next(c);
        
    }
    public static void main(String[] args){
        CardLayoutSetup1 frame = new CardLayoutSetup1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setTitle("CardLayout");
    }
}
