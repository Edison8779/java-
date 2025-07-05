import java.util.*;

public class QuizAPP {
    static List<Question> questionList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        loadQuestions();
        int score = 0;

        System.out.println("Welcome to the Quiz App");
        System.out.println("------------------------");

        for (int i = 0; i < questionList.size(); i++) {
            Question q = questionList.get(i);
            System.out.println("\nQ" + (i + 1) + ": ");
            q.displayQuestion();
            System.out.print("Your answer (1-4): ");
            int userAns = sc.nextInt();

            if (q.isCorrect(userAns)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is option " + q.correctOption);
            }
        }

        System.out.println("\nQuiz Completed");
        System.out.println("Your Score: " + score + "/" + questionList.size());
    }

    static void loadQuestions() {
        questionList.add(new Question(
                "What is the capital of France?",
                new String[]{"Berlin", "London", "Paris", "Rome"},
                3
        ));

        questionList.add(new Question(
                "Which language runs in a web browser?",
                new String[]{"Java", "C", "Python", "JavaScript"},
                4
        ));

        questionList.add(new Question(
                "Which company developed Java?",
                new String[]{"Microsoft", "Sun Microsystems", "Google", "Apple"},
                2
        ));

        questionList.add(new Question(
                "What is the extension of Java bytecode files?",
                new String[]{".java", ".class", ".js", ".html"},
                2
        ));

        questionList.add(new Question(
                "Which keyword is used to inherit a class in Java?",
                new String[]{"this", "super", "extends", "implements"},
                3
        ));
    }
}
