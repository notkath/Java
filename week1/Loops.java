public class Loops{
public static void main(String args[]){
int i=0;
int j=0;
int k=0;
while(i<5){
System.out.println(i);
i++;}
System.out.println("");

do{
System.out.println(j);
j++;
}
while(j<5);
System.out.println("");

for(;k<5;k++){
System.out.println(k);}
System.out.println("");

String cars[]={"SUPRA","BMW","GTR","MERCEDES"};
for(String l:cars){
System.out.println(l);
}
}
}
