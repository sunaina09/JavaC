import java.util.Scanner;
class ParallelogramArea{

static int B, H ;

 static{
  Scanner sc= new Scanner(System.in);
  System.out.println(" the breadth of the parallelogram: ");
  B= sc.nextInt();
  System.out.println(" the height of the parallelogram: ");
  H= sc.nextInt();
 }


 public static void main(String[]args){
  int area= B*H;	
   if (B>0 && H>0){
       System.out.println("area of the parallelogram: "+area);
   }else
       System.out.println("java.lang.Exception: Breadth and height must be positive");
 }

}