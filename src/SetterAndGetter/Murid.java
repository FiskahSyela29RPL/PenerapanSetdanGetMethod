package SetterAndGetter;
//kelas yang berfungsi mengganti atau menampilkan identitas murid

public class Murid extends Uang {

    private String email, sandi, nama;
    private int nilai;

    public Murid (String email, String nama, int nilai ){
        this.email = email;
        this.nama = nama;
        this.nilai = nilai;
    }

    public void setNilai (int nilai){
        this.nilai = nilai;
    }

    public String getEmail() {
        return email;
    }

    public int getNilai() {
        return nilai;
    }

    //menampilkan nilai saat objek dari class murid dipanggil
    public String toString(){
        return "Nama :" +nama+" Nilai : "+" Tunggakan : "+getTunggakan();
    }
}
