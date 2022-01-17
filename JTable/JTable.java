import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class JTableSetup extends JFrame {
    private Container c;
    private JLabel headingLabel, titleLabel;
    private Font f1, f2;
    private JTable table;
    private JScrollPane scroll;

    private String[] cols = {"ID", "Name", "GPA"};
    private String[][] rows = {
        {"101", "Mutakim Safat", "3.99"},
        {"102", "Rakib Hassan", "2.99"},
        {"103", "Tanvir Hassan", "3.29"},
        {"104", "Ismail Emon", "3.99"},
        {"105", "Fahim Chowdury", "2.99"},
        {"106", "Abdul Mannaf", "3.29"},
        {"107", "Sultan Sulaman", "3.99"},
        {"108", "Bayazid Abu", "2.99"},
        {"109", "Rayan Ahmad", "3.29"}
    };

    JTableSetup(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);
        f1 = new Font("Tahoma", Font.BOLD, 25);
        f2 = new Font("Tahoma", Font.BOLD, 20);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);

        headingLabel = new JLabel("JTable");
        headingLabel.setBounds(300, 20, 200, 30);
        headingLabel.setFont(f1);
        c.add(headingLabel);
        
        titleLabel = new JLabel("Student Details:");
        titleLabel.setBounds(20, 70, 200, 30);
        titleLabel.setFont(f2);
        c.add(titleLabel);

        table = new JTable(rows, cols);
        // table.setSelectionBackground(Color.PINK);
        table.setEnabled(false);

        scroll = new JScrollPane(table);
        scroll.setBounds(40, 130, 600, 150);
        c.add(scroll);

    }

    public static void main(String[] args){
        JTableSetup frame = new JTableSetup();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.setTitle("JTable");
    }
}