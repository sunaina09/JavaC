/* Constructor chaining 
Calling a constructor from the another constructor of same class is known as Constructor chaining */

public class Myclass{

 String name;
 int age;
 
 Myclass (){
   this("BeginnersBook.com");
 }
 
 Myclass (String s){
   this(s,6);
   //System.out.println("String is "+s +"\n age is " +age);
 }
 
 Myclass(String s,int age){
   this.name=s;
   this.age=age; 
   System.out.println("String is "+s +"\n age is " +age);
 }
 
 public static void main(String[]args){
   Myclass obj=new Myclass();
 }

}