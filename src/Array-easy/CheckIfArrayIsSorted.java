import java.util.*;

class Main {
    
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<N;i++) {
            if(arr[i]>arr[N-1]) {
                System.out.print("The array is sorted");
            }
            else{
                System.out.print("The array is not sorted");
            }
        }

/* TC -> O(N)
   Sc -> O(1)
*/     