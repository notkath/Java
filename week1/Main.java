public class Main{
public static void main(String args[]){
System.out.println("Hello world");
final int num=15;
System.out.println(num);
double num1=num;//widening typecasting
System.out.println(num1);
double doublenum=9.87d;
int myint=(int)doublenum; //Explicit casting: double to int[narrow typecasting]
System.out.println(doublenum);
System.out.println(myint);

int a=15;
int b=16;
int c=a+b; //adding 2 numbers
System.out.println(c);

int x;
String y;
x=20;
y=(x==1)?"correct":"wrong";// ternary operator
System.out.println(y);

String random="ABCDEFGHIJKLMNOPQRSTUVWXYZZYXWVUTSRQPONMLKJIHGFEDCBA";
System.out.println("The length of the string random is "+random.length());//length function

String a1="AsDDsdsbvrkdsWE";
System.out.println("lowercase of a1 is:- "+a1.toLowerCase());//lowercase function
System.out.println("luppercase of a1 is:- "+a1.toUpperCase());//uppercasefunction

String txt="Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate"));
}}
