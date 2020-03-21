
import java.util.Scanner;


public class Pattern3 {
  public static void main(String args[])  {
  
  int n ,i=0;
  Scanner sc=new Scanner (System.in);
  n=sc.nextInt();
  while(i<n){
      System.out.print("* ");
   i++;
  }
  System.out.println();
for(int j=0;j<n-2;j++){
    for(int k=1;k<=n;k++){
if(k==1 ||k==n){
    System.out.print("* ");
}
else{

System.out.print("  ");
}
    }
 System.out.println();

 
}
i=0;
 while(i<n){
      System.out.print("* ");
   i++;
  } 
  }
}
