package SetterAndGetter;

import java.util.List;

public class PrivateDashboard  {
    //private dan protected fields
    //menggunakan array list karena jumlah guru dan murid dapat berubah ubah
    private List<Guru> guru;
    private List<Murid> murid;
    protected int jumlahSpp;
    protected int gajiGuru;

    //konstraktor overloading untuk memudahkan membuat objek yang tidak memerlukan nilai guru maupun murid
    public PrivateDashboard (){
    }

    //konstraktor yang menetapkan variabel dan nilai didalamnua
    public PrivateDashboard(List<Guru> guru, List<Murid> murid) {
        this.guru = guru;
        this.murid = murid;
        this.jumlahSpp = jumlahSpp;
        this.gajiGuru = gajiGuru;
        jumlahSpp = 0;
        gajiGuru = 0;
    }

    //untuk menghitung jumlah uang spp yang dibayarkan siswa
    public void updateJumlahSpp(int jumlahSpp) {
        this.jumlahSpp += jumlahSpp;
    }

    //untuk menghitung jumlah uang yang dikleuarkan sekolah untuk meggaji guru
    public void updateGajiGuru(int gajiGuru) {
        this.gajiGuru -= gajiGuru;
    }

    //menampilkan nilai jumlah uang spp yang dibayarkan siswa
    public int getJumlahSpp() {
        return jumlahSpp;
    }

    //menampilkan nilai jumlah uang yang dikleuarkan sekolah untuk meggaji guru
    public int getGajiGuru() {
        return gajiGuru;
    }

    // menampilkan semua list guru
    public List<Guru> getGuru() {
        return guru;
    }

    // menampilkan semua list murid
    public List<Murid> semuaMurid() {
        return murid;
    }

    //menambah list guru
    public void listGuru (Guru guru) {
        this.guru.add(guru);
    }

    //menambah list murid
    public void listMurid (Murid murid) {
        this.murid.add(murid);
    }
}
