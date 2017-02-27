package Module_4.dz_3;

import Module_4.dz_1.Bank;
import Module_4.dz_2.Currency;

/**
 * Created by Z570 on 23.02.2017.
 */
public class USBank extends Bank{

    private static final int LIMIT_OF_WITHDRAWAL_USD = 1000;
    private static final int LIMIT_OF_WITHDRAWAL_EUR = 1200;
    private static final int LIMIT_OF_FUNDING_USD = Integer.MAX_VALUE;
    private static final int LIMIT_OF_FUNDING_EUR = 10000;
    private static final int MONTHLY_RATE_USD = 1;
    private static final int MONTHLY_RATE_EUR = 2;
    private static final int USB_COMMISSION_LESS_1000_USD = 5;
    private static final int USB_COMMISSION_MORE_1000_USD = 7;
    private static final int USB_COMMISSION_LESS_1000_EUR = 6;
    private static final int USB_COMMISSION_MORE_1000_EUR = 8;

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
            commission = summ / 100 * USB_COMMISSION_LESS_1000_USD;
        }
        if((getCurrency() == Currency.USD) && summ >= 1000){
            commission = summ / 100 *  USB_COMMISSION_MORE_1000_USD;
        }
        if((getCurrency() == Currency.EUR) && summ < 1000){
            commission = summ / 100 *  USB_COMMISSION_LESS_1000_EUR;
        }
        if((getCurrency() == Currency.EUR) && summ >= 1000){
            commission = summ / 100 *  USB_COMMISSION_MORE_1000_EUR;
        }
        return commission;
    }


}
