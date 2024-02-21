public class UserAccount extends User {
    private int balance;
    private boolean isLoanAvailable;
    private boolean hasLoan;
    private int loanValue;

    public UserAccount(int userId, String firstName, String lastName, String email, boolean sex, int balance, boolean isLoanAvailable, boolean hasLoan, int loanValue) {
        super(userId, firstName, lastName, email, sex);
        this.balance = balance;
        this.isLoanAvailable = isLoanAvailable;
        this.hasLoan = hasLoan;
        this.loanValue = loanValue;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isLoanAvailable() {
        return isLoanAvailable;
    }

    public void setLoanAvailable(boolean loanAvailable) {
        isLoanAvailable = loanAvailable;
    }

    public boolean isHasLoan() {
        return hasLoan;
    }

    public void setHasLoan(boolean hasLoan) {
        this.hasLoan = hasLoan;
    }

    public int getLoanValue() {
        return loanValue;
    }

    public void setLoanValue(int loanValue) {
        this.loanValue = loanValue;
    }

    // own methods

    public String useShowDebitAndLoanInfo() {
        return showDebtAndLoanInfo();
    }
    public int useShowBalanceWithoutLoan() {
        return showBalanceWithoutLoan();
    }
    public int useLoanCheck() {
        return loanCheck();
    }
    public void usePayLoan() {
        payLoan();
    }

    private String showDebtAndLoanInfo() {
        return "hasLoan: " + this.isHasLoan() + ", isLoanAvailable: " + this.isLoanAvailable();
    }

    private int showBalanceWithoutLoan() {
        int balanceWithoutLoan = 0;

        if (this.getLoanValue() > 0) {
            balanceWithoutLoan = this.getBalance() - this.getLoanValue();
        }
        return balanceWithoutLoan;
    }

    private int loanCheck() {
        int result = 0;

        if (this.isLoanAvailable() && this.isHasLoan()) {
            result = this.getLoanValue();
        }
        return result;
    }

    private void payLoan() {
        int newBalance = 0;
        if (this.getBalance() >= this.getLoanValue()) {
            newBalance = this.getBalance() - this.getLoanValue();
            this.setBalance(newBalance);
        }
    }
}
