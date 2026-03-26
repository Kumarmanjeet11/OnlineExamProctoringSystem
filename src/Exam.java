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
class ExamTimer extends Thread {
    int time;

    public ExamTimer(int time) {
        this.time = time;
    }
    @Override
    public void run() {
        try {
            for (int i = time; i > 0; i--) {
                System.out.println("Time left: " + i);
                try {
                    Thread.sleep(1000);  // Intentional sleep in loop for timer countdown
                } catch (InterruptedException e) {
                    System.out.println("Timer interrupted");
                    break;
                }
            }
            System.out.println("Time's up!");
        } catch (Exception e) {
            System.out.println("Timer error: " + e.getMessage());
        }
    }
}
class Proctoring {
    public void detectActivity(boolean switchedTab) {
        if (switchedTab) {
            System.out.println("Warning: Tab switched!");
        }
    }
}

class TimedExam extends Exam {
    Proctoring proctoring;

    public TimedExam(List<Question> questions) {
        super(questions);
        this.proctoring = new Proctoring();
    }

    @Override
    public void startExam() {
        System.out.println("Starting timed exam...");
        ExamTimer timer = new ExamTimer(300);
        timer.start();
        proctoring.detectActivity(false);
        super.startExam();
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
    


