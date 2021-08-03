import java.util.*;
class TestJavaCollection1{

 public static void main (String []args){
   ArrayList <String> list= new ArrayList <String>();
   list.add("Shizuka");
   list.add("Nobita");
   list.add("Suneo");
   list.add("Nobita");
   
   Iterator it=list.iterator();
   while(it.hasNext()){
    System.out.println(it.next());
   }
 }


}