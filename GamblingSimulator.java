public class GamblingSimulator {
    static final int STAKE = 100;
    static final int BET = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Problem");
        startGambling();
    }

    public static void startGambling() {
        int cash = STAKE;
        System.out.println("Starting cash: $" + cash);
        System.out.println("Bet per game: $" + BET);
    }
}