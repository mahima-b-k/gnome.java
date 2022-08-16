// Java Program to implement Gnome Sort

import java.util.Arrays;
import java.util.Scanner;

public class GFG {
  static void gnomeSort(int arr[], int n) {
    int index = 0;

    while (index < n) {
      if (index == 0)
        index++;
      if (arr[index] >= arr[index - 1])
        index++;
      else {
        int temp = 0;
        temp = arr[index];
        arr[index] = arr[index - 1];
        arr[index - 1] = temp;
        index--;
      }
    }
    return;
  }

  // Driver program to test above functions.
  public static void main(String[] args) {
    int n, i, arr[];
    Scanner in = new Scanner(System.in);
    System.out.println("enter no of elements: ");
    n = in.nextInt();
    arr = new int[n];
    System.out.println("enter array elements: ");
    for (i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    gnomeSort(arr, arr.length);

    System.out.print("Sorted sequence after applying Gnome sort: ");
    System.out.println(Arrays.toString(arr));
  }
}
