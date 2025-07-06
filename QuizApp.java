// Task 8: Online Quiz App by Aanchal Srivastav

import java.util.ArrayList;
import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Question> quiz = new ArrayList<>();

        // Adding quiz questions
        quiz.add(new Question("What is the capital of India?",
                new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"}, 2));

        quiz.add(new Question("Which data type is used to store true/false values in Java?",
                new String[]{"int", "char", "boolean", "String"}, 3));

        quiz.add(new Question("Who is known as the father of Java?",
                new String[]{"Dennis Ritchie", "James Gosling", "Bjarne Stroustrup", "Guido van Rossum"}, 2));

        int score = 0;

        // Display questions and accept answers
        for (Question q : quiz) {
            q.displayQuestion();
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();
            if (q.isCorrect(answer)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
            }
        }

        // Show final score
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + " out of " + quiz.size());
    }
}
