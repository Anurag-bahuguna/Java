// Nested Loops or inner-outer loops
    
public class pattern_Q1 {
    public static void main(String[] args) {
    // wap to print solid ractagle
        //outer loop
        // for(int i=1;i<=4;i++){
        //     //inner loop
        //     for(int j=1;j<=5;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println(); //for new line
        // }

    // wap to print hollow ractagle  
        // int n=4;
        // int m = 5;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1 || i==n || j==1 || j==m){       //int this it form (n,m) matrix
        //             System.out.print(" * ");
        //         }else{
        //             System.out.print("   ");
        //         }            
        //     }
        //     System.out.println();
        // }

    // wap to print half pyramid
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1; j<=i ;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

    // wap to print inverted half pyramid
        // int n=4;
        // for(int i=n;i>=1;i--){
        //     for(int j=1; j<=i ;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

    // wap to print half pyramid after 180 degree rotation
        int n=4;

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<n-i; j++){
                System.out.println(" ");
            }

            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
