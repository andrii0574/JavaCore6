package Module_4.dz_3;

import Module_4.dz_1.Bank;
import Module_4.dz_2.Currency;

/**
 * Created by Z570 on 23.02.2017.
 */
public class EUBank extends Bank {

    private static final int LIMIT_OF_WITHDRAWAL_USD = 2000;
    private static final int LIMIT_OF_WITHDRAWAL_EUR = 2200;
    private static final int LIMIT_OF_FUNDING_USD = 10000;
    private static final int LIMIT_OF_FUNDING_EUR = 20000;
    private static final int MONTHLY_RATE_USD = 0;
    private static final int MONTHLY_RATE_EUR = 1;
    private static final int EUB_COMMISSION_LESS_1000_USD = 5;
    private static final int EUB_COMMISSION_MORE_1000_USD = 7;
    private static final int EUB_COMMISSION_LESS_1000_EUR = 2;
    private static final int EUB_COMMISSION_MORE_1000_EUR = 4;

    public int getLimitOfWithdrawal(){
        int limitOfWithdrawal = 0;
        if(getCurrency() == Currency.USD){
            limitOfWithdrawal = LIMIT_OF_WITHDRAWAL_USD;
        }
        if(getCurrency() == Currency.EUR){
            limitOfWithdrawal = LIMIT_OF_WITHDRAWAL_EUR;
        }
        return limitOfWithdrawal;

    }

    public int getLimitOfFunding(){
        int limitOfFunding = 0;
        if(getCurrency() == Currency.USD){
            limitOfFunding = LIMIT_OF_FUNDING_USD;
        }
        if(getCurrency() == Currency.EUR){
            limitOfFunding = LIMIT_OF_FUNDING_EUR;
        }
        return limitOfFunding;
    }

    public int getMonthlyRate(){
        int monthlyRate = 0;
        if(getCurrency() == Currency.USD){
            monthlyRate = MONTHLY_RATE_USD;
        }
        if(getCurrency() == Currency.EUR){
            monthlyRate = MONTHLY_RATE_EUR;
        }
        return monthlyRate;
    }

    public int getCommission(int summ){
        int commission = 0;
        if((getCurrency() == Currency.USD) && summ < 1000){
            commission = summ / 100 *  EUB_COMMISSION_LESS_1000_USD;
        }
        if((getCurrency() == Currency.USD) && summ >= 1000){
            commission =  summ / 100 * EUB_COMMISSION_MORE_1000_USD;
        }
        if((getCurrency() == Currency.EUR) && summ < 1000){
            commission = summ / 100 *  EUB_COMMISSION_LESS_1000_EUR;
        }
        if((getCurrency() == Currency.EUR) && summ >= 1000){
            commission = summ / 100 *  EUB_COMMISSION_MORE_1000_EUR;
        }
        return commission;
    }


}
