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
        int D=sc.nextInt();
        D=D%N; //in case D>N
        for(int j=0;j<D;j++) {
            int temp=arr[0];
            for(int i=1;i<N;i++) {
                arr[i-1]=arr[i];
            }
            arr[N-1]=temp;
        }
        for(int i=0;i<N;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/* TC -> O(N*D)
   Sc -> O(1)
*/