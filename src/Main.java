public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("admin","123");
        if(!admin.login()){
            System.out.println("Access denied!");
            return;
        }
        Question q1 = new Question ("what is 2 + 2 = ?", new String[]{"1","2","3","4",},4);
        admin.addQuestion(q1);
        Question q2 = new Question ("Which language is used for android development ?",new String[]{"python","java","C++","HTML"},2);
        admin.addQuestion(q2);
        Question q3 = new Question ("Which data structure uses FIFO?",new String[]{"Stack","Queue","Tree","Graph"},2);
        admin.addQuestion(q3);
        Exam exam = new Exam(admin.questionBank);
        ExamTimer timer = new ExamTimer(15);
        timer.start();

        exam.startExam();

        int result = exam.calculateResult();
        System.out.println("Score: " + result);
    }
}
       