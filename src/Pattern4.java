
import java.util.Scanner;

public class Pattern4 {
    public static void main(String args[]){
    
    
    int n;
    
    Scanner sc=new Scanner (System.in);
    n=sc.nextInt();
    
    for(int i=0;i<=n;i++){
        for(int j=0;j<n;j++){
        
        if(i==0||i==n){
       
        
        System.out.print("* ");
       
       }
       
       if(i==2||i==4){
           
           if(j!=2){
               
           System.out.print("* ");
           }else{
                   System.out.print("  ");
           }
       
       }System.out.print(" ");
       if(i==3)
       { 
               if(j==2 ||j==4){
             System.out.print(" * ");
               }else{System.out.print(" ");
               }
           }
       
        
        
        
        }
    
    
    
    
    
    System.out.println();
    
    }
    
    }
    
}
