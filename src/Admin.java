
    import java.util.ArrayList;
    class Admin extends User {
    ArrayList<Question> questionBank = new ArrayList<>();    

    public Admin(String username, String password) {
        super(username, password);
    }
     public void addQuestion(Question q) {
        questionBank.add(q);
    }

    @Override
    public void login() {
        System.out.println("Admin logged in: " + username);
    }

    @Override
    public void logout() {
        System.out.println("Admin logged out");
    }
}
    

