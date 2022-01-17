import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

class LabelSetup extends JFrame {
    private ImageIcon icon;
    private Container c;
    private JLabel userLabel;
    LabelSetup(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        icon = new ImageIcon(getClass().getResource("iconImg.png"));
        this.setIconImage(icon.getImage());

        userLabel = new JLabel();
        userLabel.setText("Enter Your Username: ");
        userLabel.setBounds(50, 20, 250, 50);
        c.add(userLabel);

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
// Multiple Label set up
class MultipleLabelSetup extends JFrame {
    private ImageIcon icon;
    private Container c;
    private JLabel userLabel, passLabel;
    MultipleLabelSetup(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        icon = new ImageIcon(getClass().getResource("iconImg.png"));
        this.setIconImage(icon.getImage());

        userLabel = new JLabel();
        userLabel.setText("Enter Your Username: ");
        userLabel.setBounds(50, 20, 150, 50);
        c.add(userLabel);

        passLabel = new JLabel("Enter Your Password: ");
        passLabel.setBounds(50, 70, 150, 50);
        c.add(passLabel);

    }
    public static void main(String[] args) {
        MultipleLabelSetup frame = new MultipleLabelSetup();
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
// Font set up 
class FontSetup extends JFrame {
    private ImageIcon icon;
    private Container c;
    private JLabel userLabel, passLabel;
    private Font f;

    FontSetup(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Arial", Font.BOLD,14);

        icon = new ImageIcon(getClass().getResource("iconImg.png"));
        this.setIconImage(icon.getImage());

        userLabel = new JLabel();
        userLabel.setText("Enter Your Username: ");
        userLabel.setBounds(50, 20, 200, 50);
        userLabel.setOpaque(true); // for showing background color
        userLabel.setBackground(Color.CYAN);
        userLabel.setFont(f);
        c.add(userLabel);

        passLabel = new JLabel("Enter Your Password: ");
        passLabel.setBounds(50, 70, 200, 50);
        passLabel.setForeground(Color.CYAN);
        passLabel.setFont(f);
        passLabel.setToolTipText("Enter a valid password.");
        c.add(passLabel);

    }
    public static void main(String[] args) {
        FontSetup frame = new FontSetup();
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
// Add image in JLabel
class AddImage extends JFrame {
    private ImageIcon icon;
    private Container c;
    private ImageIcon img;
    private JLabel imgLabel;

    AddImage(){
        initComponent();
    }

    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        icon = new ImageIcon(getClass().getResource("iconImg.png"));
        this.setIconImage(icon.getImage());

        img = new ImageIcon(getClass().getResource("labelImg.png"));

        imgLabel = new JLabel(img);
        imgLabel.setBounds(50, 15, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

    }
    public static void main(String[] args) {
        AddImage frame = new AddImage();
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