import java.util.*;
class TestJavaCollection2{
  
 public static void main (String []args){
   LinkedList<Integer> list=new LinkedList<Integer>();  
   list.add(9);
   list.add(3);
   list.add(6);
   list.add(9);
   
   Iterator a=list.iterator();
   while(a.hasNext()){
     System.out.println(a.next());
   }
   
 }
}