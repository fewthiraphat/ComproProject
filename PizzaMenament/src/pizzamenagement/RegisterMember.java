package pizzamenagement;

import java.util.Arrays;
import java.util.Scanner;
//The class that use for  Register the member
public class RegisterMember {

    private int id;
    private String name;
    private int points = 0;
    Member[] member = new Member[1];
    int count = -1;
    Scanner sc = new Scanner(System.in);
    private final int PointToPizza = 100;
    private int getPointsMember = 0;
    private int usagePoints = 0;
    //method for register member
    public void RegisterMember() {
        count++;
        if (count < this.member.length) {
            System.out.println("Name: ");
            String name = sc.next();
            this.name = name;
            System.out.println("ID: ");
            int id = sc.nextInt();
            this.id = id;
            this.member[this.count] = new Member(this.name, this.id, this.points);

        }
        if (this.count >= this.member.length) {
            Member[] m2 = new Member[member.length + 1];
            for (int i = 0; i < this.member.length; i++) {
                m2[i] = this.member[i];
            }
            this.member = m2;
            System.out.println("Name: ");
            String name = sc.next();
            this.name = name;
            System.out.println("ID: ");
            int id = sc.nextInt();
            this.id = id;
            this.member[this.count] = new Member(this.name, this.id, this.points);
        }
    }
    //method use to find member
    public void findMember(String name, int id) {
        for (int i = 0; i <= this.count; i++) {
            if (name == this.member[i].getName() || id == this.member[i].getId()) {
                System.out.println(this.member[i]);
            }
        }
    }
    //method for add the point for member
    public void addPointMemberAt(String name, int id, int points) {
        this.points = points;
        for (int i = 0; i <= this.count; i++) {
            if (name == this.member[i].getName() || id == this.member[i].getId()) {
                this.member[i].setPoints(this.points);
                System.out.println(this.member[i]);
            }
        }
    }
    //method that list for all member
    public void showAllMember() {
        System.out.println(Arrays.toString(member));
    }
    //method that use forv redeem
    public void redeem(String name, int id, int points) {
        this.getPointsMember = points;
        for (int i = 0; i <= this.count; i++) {
            if (name == this.member[i].getName() || id == this.member[i].getId()) {
                if (this.getPointsMember >= 100) {
                    this.member[i].setPoints(-this.getPointsMember);
                    System.out.println("You can Redeem: " + this.getPointsMember / this.PointToPizza);
                } else {
                    System.out.println("You Points Not Enough");
                }
            }
        }
    }
}
