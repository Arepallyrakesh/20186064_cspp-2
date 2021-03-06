import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
class Quiz {

}
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            /*System.out.println(tokens[1]);*/
            
            
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));

                break;
                case "START_QUIZ":
                /*System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");*/
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        System.out.println(questionCount + " " + "are added to the quiz");
        // tokenize the question line and create the question object
        int count = 1;
        System.out.println("|------------|");
        System.out.println("| Start Quiz |");
        System.out.println("|------------|");
        for (int i = 0; i < questionCount; i++) {
	        String tokens = s.nextLine();
	       	String[] question = tokens.split(":");
         	System.out.println(question[0]+"("+count+")");
         	String[] answer = question[1].split(",");
         	for (int j = 0; j < answer.length; j++) {
         		System.out.print(answer[j]+"	");
         	}
         		System.out.println("\n");
         	count++;
        }




      
        // add the question objects to the quiz class
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions

        
        
        // read the user responses from the console
        // store the user respones in the quiz object
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report

       
    }
}
