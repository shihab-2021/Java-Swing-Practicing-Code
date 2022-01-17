import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;

class FrameDemo1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400, 300);
        // frame.setLocationRelativeTo(null);
        // frame.setLocation(200, 50);
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame Title");
        // frame.setResizable(false);
    }
}
class FrameDemo2 extends JFrame {
    public static void main(String[] args) {
        FrameDemo2 frame = new FrameDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400, 300);
        // frame.setLocationRelativeTo(null);
        // frame.setLocation(200, 50);
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame Title");
        // frame.setResizable(false);
    }
}
class FrameDemo3 extends JFrame {

    FrameDemo3()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(400, 300);
        // setLocationRelativeTo(null);
        // setLocation(200, 50);
        setBounds(200, 50, 400, 300);
        setTitle("Frame Title");
        // setResizable(false);
    }

    public static void main(String[] args) {
        FrameDemo3 frame = new FrameDemo3();
        frame.setVisible(true);
    }
}
// ADD ICON IN JFrame
class ChangeFrameIcon extends JFrame {
    private ImageIcon icon;
    ChangeFrameIcon(){
        initComponents();
    }
    public void initComponents(){
        icon = new ImageIcon(getClass().getResource("iconImg.png"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {
        ChangeFrameIcon frame = new ChangeFrameIcon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400, 300);
        // frame.setLocationRelativeTo(null);
        // frame.setLocation(200, 50);
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame Title");
        // frame.setResizable(false);
    }
}
// Change Background Color
class ChangeBackgroundColor extends JFrame {
    private ImageIcon icon;
    private Container c;
    ChangeBackgroundColor(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setBackground(Color.black);
        icon = new ImageIcon(getClass().getResource("iconImg.png"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {
        ChangeBackgroundColor frame = new ChangeBackgroundColor();
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