package Modul_2.dz_2_3;

/**
 * Created by Z570 on 07.02.2017.
 */
public class WithdrawalCashWithNameOfClient {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        WithdrawalCashWithNameOfClient withdrawalCashWithNameOfClient = new WithdrawalCashWithNameOfClient();
        withdrawalCashWithNameOfClient.getCashWithName(ownerNames[1], 100, balances, ownerNames);
        withdrawalCashWithNameOfClient.getCashWithName(ownerNames[3], 490, balances, ownerNames);

    }

    private void getCashWithName(String name, double withdrawal, int[] balances, String[] ownerNames){
        double balance;
        double commission;
        double balance_after;
        for (int i = 0; i < ownerNames.length; i++) {
            if(name.equals(ownerNames[i])) {
                for (int j = 0; j < balances.length; j++) {
                    if (j == i) {
                        balance =  balances[j];
                        commission = withdrawal * 0.05;
                        balance_after = balance - (withdrawal + commission);

                        if (balance_after >= 0){
                            System.out.println(name +" " + withdrawal+" "+balance_after );
                        }else{
                            System.out.println(name +" NO");
                        }
                    }
                }
            }
        }

    }
}
