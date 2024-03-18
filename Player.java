package player;

import java.util.Scanner;

public class Player {
    String name;
    String emailid;
    long contactno;
    String address;
    int age;

    public void userinput() {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the player name");
        this.name = obj.nextLine();
        System.out.println("enter the player address");
        this.address = obj.nextLine();
        System.out.println("enter the player contactno");
        this.contactno = obj.nextLong();
        System.out.println("enter the first player age");
        this.age = obj.nextInt();
        System.out.println("enter the player emailid");
        this.emailid = obj.next();
    }

    public void setPlayerDetails() {
        this.name = name;
        this.emailid = emailid;
        this.contactno = contactno;
        this.address = address;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameemailidcontactno(String name, String emailid, long contactno) {
        this.name = name;
        this.emailid = emailid;
        this.contactno = contactno;
    }

    public String getName() {
        return this.name;
    }

    public void getplayerdetails() {
        System.out.println("Player name is: " + this.name);
        System.out.println("Player address is: " + this.address);
        System.out.println("Player contactno is " + this.contactno);
        System.out.println("Player age is: " + this.age);
        System.out.println("Player emailid is: " + this.emailid);
    }
}
