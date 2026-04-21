public class GamblingSimulator {
    static final int STAKE = 100;
    static final int BET = 1;
    static final int WIN_LIMIT = 150;
    static final int LOSS_LIMIT = 50;
    static final int DAYS = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Problem");
        calculateMonthlyResult();
    }

    public static int playForOneDay() {
        int cash = STAKE;

        while (cash > LOSS_LIMIT && cash < WIN_LIMIT) {
            int outcome = (int) (Math.random() * 2);
            if (outcome == 1) {
                cash += BET;
            } else {
                cash -= BET;
            }
        }

        return cash - STAKE;
    }

    public static void calculateMonthlyResult() {
        int totalAmount = 0;

        for (int day = 1; day <= DAYS; day++) {
            totalAmount += playForOneDay();
        }

        System.out.println("Total amount after 20 days: $" + totalAmount);

        if (totalAmount > 0) {
            System.out.println("Gambler won in the month.");
        } else if (totalAmount < 0) {
            System.out.println("Gambler lost in the month.");
        } else {
            System.out.println("No profit and no loss in the month.");
        }
    }
}