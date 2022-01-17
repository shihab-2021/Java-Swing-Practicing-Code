import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

// TO RUN THE CODE AT FIRST HAVE TO COMPILE THE FILE.
// TO COMPILE THE FILE WE HAVE TO WRIGHT : javac MessageDialog.java
// THEN WE HAVE TO RUN ANY SPECIFIC CLASS NAME IF WE WANT.
// TO RIN ANY SPECIFIC CLASS WE HAVE TO WRIGHT : java MessageDialog3

class MessageDialog1 {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Wrong Password.");
    }
}
class MessageDialog2 {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Who are you?", "Question", JOptionPane.QUESTION_MESSAGE);
    }
}
class MessageDialog3 {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Wrong Password.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
class MessageDialog4 {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Who are you?", "Warning", JOptionPane.WARNING_MESSAGE);
    }
}
class MessageDialog5 {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Who are you?", "With no icon", JOptionPane.PLAIN_MESSAGE);
    }
}
class MessageDialog6 {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Who are you?", "With no icon", -1);
        // PLAIN_MESSAGE = -1
        // ERROR_MESSAGE = 0
        // INFORMATION_MESSAGE = 1
        // WARNING_MESSAGE = 2
        // QUESTION_MESSAGE = 3
    }
}
class MessageDialog7 {
    public static void main(String[] args)
    {
        ImageIcon img = new ImageIcon("imgIcon.png");
        JOptionPane.showMessageDialog(null, "Who are you?", "With no icon", JOptionPane.PLAIN_MESSAGE, img);
    }
}