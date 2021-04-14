package SetterAndGetter;
import java.util.*;

public class DashBoard {
    public static void main(String[] args) {

        //membuat objek berisi guru
        Guru tasya = new Guru("tasya@smktelkom-mlg.sch.id", "Tasya S.Pd", 900_500);
        Guru imam = new Guru("imam@smktelkom-mlg.sch.id", "Imam S.Kom", 900_000);
        Guru adi = new Guru("Adi@smktelkom-mlg.sch.id", "Adi M.Pd", 1_200_000);

        //menambahkan guru ke arraylist guru
        List<Guru> guru = new ArrayList<>();
        guru.add(tasya);
        guru.add(imam);
        guru.add(adi);

        //membuat objek berisi murid
        Murid Fiskah = new Murid("fiskah@smktelkom-mlg.sch.id", "Fiskah", 90);
        Murid Aulia = new Murid("aulia@smktelkom-mlg.sch.id", "Aulia", 100);
        Murid Aisy = new Murid("aisy@smktelkom-mlg.sch.id", "Aisy", 89);

        //menambahkan murid ke arraylist murid
        List<Murid> murid = new ArrayList<>();
        murid.add(Fiskah);
        murid.add(Aisy);
        murid.add(Aulia);

        //uang yang diterima dan di bayarkan sekolah
        System.out.println("Bendahara Sekolah");
        tasya.setGaji(400_000);
        imam.setGaji(400_000);
        adi.setGaji(400_000);

        PrivateDashboard sekolah = new PrivateDashboard(guru,murid);
        //menambahkan gaji guru
        tasya.setGaji(400_000);
        imam.setGaji(400_000);
        adi.setGaji(400_000);

        //menampilkan gaji yang diterima guru
        tasya.setJumlahGaji(tasya.getGaji());
        System.out.println("Sekolah membayar " +tasya.getNama() +"\nJumlah uang sekolah ");
        sekolah.updateGajiGuru(tasya.getJumlahGaji());
        System.out.println("Sekolah membayar " +adi.getNama() +"\nJumlah uang sekolah ");
        sekolah.updateGajiGuru(adi.getJumlahGaji());
        System.out.println("Sekolah membayar " +imam.getNama() +"\nJumlah uang sekolah ");
        sekolah.updateGajiGuru(imam.getJumlahGaji())
    }
    //akan bertambah lagi nanti
}



