class Ex12{
public static void main(String args[])
{
int intArray[][]={{1,2,3},{4,5,6}};
int cloneArray[][]=intArray.clone();
System.out.println(intArray==cloneArray);
System.out.println(intArray[0]==cloneArray[0]);
System.out.println(intArray[1]==cloneArray[1]);
}}
