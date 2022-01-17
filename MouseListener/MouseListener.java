import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MouseListenerSetup extends JFrame{
    private Container c;
    private Font f;
    private JButton btn;
    private JTextArea ta;
    private JScrollPane scroll;
    private JLabel heading;

    MouseListenerSetup(){
        initComponent();
    }

    public void initComponent(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);

        f = new Font("Tahoma", Font.BOLD, 20);

        heading = new JLabel("MouseListener Testing");
        heading.setFont(f);
        heading.setBounds(180, 30, 250, 40);
        c.add(heading);

        btn = new JButton("Click");
        btn.setFont(f);
        btn.setBounds(20, 120, 100, 40);
        btn.setBackground(Color.PINK);
        c.add(btn);

        ta = new JTextArea();
        ta.setFont(f);

        scroll = new JScrollPane(ta);
        scroll.setBounds(20, 200, 545, 350);
        c.add(scroll);

        btn.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                ta.append("Mouse Clicked.\n");
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ta.append("Mouse Pressed.\n");
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ta.append("Mouse Released.\n");
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ta.append("Mouse Entered.\n");
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ta.append("Mouse Exited.\n");
                
            }

        });
    }

    public static void main(String[] args){
        MouseListenerSetup frame = new MouseListenerSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setTitle("MouseListener");
    }
}
// Mouse Motion Listener Setup
class MouseMotionListenerSetup extends JFrame{
    private Container c;
    private Font f;
    private JTextArea ta;
    private JTextField tf;
    private JScrollPane scroll;
    private JLabel heading;

    MouseMotionListenerSetup(){
        initComponent();
    }

    public void initComponent(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);

        f = new Font("Tahoma", Font.BOLD, 20);

        heading = new JLabel("MouseMotionListener Testing");
        heading.setFont(f);
        heading.setBounds(100, 30, 300, 40);
        c.add(heading);

        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(100, 130, 300, 40);
        c.add(tf);

        ta = new JTextArea();
        ta.setFont(f);

        scroll = new JScrollPane(ta);
        scroll.setBounds(20, 200, 445, 250);
        c.add(scroll);

        ta.addMouseMotionListener(new MouseMotionListener(){

            @Override
            public void mouseDragged(MouseEvent e) {
                tf.setText("Mouse Dragged " + e.getX() + " " + e.getY());
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                tf.setText("Mouse Event " + e.getX() + " " + e.getY());
                
            }

        });

    }

    public static void main(String[] args){
        MouseMotionListenerSetup frame = new MouseMotionListenerSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("MouseListener");
    }
}
// Focus Listener Setup
class FocusListenerSetup extends JFrame{
    private Container c;
    private Font f;
    private JTextArea ta;
    private JTextField tf;
    private JScrollPane scroll;
    private JLabel heading;

    FocusListenerSetup(){
        initComponent();
    }

    public void initComponent(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);

        f = new Font("Tahoma", Font.BOLD, 20);

        heading = new JLabel("FocusListener Testing");
        heading.setFont(f);
        heading.setBounds(140, 30, 300, 40);
        c.add(heading);

        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(100, 130, 300, 40);
        c.add(tf);

        ta = new JTextArea();
        ta.setFont(f);

        scroll = new JScrollPane(ta);
        scroll.setBounds(20, 200, 445, 250);
        c.add(scroll);

        ta.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                tf.setText("Focus Gained.");
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                tf.setText("Focus Lost.");
                
            }

        });

    }

    public static void main(String[] args){
        FocusListenerSetup frame = new FocusListenerSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("MouseListener");
    }
}
// Window Listener
class WindowListenerSetup extends JFrame{
    private Container c;
    private Font f;
    private JTextArea ta;
    private JTextField tf;
    private JScrollPane scroll;
    private JLabel heading;

    WindowListenerSetup(){
        initComponent();
    }

    public void initComponent(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);

        f = new Font("Tahoma", Font.BOLD, 20);

        heading = new JLabel("WindowListener Testing");
        heading.setFont(f);
        heading.setBounds(140, 30, 300, 40);
        c.add(heading);

        tf = new JTextField("Only for demo");
        tf.setFont(f);
        tf.setBounds(100, 130, 300, 40);
        c.add(tf);

        ta = new JTextArea("Only for demo");
        ta.setFont(f);

        scroll = new JScrollPane(ta);
        scroll.setBounds(20, 200, 445, 250);
        c.add(scroll);

        this.addWindowListener(new WindowListener(){

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened.");
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing.");
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed.");
                
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window Iconified.");
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Deiconified.");
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated.");
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated.");
                
            }

        });

    }

    public static void main(String[] args){
        WindowListenerSetup frame = new WindowListenerSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("MouseListener");
    }
}