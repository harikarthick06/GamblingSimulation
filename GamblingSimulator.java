public class GamblingSimulator {
    static final int STAKE = 100;
    static final int BET = 1;
    static final int WIN_LIMIT = 150;
    static final int LOSS_LIMIT = 50;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Problem");
        playForOneDay();
    }

    public static void playForOneDay() {
        int cash = STAKE;

        while (cash > LOSS_LIMIT && cash < WIN_LIMIT) {
            int outcome = (int) (Math.random() * 2);

            if (outcome == 1) {
                cash += BET;
            } else {
                cash -= BET;
            }
        }

        if (cash == WIN_LIMIT) {
            System.out.println("Gambler won for the day.");
        } else {
            System.out.println("Gambler lost for the day.");
        }

        System.out.println("End of day cash: $" + cash);
    }
}