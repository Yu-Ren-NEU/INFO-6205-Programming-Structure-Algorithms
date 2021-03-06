package edu.neu.coe.info6205;

import java.util.*;

public class VLA2 {
    public VLA2(int d) { dishSize = d; }

    public static void main(String[] args) {
        Comparator<VLA2> cf = new Comparator<VLA2>() {
            @Override
            public int compare(VLA2 o1, VLA2 o2) {
                return Integer.compare(o1.dishSize,o2.dishSize);
            }
        };
        VLA2[] va = {new VLA2(40), new VLA2(200), new VLA2(60)};
        Arrays.sort(va, cf);
        int index = Arrays.binarySearch(va, new VLA2(40), cf);
        System.out.print(index + " ");
        index = Arrays.binarySearch(va, new VLA2(80), cf);
        System.out.print(index>=0);
    }

    private int dishSize;
}