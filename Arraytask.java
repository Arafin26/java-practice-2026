// Sorting Logic Branch
// Array Operations Branch
import java.util.Scanner;

public class Arraytask {

    
    public static void sortArray(int arr[]) {
        int temp;

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 different numbers:");

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        sortArray(arr);

        System.out.println("\nSorted Array:");

        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        int secondLowest = arr[1];
        int secondHighest = arr[arr.length - 2];

        System.out.println("\nSecond Lowest Number: " + secondLowest);
        System.out.println("Second Highest Number: " + secondHighest);

        sc.close();
    }
}
