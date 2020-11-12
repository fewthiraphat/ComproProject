package pizzamenament;
import java.util.Arrays;
import java.util.Scanner;
public class Member {
    private long Id;
    private long[] member;
    private int b=0;
    private double p;
    private double points;
    RegisterMember id=new RegisterMember();
    Menu a=new Menu();
    public Member(){
        Scanner id=new Scanner(System.in);
        System.out.println("ID Member: ");
        long name=id.nextLong();
        this.Id=name;
    }
    public long getId(){
        return this.Id;
    }
    public long[] getMember(){
        return this.member;
    }
    public void addMember(){
    }
    public void showMember(){
        System.out.println("Member: "+this.member);
    }
}
