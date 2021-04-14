package SetterAndGetter;
//berisi method dan fields yang harus ada di class uang

public interface BluePrint {

    final int spp = 8_000_000;
    int pembayaran = 0;
    int jumlahGaji=0;

    public void setPembayaran(int pembayaran);
    public void settunggakan(int tunggakan);
    public int  getSpp();
    public int  getPembayaran();
    public int  getTunggakan();
    public void setGaji(int gaji);
    public void setJumlahGaji(int jumlahGaji);
    public int  getGaji();
    public int  getJumlahGaji();
}
