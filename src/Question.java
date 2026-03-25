class Question {
    String questionText;
    String[] options;
    int correctAnswer;

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void display() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + ": " + options[i]);
        }
    }
}
