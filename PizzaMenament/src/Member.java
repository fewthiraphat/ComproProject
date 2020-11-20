

import java.util.Scanner;
public class Member {
    String name;
    int id;
    int points=0;
    int usagePoints=0;
//    private RegisterMember m=new RegisterMember();
    public Member(String name, int id,int points) {
        this.name = name;
        this.id = id;
        this.points=points;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public int getPoints(){
        return points;
    }

    public int setPoints(int points) {
        this.points += points;
        return this.points;
    }
    @Override
    public String toString() {
        return "["+"name=" + name + ", id=" + id + ", points=" + this.points+ ']';
    }
}
