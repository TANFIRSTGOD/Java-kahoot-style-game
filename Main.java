import javax.swing.JOptionPane;

public class Main {

    //messageType: 0 == x, 1 == info

    static String[][] quizzes = {{"default", "default quiz", "what is 1 + 1"}}; //create the quiz array
    static String windowTitle = "Trash kahoot";

    public static int quit() { //method for quitting
        int option = Integer.parseInt(JOptionPane.showInputDialog("Are you sure you want to quit \n(0) y\n(1) n"));

        if (option == 0){
            System.exit(0); //check if user wants to quit
        }

        return 0;
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to my bad kahoot clone", windowTitle, 1); //welcome message
            
        boolean inMainmenue = true; //createa variable to check if in main menue

            while (inMainmenue) {

                int usrOption = Integer.parseInt(JOptionPane.showInputDialog("(1) create quiz\n(2) play quiz\n(3) quit app")); //get usr input

                System.out.println(usrOption); //prints out usr option

                if (usrOption == 1){ //code if usr chooses to create a quiz
                    System.out.println("Create quiz");
                    MakeQuiz.makeQuiz();
                }
                else if (usrOption == 2){ //code when usr chooses to play a quiz
                    System.out.println("Played quiz");
                }
                else if (usrOption == 3){ //check when ur quits
                    System.out.println("Quit");
                    quit();
                }

            }

    }
}