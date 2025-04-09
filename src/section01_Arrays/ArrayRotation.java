package section01_Arrays;

import java.util.Arrays;
import java.util.Collections;

class ArrayRotation {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five"};
        int rotation = 3;
        for (int i = 0; i < rotation; i++) {
            String temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        String[] arr2 = {"one", "two", "three", "four", "five"};
        int rotationCount = 3;
        for (int i = 0; i < rotationCount; i++) {
            String temp = arr2[arr2.length - 1];
            for (int j = arr2.length - 1; j > 0; j--) {
                arr2[j] = arr2[j - 1];
            }
            arr2[0] = temp;

        }
        System.out.println(Arrays.toString(arr2));
        String[] arr3={"one","two","three","four","five"};
        Collections.rotate(Arrays.asList(arr3),-3);
        System.out.println(Arrays.toString(arr3));

    }


}
