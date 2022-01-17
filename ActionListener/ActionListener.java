import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;

class ActionListenerSetup extends JFrame {
    private ImageIcon icon;
    private Container c;
    private JTextField tf1, tf2;
    ActionListenerSetup(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        icon = new ImageIcon(getClass().getResource("iconImg.png"));
        this.setIconImage(icon.getImage());

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 115, 200, 50);
        c.add(tf2);

        tf1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter Text.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Your Text: " + s);
                }
            }
        });

        tf2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = tf2.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter Text.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Your Text: " + s);
                }
            }
        });

    }
    public static void main(String[] args) {
        ActionListenerSetup frame = new ActionListenerSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        // frame.setLocation(200, 50);
        // frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame Title");
        // frame.setResizable(false);
    }
}

// ActionListener in easy way start
class ActionListenerSetup2 extends JFrame {
    private ImageIcon icon;
    private Container c;
    private JTextField tf1, tf2;
    ActionListenerSetup2(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        icon = new ImageIcon(getClass().getResource("iconImg.png"));
        this.setIconImage(icon.getImage());

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 115, 200, 50);
        c.add(tf2);

        Handler handler = new Handler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);

    }

    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == tf1){
                String s = tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter Text.");
                } 
                else{
                    JOptionPane.showMessageDialog(null, "Your Text: " + s);
                }
            }
            else {
                String s = tf2.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter Text.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Your Text: " + s);
                }
            }
        }
    }

    public static void main(String[] args) {
        ActionListenerSetup2 frame = new ActionListenerSetup2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        // frame.setLocation(200, 50);
        // frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame Title");
        // frame.setResizable(false);
    }
}