import java.util.*;
class TestJavaCollection4{

 public static void main (String []args){
  Deque<String>d= new ArrayDeque<String>();
  d.add("Nobita");
  d.add("Jerry");
  d.add("Shizuka");
  d.add("Tom");
  d.add("Jerry");
  
 System.out.println(d);
  
  Iterator it=d.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }
  
 }
}