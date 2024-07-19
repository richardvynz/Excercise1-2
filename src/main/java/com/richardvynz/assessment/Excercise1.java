package com.richardvynz.assessment;

import java.util.HashSet;
import java.util.Set;

public class Excercise1 {
    public static void main(String[] args) {
        int [] arr ={1, 3, 6, 4, 1, 2};
        int answer = findSmallestNonOccurringInteger(arr);
        System.out.println(answer);
    }


        public static int findSmallestNonOccurringInteger(int[] array) {
            Set<Integer> numberSet = new HashSet<>();

            for (int num : array) {
                if (num > 0) {
                    numberSet.add(num);
                }
            }

            int smallestMissing = 1;
            while (numberSet.contains(smallestMissing)) {
                smallestMissing++;
            }

            return smallestMissing;
        }
    }