
import java.util.Scanner;

/**
 * class for show menu of program
 */
public class Menu {
    private double moneyCustomerMustPay;
    private double TotalPay=0;
    private int TotalPoinsOrder=0;
    private int getPointMember;
    private static Scanner sc=new Scanner(System.in);
    private RegisterMember r=new RegisterMember();

    /**
     * method for show menu of program
     */
    public void showMenu(){
        int c;
        System.out.print("****Menu****"
                + "\n1.Order"
                + "\n2.Register"
                + "\n3.Member"
                + "\n4.Redeem Point"
                + "\n0.Exits"
                + "\n---> ");
        c=sc.nextInt();
        switch(c){
            case 1:
                Order();
                break;
            case 2:
                r.RegisterMember();
                showMenu();
                break;
            case 3:
                r.showAllMember();
                showMenu();
                break;
            case 4:
                MenuPoint();
                break;
            case 0:
                break;
        }
    }

    /**
     * method for show order menu of program
     */
    public void Order(){
        int p;
        System.out.print("****Pizza****"
                + "\n1.Pepperoni"
                + "\n2.Veggie"
                + "\n3.Meat and Chease"
                + "\n4.Hawaiian"
                + "\n5.Cheese Pizza"
                + "\n0.Pay"
                + "\n9.Cancel"
                + "\n----->");
        p=sc.nextInt();
        switch(p){
            case 1://kid tang
                this.TotalPay+=229;
                this.TotalPoinsOrder+=100;
                Order();
                break;
            case 2:
                this.TotalPay+=249;
                this.TotalPoinsOrder+=100;
                Order();
                break;
            case 3:
                this.TotalPay+=249;
                this.TotalPoinsOrder+=100;
                Order();
                break;
            case 4:
                this.TotalPay+=239;
                this.TotalPoinsOrder+=100;
                Order();
                break;
            case 5:
                this.TotalPay+=199;
                this.TotalPoinsOrder+=100;
                Order();
                break;
            case 9:
                this.TotalPay=0;
                this.TotalPoinsOrder=0;
                showMenu();
            case 0:
//                a.MoneyCustomerMustPay(this.TotalPay);
                System.out.println("Total: "+this.TotalPay);
                MenuPay();
                break;
        }
    }

    /**
     * method for pay menu of program
     */
    public void MenuPay(){
        System.out.println("1.Member Menu"
                + "\n2.Pay"
                + "\n---->");
        int i=sc.nextInt();
        switch(i){
            case 1:
                MenuMember();
                break;
            case 2:
                double change;
                System.out.print("Enter Money: ");
                double p=sc.nextDouble();
                this.moneyCustomerMustPay=p;
                if(this.moneyCustomerMustPay==this.TotalPay){
                    System.out.println("Change: "+(p-this.TotalPay));
                    reset();
                    showMenu();
                }
                else if(this.moneyCustomerMustPay>this.TotalPay){
                    System.out.println("Change: "+(p-this.TotalPay));
                    reset();
                    showMenu();
                }
                else{
                    System.out.println("Not Enouugh Money");
                    MenuPay();
                }
                break;
        }
    }

    /**
     * method for show menu of member
     */
    public void MenuMember(){
        int points;
        System.out.print("Enter Name: ");
        String name=sc.next();
        System.out.print("Enter ID: ");
        int id=sc.nextInt();
        points=this.TotalPoinsOrder;
        r.findMember(name, id);
        System.out.println("Add Points: +"+this.TotalPoinsOrder);
        r.addPointMemberAt(name, id, points);
        System.out.print("Enter Money: ");
        double p=sc.nextDouble();
        this.moneyCustomerMustPay=p;
        if(p==this.TotalPay){
            System.out.println("Change: "+(p-this.TotalPay));
            reset();
            showMenu();
        }
        else if(p>this.TotalPay){
            System.out.println("Change: "+(p-this.TotalPay));
            reset();
            showMenu();
        }
        else{
            System.out.println("Not Enouugh Money");
            MenuPay();
        }
    }

    /**
     * metohd for reset the data of program
     */
    public void reset(){
        this.TotalPay=0;
        this.TotalPoinsOrder=0;
    }

    /**
     * method for set the data for member
     */
    public void MenuPoint(){
        System.out.println("*****Points*****");
        System.out.print("Enter Name: ");
        String name =sc.next();
        System.out.print("Enter ID: ");
        int id=sc.nextInt();
        r.findMember(name, id);
        System.out.print("Enter Points: ");
        int points=sc.nextInt();
        this.getPointMember=points;
        r.redeem(name, id, this.getPointMember);
        r.findMember(name, id);
        showMenu();
    }
}