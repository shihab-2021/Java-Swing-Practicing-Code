import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;

class LabelSetup extends JFrame {
    private ImageIcon icon;
    private Container c;
    private JTextField tf1, tf2;
    LabelSetup(){
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
        tf2.setText("Enter Password");
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);

        // OTHER DESIGNING SYSTEMS ARE AS SAME AS JLabel

    }
    public static void main(String[] args) {
        LabelSetup frame = new LabelSetup();
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