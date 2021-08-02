class Student {
 int rollNo;
 Address add;
// directly call class and one class depends on another class
//The aggregate class contains a reference to another class and is said to have ownership of that class.
public void printData (int roll,Address add){ 
 System.out.println("Roll no "+roll+"address is "+add.flatNo+", "+add.City+", "+add.State);
}
}
class Address{
 int flatNo;
 String City;	
 String State;	

public Address(int flatNo, String City, String State){
	this.flatNo= flatNo;
	this.City=City;
	this.State=State;
}
}

public class TestAggregation extends Student{

public static void main(String []args){
  Address add= new Address(12,"Pune","Maharashtra");
  Student stu= new Student();
  stu.printData(12,add);
}

}
