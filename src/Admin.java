
    class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
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
    

