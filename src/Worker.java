public class Worker extends User{
    private int workerId;
    private String workerEmail;
    private int wage;
    private int hourOfWorkPerDay;

    public Worker(int userId, String firstName, String lastName, String email, boolean sex, int workerId, String workerEmail, int wage, int hourOfWorkPerDay) {
        super(userId, firstName, lastName, email, sex);
        this.workerId = workerId;
        this.workerEmail = workerEmail;
        this.wage = wage;
        this.hourOfWorkPerDay = hourOfWorkPerDay;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getWorkerEmail() {
        return workerEmail;
    }

    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHourOfWorkPerDay() {
        return hourOfWorkPerDay;
    }

    public void setHourOfWorkPerDay(int hourOfWorkPerDay) {
        this.hourOfWorkPerDay = hourOfWorkPerDay;
    }

    // own methods
    public String useShowWorkerInfo() {
        return showWorkerInfo();
    }
    public String useShowWageAndHourOfWorkPerDay() {
        return showWageAndHourOfWorkPerDay();
    }
    public String useShowEmailAndWorkerEmail() {
        return showEmailAndWorkerEmail();
    }
    public void useAddExtraPayment() {
        addExtraPayment();
    }

    private String showWorkerInfo() {
        return "workerId: " + this.getWorkerId() + ", workerEmail: " + this.getWorkerEmail() + ", wage: " + this.getWage() + ", hourOfWorkPerDay: " + this.getHourOfWorkPerDay();
    }
    private String showWageAndHourOfWorkPerDay() {
        return "wage: " + this.getWage() + ", hourOfWorkPerDay: " + this.getHourOfWorkPerDay();
    }
    private String showEmailAndWorkerEmail() {
        return "email: " + this.getEmail() + ", workerEmail: " + this.getWorkerEmail();
    }
    private void addExtraPayment() {
        int extraPayment = 500;
        if ((this.getHourOfWorkPerDay() * 5) > 40) {
            this.setWage(this.getWage() + extraPayment);
        }
    }
}
