import javax.swing.JOptionPane;

public class MakeQuiz {
    public static String[] makeQuiz() {
        String[] newQuiz = {};

        String quizName = JOptionPane.showInputDialog("Input quiz name");
        String quizDescription = JOptionPane.showInputDialog("Input quiz description");

        return newQuiz;
    }
}