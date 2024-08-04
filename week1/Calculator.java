import java.util.Scanner;
public class Calculator{
public static void main(String args[]){
try (Scanner s = new Scanner(System.in)) {
    int a,b,option;
    int program=1;
    while(program==1){
    System.out.println("Enter 1st number: ");
    a=s.nextInt();
    System.out.println("Enter 2nd number: ");
    b=s.nextInt();
    System.out.println("Options:-");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Modullo");
    System.out.println("6. Exit");
    option=s.nextInt();
    switch(option){
    case 1:
    System.out.printf("%d\n",a+b);break;
    case 2:
    System.out.printf("%d\n",a-b);break;
    case 3:
    System.out.printf("%d\n",a*b);break;
    case 4:
    System.out.printf("%d\n",a/b);break;
    case 5:
    System.out.printf("%d\n",a%b);break;
    case 6:
    program=0;
    
    }
    }
}
}
}
