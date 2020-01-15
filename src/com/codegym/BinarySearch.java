package com.codegym;

public class BinarySearch {
    public static int[] list = {17, 4, 6, 18, 10, 21, 12};

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void Sort(int[] list) {
        int temp = list[0];
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }

        int result = binarySearch(list, 17);
        System.out.println("Gia tri index cua  17 la : " + result);
    }
}


