import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class JColorChooserSetup extends JFrame {
    private Container c;
    private JLabel headingLabel;
    private JButton bt;
    private Font f1, f2;

    JColorChooserSetup(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);
        f1 = new Font("Tahoma", Font.BOLD, 25);
        f2 = new Font("Tahoma", Font.BOLD, 14);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);

        headingLabel = new JLabel("JColorChooser");
        headingLabel.setBounds(110, 20, 200, 30);
        headingLabel.setFont(f1);
        c.add(headingLabel);

        bt = new JButton("Choose a color");
        bt.setBounds(120, 150, 150, 50);
        bt.setFont(f2);
        c.add(bt);

        bt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Select a color", Color.PINK);
                c.setBackground(color);
                
            }});
    }

    public static void main(String[] args){
        JColorChooserSetup frame = new JColorChooserSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setTitle("JColorChooser");
    }
}