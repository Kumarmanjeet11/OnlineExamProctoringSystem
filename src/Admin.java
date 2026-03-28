
    import java.util.ArrayList;
    import java.util.Scanner;
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
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter username: ");
    String inputUsername = sc.nextLine();

    System.out.print("Enter password: ");
    String inputPassword = sc.nextLine();

    if (inputUsername.equals(username) && inputPassword.equals(password)) {
        System.out.println("Login successful");
    } else {
        System.out.println("Invalid login");
    }
}
    @Override
    public void logout() {
        System.out.println("Admin logged out");
    }
}
    

