import javax.swing.JOptionPane;

class InputDialog1 {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, name + " welcome to java swing.");
    }
}
class InputDialog2 {
    public static void main(String[] args)
    {
        String f_name = JOptionPane.showInputDialog(null, "Enter your first name:", "Title", JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null, "Enter your last name:", "Title", JOptionPane.QUESTION_MESSAGE);

        String name = f_name + " " + l_name;

        JOptionPane.showMessageDialog(null, "Your full name is " + name);
    }
}
class showConfirmDialog {
    public static void main(String[] args)
    {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit this program?", "title", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You are still in the program.");
        }
    }
}