import java.util.*;

class TestJavaCollection6{

 public static void main (String []args){
   Map map= new HashMap();
   map.put(1,"Java");
   map.put(2,"JavaScript");
   map.put(3,"Python");
   map.put(4,"C#");
   
   Set set=map.entrySet();
   Iterator i =set.iterator();
   
   while(i.hasNext()){
	   Map.Entry entry= (Map.Entry)i.next();
	  System.out.println(entry.getKey()+" "+entry.getValue()); 
   }
 }
} 