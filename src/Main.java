public class Main {
    public static void main(String[] args) {
        int x = 2000;//The amount by which the account is replenished
        int y = 0;//The amount in the account
        int z = x + y;//The amount in the account after replenishment
        int b = x / 100;//The amount bonuses
        if (x > 1000) {
            System.out.println(z + b);
        } else {
            System.out.println(z);
        }
    }
}
