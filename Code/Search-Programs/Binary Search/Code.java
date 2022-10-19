import java.util.Scanner;

public class Code {
    static Scanner sc = new Scanner(System.in);

    public static int BSearch(int arr[], int elem) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (elem == arr[mid]) {
                return mid;
            } else if (elem < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int[] takeinput() {
        int size = sc.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void print(int input[]) {
        int size = input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.print("Printing the default array.... : ");
        print(arr);
        System.out.print("Enter the element that you want to find : ");
        int element = sc.nextInt();
        int output = BSearch(arr, element);
        System.out.println(output);
    }
}
