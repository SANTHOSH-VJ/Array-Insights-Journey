// REMOVE DUPLICATES AND RETURN THE UNIQUE ELEMENTS COUNT

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

        Set<Integer>s=new HashSet<>();
        for(int i=0;i<N;i++) {
            s.add(arr[i]);
        }
        int index=0;
        for(int a:s) {
            arr[index]=a;
            index++;
        }
        System.out.print(index);
    }
}
/* TC -> O(N log N) + O(N) 
   Sc -> O(N)
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

        int index=1;
        for(int i=1;i<N;i++) {
            if(arr[i]!=arr[i-1]) {
                arr[index]=arr[i];
                index++;
            }
        }
        System.out.print(index);
    }
}

/* TC -> O(N)
   Sc -> O(1)
*/