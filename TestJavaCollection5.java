import java.util.*;
class TestJavaCollection5{

 public static void main (String []args){
 
  TreeSet<String> t=new TreeSet<String>();
  t.add("Nobita");
  t.add("Jerry");
  t.add("Shizuka");
  t.add("Tom");
		  
  Iterator i=t.iterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
 
 
 
 }
} 