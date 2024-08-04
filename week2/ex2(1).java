class Student{
public int roll_no;
public String name;
Student(int roll_no,String name)
{
this.roll_no=roll_no;
this.name=name;
}
}

public class Ex2{
public static void main(String[] args)
{
Student[] arr;
arr = new Student[5];
arr[0] = Student(1,"aman");
arr[1] = Student(2,"ben");
arr[2] = Student(3,"ann");
arr[3] = Student(4,"alan");
arr[4] = Student(5,"swathi");
}
}
