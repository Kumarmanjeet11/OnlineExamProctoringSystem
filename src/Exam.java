import java.util.*;

class Exam {

    List<Question> questions;
    Map<Question, Integer> answers = new HashMap<>();

    public Exam(List<Question> questions) {
        this.questions = questions;
    }


    public void startExam() {
        try (Scanner sc = new Scanner(System.in)){
            for (Question q : questions) {
                q.display();
                System.out.print("Enter answer:");
                int ans = sc.nextInt();
                answers.put(q, ans);
            }
        }
    }

    public int calculateResult() {
        int score = 0;
        for (Question q : questions) {
            if (answers.get(q) == q.correctAnswer) {
                score++;
            }
        }
        return score;
    }
}
    

