
 import java.util.*;
 
public class overlepping{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[][] arr = new int[n][2];
          for(int i =0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1]=sc.nextInt();
          }
          System.out.print("the sorted array is ");

           Arrays.sort(arr,(a,b)->Integer.compare(a[1], b[1]));
            
           find_count(arr);

    
    }
    public static void find_count(int[][] arr){
        int count =0;
        int lastelemtn = arr[0][1];
             for(int i =1;i<arr.length;i++){
                if(arr[i][0]>=lastelemtn){
                    count++;
                    lastelemtn = arr[i][1];
                }
                }
                  System.out.println(count);
             }
            
    }

 