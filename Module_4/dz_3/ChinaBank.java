package Module_4.dz_3;

import Module_4.dz_1.Bank;
import Module_4.dz_2.Currency;

/**
 * Created by Z570 on 23.02.2017.
 */
public class ChinaBank extends Bank {

    public int getLimitOfWithdrawal(){
        int limitOfWithdrawal = 0;
        if(getCurrency() == Currency.USD){
            limitOfWithdrawal = 100;
        }
        if(getCurrency() == Currency.EUR){
            limitOfWithdrawal = 150;
        }
        return limitOfWithdrawal;

    }

    public int getLimitOfFunding(){
        int limitOfFunding = 0;
        if(getCurrency() == Currency.USD){
            limitOfFunding = 10000;
        }
        if(getCurrency() == Currency.EUR){
            limitOfFunding = 5000;
        }
        return limitOfFunding;
    }

    public int getMonthlyRate(){
        int monthlyRate = 0;
        if(getCurrency() == Currency.USD){
            monthlyRate = 1;
        }
        if(getCurrency() == Currency.EUR){
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    public int getCommission(int summ){
        int commission = 0;
        if((getCurrency() == Currency.USD) && summ < 1000){
            commission = summ / 100 *  3;
        }
        if((getCurrency() == Currency.USD) && summ >= 1000){
            commission = summ / 100 *  5;
        }
        if((getCurrency() == Currency.EUR) && summ < 1000){
            commission = summ / 100 *  10;
        }
        if((getCurrency() == Currency.EUR) && summ >= 1000){
            commission = summ / 100 *  11;
        }
        return commission;
    }

}
