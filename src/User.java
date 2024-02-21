public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    //true for man and false for women
    private boolean sex;

    public User(int userId, String firstName, String lastName, String email, boolean sex) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.sex = sex;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    // own methods

    public String useShowUserInfo() {
        return showUserInfo();
    }
    public String useShowUserName() {
        return showUserName();
    }
    public void useGotEngaged(String newLastName) {
        gotEngaged(newLastName);
    }
    public void useDied() {
        died();
    }
    private String showUserInfo() {
        return "UserId: " + this.getUserId() + ", firstName: " + this.getFirstName() + ", lastName: " + this.getLastName() + ", email: " + this.getEmail();
    }
    private String showUserName() {
        return this.getFirstName() + " " + this.getLastName();
    }
    private void gotEngaged(String newLastName) {
        if (!this.isSex()) {
            this.setLastName(newLastName);
        }
    }
    private void died() {
        this.setUserId(0);
        this.setEmail(null);
        this.setLastName(null);
        this.setEmail(null);
    }
}
