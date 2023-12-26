import javax.swing.JOptionPane;

public class Main {

    //messageType: 0 == x, 1 == info

    static String[] quizzes = {"Default"};
    static String windowTitle = "Trash kahoot";

    public static void quit() {
        JOptionPane.showMessageDialog(null, "Quitting", windowTitle, 1);
        System.exit(0);
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to my bad kahoot clone", windowTitle, 1);
            
        String usrOption = JOptionPane.showInputDialog("(1) create quiz\n(2) play quiz\n(3) quit app"); //get usr input

        System.out.println(usrOption);

    }
}