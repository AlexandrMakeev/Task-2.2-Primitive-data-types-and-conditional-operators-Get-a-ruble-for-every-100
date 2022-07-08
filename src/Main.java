public class Main {
    public static void main(String[] args) {
        int replenishmentAmount = 2000;//The amount by which the account is replenished
        int accountBalance = 0;//The amount in the account
        int balanceAfterReplenishment = replenishmentAmount + accountBalance;//The amount in the account after replenishment
        int bonuses = replenishmentAmount / 100;//The amount bonuses
        if (replenishmentAmount > 1000) {
            System.out.println(balanceAfterReplenishment + bonuses);
        } else {
            System.out.println(balanceAfterReplenishment);
        }
    }
}
