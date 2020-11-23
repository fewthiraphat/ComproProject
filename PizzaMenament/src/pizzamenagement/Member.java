package pizzamenagement;

import java.util.Scanner;
public class Member {
    String name;
    int id;
    int points=0;
    int usagePoints=0;
    //
    public Member(String name, int id,int points) {
        this.name = name;
        this.id = id;
        this.points=points;
    }
    public String getName() {
        return name;
    }
    //method for get the name of user by ID
    public int getId() {
        return id;
    }
    //method for get the point of user by ID
    public int getPoints(){
        return points;
    }
    //method for set the point of user by ID
    public int setPoints(int points) {
        this.points += points;
        return this.points;
    }
    //method that use for get data to string
    @Override
    public String toString() {
        return "["+"name=" + name + ", id=" + id + ", points=" + this.points+ ']';
    }
}
