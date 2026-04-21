public class GamblingSimulator {
    static final int STAKE = 100;
    static final int BET = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Problem");
        playOneBet();
    }

    public static void playOneBet() {
        int cash = STAKE;

        int outcome = (int) (Math.random() * 2);

        if (outcome == 1) {
            cash += BET;
            System.out.println("Gambler won $1");
        } else {
            cash -= BET;
            System.out.println("Gambler lost $1");
        }

        System.out.println("Current cash: $" + cash);
    }
}