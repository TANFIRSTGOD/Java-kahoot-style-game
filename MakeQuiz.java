import javax.swing.JOptionPane;

public class MakeQuiz {
    public static String[] makeQuiz() {

        String quizName = JOptionPane.showInputDialog("Input quiz name");
        String quizDescription = JOptionPane.showInputDialog("Input quiz description");

        String[] newQuiz = {quizName, quizDescription};

        int numOfQuestion = 0;

        boolean makingQuestions = true;

        while (makingQuestions == true) {

            int checkIfNewQuestion = Integer.parseInt(JOptionPane.showInputDialog("(0) continue\n(1) finish questions"));

            String question = JOptionPane.showInputDialog("What is your question?"); //ask user for question

            if (checkIfNewQuestion == 1) {
                if (numOfQuestion < 1) {
                    JOptionPane.showMessageDialog(null, "You can't have a quiz with no questions", "warning", 0); //warning when user trys to make a quiz but has no questions
                }
            }
            else { //check the quesitons

                String optionA = JOptionPane.showInputDialog("enter option A");
                String optionB = JOptionPane.showInputDialog("enter option B");
                String optionC = JOptionPane.showInputDialog("enter option C");
                String optionD = JOptionPane.showInputDialog("enter option D");
                String correctOption = JOptionPane.showInputDialog("enter the correct option\n(A) "+optionA+"\n(B) "+optionB+"\n(C) "+optionC+"\n(D) "+optionD);

                numOfQuestion++; //add 1 more question
            }

        }

        return newQuiz;
    }
}