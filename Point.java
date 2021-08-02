// this() and super() are used to call constructor explicitly
//using this() yuou can call current class constructor.
//using super() you can call the constructor of the super class.

class A {

 public int x,y;
  public A(int x, int y){
    this.x=x; 
	this.y=y;
  }
}

class B extends A{
  public int x,y;
  
  public B(){
    this(0,0);
  }
  
  public B(int x, int y){
    super(x+1, y+1);  //calls parent class constructor
    this.x=x;
	this.y=y;
  }
  
  public void print(){
    System.out.println("Base class: "+x+","+y);	
	System.out.println("Base class: "+super.x+","+super.y);
  }
}

class Point{
 public static void main(String []args){
   B obj= new B();
   obj.print();
   
   obj=new B(1,2);
   obj.print();
 }

}