import javax.swing.JOptionPane;

public class MakeQuiz {
    public static String[] makeQuiz() {

        String quizName = JOptionPane.showInputDialog("Input quiz name");
        String quizDescription = JOptionPane.showInputDialog("Input quiz description");

        String[] newQuiz = {quizName, quizDescription};

        boolean makingQuestions = true;

        while (makingQuestions == true) {
            String question = JOptionPane.showInputDialog("What is your question?\ntype (exit) to go back");
            String optionA = JOptionPane.showInputDialog("enter option A");
            String optionB = JOptionPane.showInputDialog("enter option B");
            String optionC = JOptionPane.showInputDialog("enter option C");
            String optionD = JOptionPane.showInputDialog("enter option D");
            String correctOption = JOptionPane.showInputDialog("enter the correct option\n(A) "+optionA+"\n(B) "+optionB+"\n(C) "+optionC+"\n(D) "+optionD);
        }

        return newQuiz;
    }
}