package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12, 3, 5, 6, 7};
    static int[] list2 = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12, 3, 5, 6, 7};
    static int[] list3 = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12, 3, 5, 6, 7};

    public static void bubbleSort(List<Employe> list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.size(); k++) {
            /* Array may be sorted and next pass not needed */

            for (int i = 0; i < list.size() - k; i++) {
                if (list.get(i).getSalary() > list.get(i + 1).getSalary()) {
                    /* Swap list[i] with list[i + 1] */
                    Employe temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);


                }
            }
        }
    }

    public static void selectionSort(List<Employe> list) {

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).getSalary() >list.get(j).getSalary()) {

                   Employe temp = list.get(i);
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }

        }
    }

    public static void insertionSort(List<Employe> list) {
        for (int i = 0; i < list.size(); i++) {
            Employe current = list.get(i);
            int j;
            for (j = i - 1; j >= 0 && list.get(j).getSalary() > current.getSalary(); j--) {
                list.set(j + 1, list.get(j));
            }
            list.set(j + 1, current);
        }
    }


    public static void main(String[] args) {
//        long start = System.nanoTime();
//        bubbleSort(list);
//        long end = System.nanoTime();
//        System.out.println("bubbleSort--->"+(end-start));
//        long start1 = System.nanoTime();
//        selectionSort(list2);
//        long end1 = System.nanoTime();
//        System.out.println("selectionSort--->"+(end1-start1));
//        long start2 = System.nanoTime();
//        insertionSort(list3);
//        long end2 = System.nanoTime();
//        System.out.println("insertionSort--->"+(end2-start2));


//        for (int i = 0; i < list.length; i++)
//            System.out.print(list[i] + " ");
        List<Employe> list = new ArrayList<Employe>();
        list.add(new Employe(1, "chính", 1000));
        list.add(new Employe(2, "chã", 800));
        list.add(new Employe(3, "tấn", 90000));
        list.add(new Employe(4, "ngân", 20000));
        list.add(new Employe(5, "sơn hoàng hóa", 99000));

        List<Employe> list1 = new ArrayList<Employe>();
        list.add(new Employe(1, "chính", 1000));
        list.add(new Employe(2, "chã", 800));
        list.add(new Employe(3, "tấn", 90000));
        list.add(new Employe(4, "ngân", 20000));
        list.add(new Employe(5, "sơn hoàng hóa", 99000));

        List<Employe> list2 = new ArrayList<Employe>();
        list.add(new Employe(1, "chính", 1000));
        list.add(new Employe(2, "chã", 800));
        list.add(new Employe(3, "tấn", 90000));
        list.add(new Employe(4, "ngân", 20000));
        list.add(new Employe(5, "sơn hoàng hóa", 99000));

        List<Employe> list3 = new ArrayList<Employe>();
        list.add(new Employe(1, "chính", 1000));
        list.add(new Employe(2, "chã", 800));
        list.add(new Employe(3, "tấn", 90000));
        list.add(new Employe(4, "ngân", 20000));
        list.add(new Employe(5, "sơn hoàng hóa", 99000));

        long start = System.nanoTime();
        bubbleSort(list);
        long end = System.nanoTime();
        System.out.println("bubbleSort--->"+(end-start));

        long start2 = System.nanoTime();
        insertionSort(list2);
        long end2 = System.nanoTime();
        System.out.println("insertSort--->"+(end2-start2));

        long start3 = System.nanoTime();
        selectionSort(list);
        long end3 = System.nanoTime();
        System.out.println("selectionSort--->"+(end3-start3));

        long start1 = System.nanoTime();
        Collections.sort(list1);
        long end1 = System.nanoTime();
        System.out.println("Comparable--->"+(end1-start1));
    }

}
