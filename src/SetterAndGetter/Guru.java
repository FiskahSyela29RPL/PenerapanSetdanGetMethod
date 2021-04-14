package SetterAndGetter;
//kelas yang berfungsi mengganti atau menampilkan identitas guru

public class Guru extends Uang{
    private String email;
    private String nama;

    public Guru (String email, String nama, int gaji) {
        this.email = email;
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    //menampilkan nilai saat objek dari class guru dipanggil
    public String toString (){
        return"Nama : "+nama+" Jumlah Gaji " +getJumlahGaji();
    }


}
