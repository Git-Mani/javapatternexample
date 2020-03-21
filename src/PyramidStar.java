
public class PyramidStar {
   public static void main(String args[]){
   
   int n=5;
   int k=n;
   for(int i=1;i<=n;i++){
       for(int j=1;j<=k/2;j++){
       System.out.print(" ");
       }
       if(i%2!=0){
       for(int j=1;j<=i;j++)
       {
          
       System.out.print("*");
           
  
       }
       }
   k--;
  System.out.println();
   }
   
   
   } 
}
