package pizzamenagement;
public class Money {
    private double moneyAdmin;
    private double moneyCustomerMustPay;
    public Money(double money){
    }
    //For tell customer how much they must pay
    public double MoneyCustomerMustPay(double mustpay){
        this.moneyCustomerMustPay=mustpay;
        return this.moneyCustomerMustPay;
    }
    //For input the customer pay
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
    //method for check the money of the admin
    public double SumMoney(){
        return this.moneyAdmin;
    }

    @Override
    //method for get the string  data of money
    public String toString() {
        return "Money{" + "moneyAdmin=" + moneyAdmin + ", moneyCustomerMustPay=" + moneyCustomerMustPay + '}';
    }
    //method for setup the money before open the shop
     public void SetupMoney(double money){
        this.moneyAdmin=money;
    }
}
