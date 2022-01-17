import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;

class ButtonSetup extends JFrame{
    
    private Container c;
    private JButton btn1, btn2;
    private Cursor cursor;

    ButtonSetup(){
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);

        cursor = new Cursor(Cursor.HAND_CURSOR);// For Cursor setting

        btn1 = new JButton("Submit");
        btn1.setBounds(95, 90, 100, 50);
        btn1.setForeground(Color.BLUE);
        btn1.setBackground(Color.CYAN);
        btn1.setCursor(cursor);// Cursor setup
        c.add(btn1);

        btn2 = new JButton("Clear");
        btn2.setBounds(210, 90, 100, 50);
        btn2.setForeground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.RED);
        c.add(btn2);
    }

    public static void main(String[] args){
        ButtonSetup frame = new ButtonSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Frame Title");
    }
}
// Set Image icon in button
class ButtonSetup2 extends JFrame{
    
    private Container c;
    private JButton btn1, btn2;
    private Cursor cursor;
    private ImageIcon img1, img2;

    ButtonSetup2(){
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);

        cursor = new Cursor(Cursor.HAND_CURSOR);// For Cursor setting

        img1 = new ImageIcon(getClass().getResource("login.png"));
        img2 = new ImageIcon(getClass().getResource("clear.png"));
        // img1.setSize(100, 50);

        btn1 = new JButton(img1);
        btn1.setBounds(95, 90, 100, 50);
        btn1.setCursor(cursor);// Cursor setup
        c.add(btn1);

        btn2 = new JButton(img2);
        btn2.setBounds(210, 90, 100, 50);
        c.add(btn2);
    }

    public static void main(String[] args){
        ButtonSetup2 frame = new ButtonSetup2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Frame Title");
    }
}