//REMOVE MIDDLE ELEMENT FROM THE ARRAY
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
        int mid=N/2;
        for(int i=mid;i<N-1;i++) {
            arr[i]=arr[i+1];
        }
        for(int i=0;i<N-1;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/* TC -> O(N)
   Sc -> O(1)
*/

//OPTIMAL APPROACH
import java.util.*;
class Main {
    
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }
        int mid=N/2;
        arr[mid]=arr[N-1];
        for(int i=0;i<N-1;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
/* TC -> O(1)
   Sc -> O(1)
*/

