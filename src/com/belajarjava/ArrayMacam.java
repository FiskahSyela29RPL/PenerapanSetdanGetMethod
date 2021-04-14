package com.belajarjava;
import java.util.Arrays;

public class ArrayMacam {

    //membuat copy array
    //belumPaham
    public void Copy(){
        char [] copy = {'a','b','c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd','a','b','c'};
        char [] copyTo = new char[7];
        System.arraycopy(copy,2,copyTo,0,7);
        System.out.println(new String(copyTo));
    }
    //asListMethod
    public void asList (){
        int [] copy = {1,9,7,8,653};
        System.out.println(Arrays.asList(copy));
    }

    //binarySearch
    public void binarySearch(){
        int [] copy = {1,9,7,8,653};
        Arrays.sort(copy);
    }
    public static void main(String[] args) {
        ArrayMacam array = new ArrayMacam();
        array.asList();
    }
}
