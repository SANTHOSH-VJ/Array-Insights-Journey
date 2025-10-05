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
    
        Arrays.sort(arr);
        int largest=arr[N-1];
        int secondlargest=-1;

        for(int i=N-2;i>=0;i--) {
            if(arr[i]!=largest) {
                secondlargest=arr[i];
                break;
            }
        }
        System.out.print(secondlargest);
    }
}

/* TC -> O(N log N) + O(N)
   Sc -> O(1)
*/ 

//BETTER APPROACH

import java.util.*;

class Main
{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
        for(int i=1;i<N;i++) {
            if(arr[i]>largest) {
                largest=arr[i];
            }
        }
        int secondlargest=-1;
        for(int i=0;i<N;i++) {
            if(arr[i]>secondlargest && arr[i]!=largest) {
                secondlargest=arr[i];
            }
        }
        System.out.print(secondlargest);
    }
}

/* TC -> O(N) + O(N)
   Sc -> O(1)
*/

//OPTIMAL APPROACH

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = in.nextInt();
        int arr[] = new int[N];
        for (int i=0;i<N;i++) {
            arr[i]=in.nextInt();
        }
        int largest = a[0];
        int slargest = -1;

        for (int i=1;i<N;i++) {
            if (arr[i]>largest) {
                slargest=largest;
                largest=arr[i];
            } 
            else if(arr[i]<largest && arr[i]>slargest) {
                slargest=arr[i];
            }
        }
        System.out.println(slargest);
    }
}

/* TC -> O(N)
   Sc -> O(1)
*/
