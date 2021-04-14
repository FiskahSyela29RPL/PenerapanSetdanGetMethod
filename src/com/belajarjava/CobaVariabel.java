package com.belajarjava;
//Belajar Variabel
public class CobaVariabel {

    //Instance Variable
    int button = 30;
    double tombol = 56.9;
    static int nyot = 45;

    //Class Variables
    public static void Coba(){
        String nama;
        nama = "HAHAHAHAH";
        System.out.println(nama);
    }

    class Nama{
        int buttton = 25;
    }
    class nama{

    }
    public static void main(String[] args) {

        //instance variabel itu mebuktikan bahwa mereka independent dan bisa punya nama yang sama;
        CobaVariabel cobaVariabel = new CobaVariabel();
        System.out.println(cobaVariabel.button);

        System.out.println(nyot);
        Coba();
        MainVariabel nyoba = new MainVariabel();
        System.out.println(nyoba.button);

        //cara memanggil innerclass
        //Nama nama = new Nama();
    }
}

