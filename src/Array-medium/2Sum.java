//BRUTE FORCE APPROACH
import java.util.*;
class Main {
    
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<N;i++) {
            for(int j=i+1;j<N;j++) {
                if(arr[i]+arr[j]==target) {
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
    }
}
        for(int i=0;i<N;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/* TC -> O(N)
   Sc -> O(1)
*/

/* TC -> O(N^2)
   Sc -> O(1)
*/

