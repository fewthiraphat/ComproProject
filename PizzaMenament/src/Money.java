/**
 * class for menage about money
 */
public class Money {
    private double moneyAdmin;
    private double moneyCustomerMustPay;
    public Money(double money){
    }

    /**
     * @param mustpay
     * @return
     * method to tell customer know how much must pay
     */
    public double MoneyCustomerMustPay(double mustpay){
        this.moneyCustomerMustPay=mustpay;
        return this.moneyCustomerMustPay;
    }

    /**
     * @param pay
     * @return
     * method to input how much
     */
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

    /**
     * @return
     * return the money of admin / shop
     */
    public double SumMoney(){
        return this.moneyAdmin;
    }

    @Override
    public String toString() {
        return "Money{" + "moneyAdmin=" + moneyAdmin + ", moneyCustomerMustPay=" + moneyCustomerMustPay + '}';
    }

    /**
     * @param money
     * setup money before open PizzaShop
     */
     public void SetupMoney(double money){
        this.moneyAdmin=money;
    }
}
