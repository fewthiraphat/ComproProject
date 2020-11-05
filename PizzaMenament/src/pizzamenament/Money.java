/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzamenament;

/**
 *
 * @author Fh Lk
 */
public class Money {
    private double moneyAdmin;
    private double moneyCustomerMustPay;
    public Money(double money){
    }
    public double MoneyCustomerMustPay(double mustpay){
        this.moneyCustomerMustPay=mustpay;
        return this.moneyCustomerMustPay;
    }
    public double CustomerPay(double pay){
        if(this.moneyCustomerMustPay==pay){
            return 0;
        }
        else if(this.moneyCustomerMustPay>pay){
            return -1;
        }
        else{
            this.moneyAdmin += this.moneyCustomerMustPay;
            return pay-this.moneyCustomerMustPay;
        }
    }
    public double SumMoney(){
        return this.moneyAdmin;
    }

    @Override
    public String toString() {
        return "Money{" + "moneyAdmin=" + moneyAdmin + ", moneyCustomerMustPay=" + moneyCustomerMustPay + '}';
    }
     public void SetupMoney(double money){
        this.moneyAdmin=money;
    }
}
