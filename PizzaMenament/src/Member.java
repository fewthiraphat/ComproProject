import java.util.Scanner;
public class Member {
    String name;
    int id;
    int points=0;
    int usagePoints=0;

    /**
     * @param name
     * @param id
     * @param points
     * class for menagement about member
     */
    public Member(String name, int id,int points) {
        this.name = name;
        this.id = id;
        this.points=points;
    }

    /**
     * @return
     * method for get the name of user
     */
    public String getName() {
        return name;
    }

    /**
     * @return
     * method for get the ID of user
     */
    public int getId() {
        return id;
    }
    public int getPoints(){
        return points;
    }

    /**
     * @param points
     * @return
     * method for set the point of user
     */
    public int setPoints(int points) {
        this.points += points;
        return this.points;
    }
    @Override
    public String toString() {
        return "["+"name=" + name + ", id=" + id + ", points=" + this.points+ ']';
    }
}
