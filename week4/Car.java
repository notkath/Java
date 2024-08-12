public class Car{
public void full_throttle(){
System.out.println("The car is going as fast as it can!");
}
public void speed(int maxSpeed){
System.out.println("Max speed is: "+maxSpeed+" kmph");
}
public static void main(String args[])
{
Car myCar = new Car();
myCar.full_throttle();
myCar.speed(200);
}
    }
