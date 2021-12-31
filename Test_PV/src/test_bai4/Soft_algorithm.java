package test_bai4;

/**
 *
 * @author Duy Manh
 */

public class Soft_algorithm {
 
    // function exchange value
    public void swap(int arr[], int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
 
    // function divide 2 elements
    public int partition(int arr[], int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;
 
        while (true) {
 
            while (arr[++leftPointer] < pivot) {
                // no action
            }
 
            while (rightPointer > 0 && arr[--rightPointer] > pivot) {
                // no action
            }
 
            if (leftPointer >= rightPointer) {
                break;
            } else {
                System.out.println(" Phan tu duoc trao doi: " + arr[leftPointer] 
                        + ", " + arr[rightPointer]);
                swap(arr, leftPointer, rightPointer);
            }
 
        }
 
        System.out.println(" Phan tu chot duoc trao doi: " + arr[leftPointer] 
                + ", " + arr[right]);
        swap(arr, leftPointer, right);
        display(arr);
        return leftPointer;
    }
 
    // Function Sort
    public void quickSort(int arr[], int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partitionPoint = partition(arr, left, right, pivot);
            quickSort(arr, left, partitionPoint - 1);
            quickSort(arr, partitionPoint + 1, right);
        }
    }
    
    // Function Display
    public void display(int arr[]) {
        int i;
        System.out.print("[");
 
        // Iterate over all elements
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
 
        System.out.print("]\n");
    }
 
    public static void main(String[] args) {
        
        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
 
        Soft_algorithm sapXepNhanh = new Soft_algorithm();
        System.out.println("Mang du lieu dau vao: ");
        sapXepNhanh.display(arr);
        System.out.println("-----------------------------");
        sapXepNhanh.quickSort(arr, 0, arr.length - 1);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepNhanh.display(arr);
    }
}

