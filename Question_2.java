import java.util.*;
public class Question_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[][] arr = new int[n][2];
         int w=sc.nextInt();
         int ans = 0;
         for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1]= sc.nextInt();
         }
         for(int i=0;i<n;i++){
            ans = ans+arr[i][1];
            if(ans>w){
                System.out.println("data is invalide");
                return;
            }
         }
         int answer = find_answer(arr);

    }
    public static int find_answer(int[][] arr){
         int 
    }
}
