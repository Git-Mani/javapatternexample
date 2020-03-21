
import java.util.Scanner;


public class HollowRhobus {
  public  static void main(String args[]){
  
  
  int n,c=0;
  Scanner sc= new Scanner (System.in);
  
  
  n=sc.nextInt();
  
  for(int i=0;i<n;i++){
     for(int j=0;j<n-i;j++){
            System.out.print(" ");
            }
     for(int j=0;j<n;j++){
     if(i==0||i==4){
         int k=0;
         
     System.out.print("*");
k++;     
     }
     if(i!=0||i!=4) {
            if(j==0||j==4){
         System.out.print("* ");
         c++;
     }else{
            System.out.print("  ");
            }
     
     }
  }
    System.out.println(); 
  }
  System.out.println(c);
  
  }   
}
