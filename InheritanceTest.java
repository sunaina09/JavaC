
class Animal{
 int legs=4;

public void Walking(){
  System.out.println("Animal walk on "+ legs+" legs");
}
}


class Bird{
  int nose=2;		
	
public void Eating(){
  System.out.println("Bird eat through "+ nose+" nose");
}	
}


class CatFamily extends Animal{
 String sound= "meow";
 
public void Sound(){
  System.out.println("Cat create a sound "+ sound);
}		
}

class Tiger extends CatFamily{
 String sound= "roar";
 
public void Sound(){	
  System.out.println("tiger create a sound "+ sound);
  super.Sound();
}  
}

class InheritanceTest{
public static void main(String []args){	
  Tiger t= new Tiger();
  t.Walking();
  t.Sound();
}
}