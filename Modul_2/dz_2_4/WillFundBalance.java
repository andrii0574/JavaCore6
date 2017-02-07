package Modul_2.dz_2_4;

/**
 * Created by Z570 on 07.02.2017.
 */
public class WillFundBalance {
    public static void main(String[] args) {
        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        WillFundBalance willFundBalance = new WillFundBalance();
        willFundBalance.fundBalance(ownerNames[3], 100, balances, ownerNames);
    }

    private void fundBalance(String name, double willfund, double[] balances, String[] ownerNames){
        double balance;
        double balance_after;
        for (int i = 0; i < ownerNames.length; i++) {
            if(name.equals(ownerNames[i])) {
                for (int j = 0; j < balances.length; j++) {
                    if (j == i) {
                        balance =  balances[j];
                        balance_after = balance + willfund;
                        balances[j] = balance_after;

                        System.out.println(name +" "+ balances[j]);

                    }
                }
            }
        }
    }
}
