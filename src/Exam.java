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

class TimedExam extends Exam {
    public TimedExam(List<Question> questions) {
        super(questions);
    }

    @Override
    public void startExam() {
        System.out.println("Starting timed exam...");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Exam system initialized");
        List<Question> questions = new ArrayList<>();
        TimedExam exam = new TimedExam(questions);
        exam.startExam();
    }
}
    


