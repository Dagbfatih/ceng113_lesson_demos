package projects.recursion;

import abstracts.DemoApp;

public class RecursionSamples extends DemoApp {



    // Every method (method group) is to solve the given tasks below
    // Every task is written at the top of the method (group)
    @Override
    protected void program() {
        int result1 = findProducts(3, 6);
        System.out.println(result1);

        int result2 = sumOfMatrix(new int[]{2, 3, 5});
        System.out.println(result2);

        int result3 = posOfMin(new int[]{-2, 3, 4, 50, 0}, 0, 0);
        System.out.println(result3);

        int result4 = productsOfEvens(new int[]{-2, 3, 4, 50, 6, 7}, 0);
        System.out.println(result4);

        String result5=reverseString("abcdef");
        System.out.println(result5);
    }

    /*
     * Given Task:
     * Find the product of all integers from X to Y, inclusively.
     */
    private int findProducts(int x, int y) {
        if (x == y) {
            return x;
        }

        return x * findProducts(x + 1, y);
    }

    /**
     * Given Task:
     * Find the sum of a specific row of a given matrix.
     *
     * Here, simply calculated the sum of elements of given 1D array.
     */
    private int sumOfMatrix(int[] arr) {
        if (arr.length == 1) {
            return arr[0]; // return last element
        }

        // Remove first element of arr
        int[] newArr = removeAt(arr, 0);

        return arr[0] * sumOfMatrix(newArr);
    }

    /**
     * Given Task:
     * Find the position of the minimum number in a one-dimensional array.
     *
     * @param current defaults to 0.
     * @param min defaults to 0.
     */
    public static int posOfMin(int[] arr, int current, int min) {
        if (current == arr.length) {
            return min;
        }

        if (arr[current] < arr[min]) {
            min = current;
        }

        return posOfMin(arr, current + 1, min);
    }

    /**
     * Given Task:
     * Find the product of only the elements in even numbered positions of a one-dimensional array.
     *
     * @param index defaults to 0
     */
    private int productsOfEvens(int[] arr, int index) {
        if (index == arr.length - 1 || index + 2 >= arr.length) {
            return arr[index];
        }

        return arr[index] * productsOfEvens(arr, index + 2);
    }


    /**
     * Given Task:
     * Given a string, display its characters in the reverse order.
     * For instance, if the given string is "abcd", the output should be "dcba".
     */
    private String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        }

        return str.charAt(str.length()-1)+ reverseString(str.substring(0,str.length()-1));
    }

    // Helper method for all
    private int[] removeAt(int[] arr, int index) {
        int newArr[] = new int[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[j++] = arr[i];
        }

        return newArr;
    }
}
