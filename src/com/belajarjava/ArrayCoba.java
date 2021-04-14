package com.belajarjava;
//belajar array
public class ArrayCoba {
    public static void main(String[] args) {

        String [] cobaJela;
        cobaJela = new String[5];
        cobaJela[0]="Bapak";
        cobaJela[1]="Ibu";
        cobaJela[2]="Anak";
        cobaJela[3]="Kakek";
        cobaJela[4]="Nenek";

        if (cobaJela[3]=="Kakek"){
            System.out.println("Hello kakek");
        }else
            System.out.println("Mana bisa");

        //deklarasi array pertama
        String [] namaArray;
        namaArray = new String[1];
        namaArray[0] = "Isi element pertama";
        System.out.println(namaArray[0]);
        //deklarasi kedua
        String [] namaArray2={"Isi element pertama", "Isi element kedua" };
        System.out.println(namaArray2[0]);

        //deklarasi 2d array
        String [][] nama = {{"pertama ","kedua "},{"Isi element "}};
        System.out.println(nama[1][0]+""+nama[0][0]);
        System.out.println(nama[1][0]+""+nama[0][1]);

    }
}
