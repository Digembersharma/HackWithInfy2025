import java.util.*;

public class overlepping {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of activities: ");
    int n = sc.nextInt();
    int[][] arr = new int[n][2];

    System.out.println("Enter start and end times for each activity:");
    for (int i = 0; i < n; i++) {
      System.out.print("Activity " + (i + 1) + " - Start time: ");
      arr[i][0] = sc.nextInt();
      System.out.print("Activity " + (i + 1) + " - End time: ");
      arr[i][1] = sc.nextInt();
    }

    // Display original activities
    System.out.println("\nOriginal activities:");
    printActivities(arr);

    // Sort by end time (greedy approach for activity selection)
    Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

    System.out.println("\nActivities sorted by end time:");
    printActivities(arr);

    // Find maximum number of non-overlapping activities
    int maxActivities = findMaxActivities(arr);
    System.out.println("\nMaximum number of non-overlapping activities: " + maxActivities);

    sc.close();
  }

  public static void printActivities(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Activity " + (i + 1) + ": [" + arr[i][0] + ", " + arr[i][1] + "]");
    }
  }

  public static int findMaxActivities(int[][] arr) {
    if (arr.length == 0)
      return 0;

    int count = 1; // First activity is always selected
    int lastEndTime = arr[0][1];

    System.out.println("\nSelected activities:");
    System.out.println("Activity 1: [" + arr[0][0] + ", " + arr[0][1] + "]");

    for (int i = 1; i < arr.length; i++) {
      // If current activity starts after the last selected activity ends
      if (arr[i][0] >= lastEndTime) {
        count++;
        lastEndTime = arr[i][1];
        System.out.println("Activity " + (count) + ": [" + arr[i][0] + ", " + arr[i][1] + "]");
      }
    }

    return count;
  }
}
