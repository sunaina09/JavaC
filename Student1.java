//constructor

class Student1{
 int id;        //default value 0
 String name;   //default value null

 Student1(int i, String n){       //creating a parameterized constructor
   id=i;
   name=n;
 }

 void display(){                  //method to display the values
   System.out.println(id+" "+name);
 }

 public static void main(String[] args){

  Student1 s1= new Student1(111,"Karan");        //creating objects & passing values
  Student1 s2= new Student1(222,"Aryan");

  s1.display();                       //calling method to display the values of object   
  s2.display();
 }
} 