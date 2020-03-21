
public class MirrroRightTri {
   public static void main(String args[]){
   int n=5;
   
   for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
            
        }
        if(i==n-1||i==0){
        for(int j=0;j<=i;j++)                
                        {
                               System.out.print("*");
                        }
        
        }else{
            for(int j=0;j<n;j++){
             if(j==0||j==i){
            System.out.print("*");
            }else {
            System.out.print(" ");
            }
            }
        
        
        }
        
         
   System.out.println();
   }
   } 
}
