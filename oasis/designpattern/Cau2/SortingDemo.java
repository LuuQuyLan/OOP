package Cau2;

public class SortingDemo {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        SortContext context = new SortContext();

        // Sử dụng Bubble Sort
        context.setStrategy(new BubbleSort());
        int[] resultBubbleSort = context.executeStrategy(array.clone());
        System.out.println("Sorted using Bubble Sort:");
        printArray(resultBubbleSort);

        // Sử dụng Selection Sort
        context.setStrategy(new SelectionSort());
        int[] resultSelectionSort = context.executeStrategy(array.clone());
        System.out.println("\nSorted using Selection Sort:");
        printArray(resultSelectionSort);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

