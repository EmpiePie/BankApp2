package bankapp;

import accounts.*;

public class Main {

    public static void main(String[] args) {
        SilverCheckingAccount silver = new SilverCheckingAccount(5000,0.025,1000);
        GoldCheckingAccount gold = new GoldCheckingAccount(5000,0.025,1000);
        PlatinumCheckingAccount plat = new PlatinumCheckingAccount(5000,0.025,1000);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(plat.getRewardPoints());

        silver.purchase(50);
        gold.purchase(50);
        plat.purchase(50);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(plat.getRewardPoints());



    }
}
