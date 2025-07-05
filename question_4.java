import java.util.*;
public class question_4 {
    public static void main(String[] args) {
        // we have to imput 2d array 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int ans = find_answer(n,arr);

    }

     public static int find_answer(int n , int[][] arr){
        return 0;
    }
}
