import javax.swing.JOptionPane;

public class MakeQuiz {
    public static String[] makeQuiz() {

        String quizName = JOptionPane.showInputDialog("Input quiz name");
        String quizDescription = JOptionPane.showInputDialog("Input quiz description");

        String[] newQuiz = {quizName, quizDescription};

        return newQuiz;
    }
}