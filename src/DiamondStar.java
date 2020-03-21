public class DiamondStar {
    public static void main(String args[]){
    
    int n=9;
    
    int mid=n/2+1;
    
    for(int i=1;i<=mid;i++){
        for(int j=mid;j>i;j--){
        System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
        
        System.out.print("*");
        
        }
        System.out.println();
    
    }
    for(int i=1;i<mid;i++){
        for(int j=1;j<=i;j++)
    {
        System.out.print(" ");
        }
        for(int j=1;j<=2*(mid-i)-1;j++){
        
        System.out.print("j");
        
        }System.out.println();
    }
    
    }
}
