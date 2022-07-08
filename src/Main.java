public class Main {
    public static void main(String[] args) {
        double replenishmentAmount = 1000.5;//The amount by which the account is replenished
        double accountBalance = 0;//The amount in the account
        double balanceAfterReplenishment = replenishmentAmount + accountBalance;//The amount in the account after replenishment
        int bonuses = (int)replenishmentAmount / 100;//The amount bonuses
        if (replenishmentAmount > 1000) {
            System.out.println(balanceAfterReplenishment + bonuses);
        } else {
            System.out.println(balanceAfterReplenishment);
        }
    }
}
