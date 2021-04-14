package com.belajarjava;
//belajar tipe data

public class CobaDataPrim {
    char a;
    final int b = 9;
    String c ="Ini adalah String\n";
    char ch = '\u0061';
    int nama = 100_000;

    static void umur (int b,int c){
        int a = b*c;
        System.out.println(a);
    }

    static String nama(String nama){
        System.out.println(nama);
        return nama;
    }

    public static void main(String[] args) {
        CobaDataPrim a = new CobaDataPrim();
        a.a='a';
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.nama);
        umur(5,9);
        umur(67,900);
        nama("Syela");
    }
}
