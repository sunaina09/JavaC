import java.util.*;
class TestJavaCollection3{
  
 public static void main (String []args){
 Vector<String> v= new Vector<String>();
 v.add("Shinchan");
 v.add("Doraemon");
 v.add("Tom and Jerry");
 v.add("Shinchen");
 
 System.out.println(v.get(2));
 
  Iterator it=v.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }
  
  Stack <Character> s= new Stack<Character>();
  s.push('P');
  s.push('Q');
  s.push('R');
  s.push('S'); 
  s.push('R');
  
  Iterator i=s.iterator();
  while (i.hasNext()){
	  System.out.println(i.next());
  }
 }
} 