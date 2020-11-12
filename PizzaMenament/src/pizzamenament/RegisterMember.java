package pizzamenament;

import java.util.Scanner;

public class RegisterMember {
    private long id;
    private static Scanner sc=new Scanner(System.in);
    public RegisterMember(){
        System.out.println("ID Person:");
        long id=sc.nextLong();
        this.id=id;
    }
    public long getId() {
        return this.id;
    }
    
}
