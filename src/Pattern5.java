
import java.util.Scanner;


public class Pattern5 {
   public static void main(String args[]){
   
   int n;
   
   Scanner sc=new Scanner(System.in);
   
   
  n=sc.nextInt();
  int k=1;
  for(int i=0;i<n;i++){
    for(k=1;k<n-i;k++){
    
    System.out.print(" ");
    } 

      for(int j=0;j<n;j++){
          
  System.out.print("*");
  System.out.print(" ");
  }
      
  System.out.println();
  k++;
  
  
   
  }
   } 
}
