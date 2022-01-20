import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JMenuSetup extends JFrame implements ActionListener {
    private Container c;
    private JMenuBar menubar;
    private JMenu file, edit, help;
    private JMenuItem newItem, openItem, exitItem, cutItem, copyItem, pasteItem, selectAllItem;
    private ImageIcon cutIcon;

    JMenuSetup(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);
        cutIcon = new ImageIcon("/cut.png");

        menubar = new JMenuBar();
        this.setJMenuBar(menubar);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);

        newItem = new JMenuItem("New");
        newItem.setIcon(cutIcon);
        openItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");
        cutItem = new JMenuItem("Cut");
        cutItem.setIcon(cutIcon);
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        selectAllItem = new JMenuItem("Select All");

        file.add(newItem);
        file.add(openItem);
        file.add(exitItem);
        edit.add(cutItem);
        edit.addSeparator();
        edit.add(cutItem);
        edit.addSeparator();
        edit.add(copyItem);
        edit.add(pasteItem);
        edit.add(selectAllItem);

        newItem.addActionListener(this);
        exitItem.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newItem){
            JFrame newFrame = new JFrame();
            newFrame.setVisible(true);
            newFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            newFrame.setSize(300,300);
            newFrame.setLocationRelativeTo(null);
            newFrame.setTitle("New Frame");
        }
        else if(e.getSource() == exitItem){
            System.exit(0);
        }
        
    }

    public static void main(String[] args){
        JMenuSetup frame = new JMenuSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("JMenu");
    }
}