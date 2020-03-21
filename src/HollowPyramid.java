
public class HollowPyramid {
   public static void main(String args[]){
   
   int n=9;
   int k=n;
   for(int i=1;i<=n;i++){
       for(int j=1;j<=k/2;j++){
       System.out.print(" ");
       }
       
      if(i==n){
              for(int a=1;a<=i;a++){
              System.out.print("*");
              }
       
       }
       
       if(i%2!=0 && i!=n){
           
           
       for(int j=1;j<=i;j++)
       {
          if(j==1||j==i){
       System.out.print("*");
          }
         else {System.out.print(" ");}
  
       }
       }
   k--;
  System.out.println();
   }
   
   
   } 
}
