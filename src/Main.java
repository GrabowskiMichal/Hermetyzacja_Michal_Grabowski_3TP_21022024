public class Main {
    public static void main(String[] args) {
        User userOne = new User(1, "Jacob", "Żelechowski", "jacob.zelechowski@lewica.pl", true);
        User userTwo = new User(2, "John", "Doe", "john.doe@gmail.com", true);
        User userThree = new User(3, "Dominica", "Kovalsky", "dominica.kovalsky@gmail.com", false);
        User userFour = new User(4, "Jan", "Kowalski", "jan.kowalski@gmail.com", true);

        Worker workerOne = new Worker(userOne.getUserId(), userOne.getFirstName(), userOne.getLastName(), userOne.getEmail(), userOne.isSex(), 1,"jacob.zelechowski@lewicabanksa.pl", 2000, 14);
        Worker workerTwo = new Worker(userTwo.getUserId(), userTwo.getFirstName(), userTwo.getLastName(), userTwo.getEmail(), userTwo.isSex(), 2,"john.doe@banksa.com", 10000, 8);
        Worker workerThree = new Worker(userThree.getUserId(), userThree.getFirstName(), userThree.getLastName(), userThree.getEmail(), userThree.isSex(), 3,"dominica.kovalsky@lewicabanksa.pl", 5500, 10);
        Worker workerFour = new Worker(userFour.getUserId(), userFour.getFirstName(), userFour.getLastName(), userFour.getEmail(), userFour.isSex(), 1,"jan.kowalski@polska.com", 15000, 8);

        UserAccount userAccountOne = new UserAccount(userOne.getUserId(), userOne.getFirstName(), userOne.getLastName(), userTwo.getEmail(), userOne.isSex(), 12394, false, false, 0);
        UserAccount userAccountTwo = new UserAccount(userTwo.getUserId(), userTwo.getFirstName(), userTwo.getLastName(), userTwo.getEmail(), userTwo.isSex(), 123394, true, false, 0);
        UserAccount userAccountThree = new UserAccount(userThree.getUserId(), userThree.getFirstName(), userThree.getLastName(), userThree.getEmail(), userThree.isSex(), 229312, true, true, 1200);
        UserAccount userAccountFour = new UserAccount(userFour.getUserId(), userFour.getFirstName(), userFour.getLastName(), userFour.getEmail(), userFour.isSex(), 231234, true, false, 0);

        System.out.println(userOne.useShowUserInfo());
        System.out.println(userOne.useShowUserName());
        userOne.useGotEngaged("Kubowski");
        userTwo.useDied();

        System.out.println(workerOne.useShowWorkerInfo());
        System.out.println(workerOne.useShowWageAndHourOfWorkPerDay());
        System.out.println(workerOne.useShowEmailAndWorkerEmail());
        workerOne.useAddExtraPayment();

        System.out.println(userAccountOne.useShowDebitAndLoanInfo());
        System.out.println(userAccountOne.useShowBalanceWithoutLoan());
        System.out.println(userAccountOne.useLoanCheck());
        userAccountOne.usePayLoan();
    }
}