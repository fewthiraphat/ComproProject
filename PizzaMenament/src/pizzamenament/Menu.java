package pizzamenament;

import java.util.Scanner;

public class Menu {
    private double MoneyShop;
    private double money;
    private double TotalPay=0;
    private static Scanner sc=new Scanner(System.in);
    Money a =new Money(0);
//    Money a=new Money(0);
//    private double 
    public void SetMoney(){
        System.out.println("How much money?");
        double i=sc.nextDouble();
        a.SetupMoney(i);
    }
    public void showMenu(){
        int c;
        System.out.print("****Menu****"
                + "\n1.Order"
                + "\n2.Register"
                + "\n3.Member"
                + "\n4.Queue"
                + "\n5.ManageMoney"
                + "\n0.Exits"
                + "\n---> ");
        c=sc.nextInt();
        switch(c){
            case 1:
                Order();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                MenuMoney();
                break;
            case 0:
                break;
        }
    }
    public void Order(){
            int p;
        System.out.print("****Pizza****"
                + "\n1.Pepperoni"
                + "\n2.Veggie"
                + "\n3.Meat and Chease"
                + "\n4.Hawaiian"
                + "\n5.Cheese Pizza"
                + "\n0.Pay"
                + "----->");
        p=sc.nextInt();
        switch(p){
            case 1://kid tang
                this.TotalPay+=229;
                Order();
                break;
            case 2:
                this.TotalPay+=249;
                Order();
                break;
            case 3:
            case 4:
            case 5:
            case 0:
                a.MoneyCustomerMustPay(this.TotalPay);
                System.out.println("Total: "+this.TotalPay);
                MenuPay();
                break;
        }
    }
    public void MenuMoney(){
        System.out.println("\n1.Set Money"
                + "\n2.Sum Money"
                + "\n0.Back to Menu");
        int c=sc.nextInt();
        switch(c){
            case 1:
                System.out.println("Set money Shop: ");
                double i=sc.nextDouble();
                this.MoneyShop=i;
                a.SetupMoney(this.MoneyShop);
                MenuMoney();
                break;
            case 2:
                System.out.println(a.SumMoney());
                MenuMoney();
                break;
            case 0:
                showMenu();
        }
    }
    public void MenuPay(){
        System.out.println("1.Member Menu"
                + "2.Pay");
        int i=sc.nextInt();
        switch(i){
            case 1:
            case 2:
                System.out.print("Enter Money: ");
                double p=sc.nextDouble();
                a.CustomerPay(p);
                if(a.CustomerPay(p)==0){
                    showMenu();
                }
                else if(a.CustomerPay(p)==-1){
                    MenuPay();
                }
                else{
                    System.out.println("Your Change: "+a.CustomerPay(p));
                    showMenu();
                }
        }
    }
    public void MenuMember(){
    } 
}