//1.Declare and print an array

/*public class Main {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

    
        System.out.println("Using a loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Using Arrays.toString:");
        System.out.println(java.util.Arrays.toString(numbers));
    }
}*/





//2. Input and output elements of an array//

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

       
        int[] numbers = new int[size];

        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

       
        System.out.println("You entered:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}*/





// 3. Find the sum of elements in an array//

/*public class Main {
    public static void main(String[] args) {
        
        int[] numbers = {5, 10, 15, 20, 25};

        int sum = 0;

        
        for (int number : numbers) {
            sum += number;
        }

       
        System.out.println("Sum of elements: " + sum);
    }
}*/





// 4. Find the average of elements in an array//

/*public class Main {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        
        for (int number : numbers) {
            sum += number;
        }

        
        double average = (double) sum / numbers.length;

        
        System.out.println("Average of elements: " + average);
    }
}*/





//5. Find the maximum element in java//

/*public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 97, 64};
        int max = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
        }

        System.out.println("Maximum element: " + max);
    }
}*/





//6. Find Maximum Element.//

/*public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 97, 64};
        int min = arr[0];  // Assume first is min

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  // Update min if current is smaller
            }
        }

        System.out.println("Minimum element: " + min);
    }
}*/





//7. Find maximum element. //

/*public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 25, 5, 97, 64};

        int evenCount = 0;
        int oddCount  = 0;

        for (int n : nums) {
            if ((n & 1) == 0) {   
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd : " + oddCount);
    }
}*/





//8. Print elements at even indices. //

/*public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 97, 64, 33, 88};

        System.out.println("Elements at even indices:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}*/





//9. Print elements at odd indices. //

/*public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 97, 64, 33, 88};

        System.out.println("Elements at odd indices:");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}*/






//10. Count positive and negative numbers //

/*public class Main {
    public static void main(String[] args) {
        int[] arr = {10, -5, 0, 20, -3, -1, 8};

        int positive = 0, negative = 0;

        for (int n : arr) {
            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
    }
}*/





//11. Replace all negative numbers with zero. //

/*public class Main {
    public static void main(String[] args) {
        int[] arr = {10, -5, 0, 20, -3, -1, 8};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println("Modified array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}*/





//12. Search an element (Linear Search)//

/*public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 97, 64};
        int target = 97;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}*/





//13. Copy an array//

/*public class Main {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied array:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}*/





//14. Reverse an array//

/* public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
          
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}*/





//15. Swap first and last elements//

/*import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        if (arr.length >= 2) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }

        System.out.println("Array after swap: " + Arrays.toString(arr));
    }
}*/
















