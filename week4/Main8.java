public class Main8{
static void myStaticMethod(){
System.out.println("Static methods can be called without creating object");
}

public void myPublicMethod(){
System.out.println("Public methods must be called by creating object");
}
public static void main(String arg[]){
myStaticMethod();
Main8 myObj = new Main8();
myObj.myPublicMethod();
}
}
