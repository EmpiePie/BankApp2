package accounts;

public class PlatinumCheckingAccount extends CheckingAccount {
    public PlatinumCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        int rewards = 0;

        if (cost > 500){
            rewards += (cost - 500) * 80;
            cost = 500;
        }
        if (cost > 100){
            rewards += (cost - 100) * 65;
            cost = 100;
        }
        rewards += cost * 40;
        return rewards;
    }
}
