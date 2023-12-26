import javax.swing.JOptionPane;

public class MakeQuiz {
    public static void makeQuiz(String quizName, String description) {
        JOptionPane.showMessageDialog(null, quizName, description, 1);
    }
}