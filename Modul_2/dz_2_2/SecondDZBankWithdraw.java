package Modul_2.dz_2_2;

/**
 * Created by Z570 on 07.02.2017.
 */
public class SecondDZBankWithdraw {
    public static void main(String[] args) {
        double withdrawal_1 = 10.00;
        double withdrawal_2 = 99.00;

        SecondDZBankWithdraw SecondDZBankWithdraw = new SecondDZBankWithdraw();

        SecondDZBankWithdraw.withdrawalCash(withdrawal_1);
        SecondDZBankWithdraw.withdrawalCash(withdrawal_2);


    }

    private void withdrawalCash(double withdrawal){
        double balance = 100;
        double balance_after;
        double commission = withdrawal * 0.05;


        balance_after = balance - (withdrawal + commission);

        if (balance_after >= 0){
            System.out.println("OK " + commission+" "+balance_after );
        }else{
            System.out.println("NO");
        }
        
    }

}
