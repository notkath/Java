import java.util.Scanner;
public class Scan{
public static void main(String args[]){
try (Scanner s = new Scanner(System.in)) {
    String userName;
    System.out.println("Enter Username");
    userName=s.nextLine();
    System.out.println("Username is "+userName);
}
}
}
