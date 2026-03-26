class Student extends User {

    public Student(String username, String password) {
        super(username, password);
    }

    @Override
    public void login() {
        try{
            if (username.isEmpty()) {
            throw new InvalidLoginException("Username cannot be empty");
        }
        System.out.println("Login successful");
    } catch (InvalidLoginException e) {
        System.out.println(e.getMessage());
    }
        }
    @Override
    public void logout() {
        System.out.println("Student logged out");
    }
   class InvalidLoginException extends Exception {
    public InvalidLoginException(String msg) {
        super(msg);
    }
   }
}
