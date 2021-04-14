package SetterAndGetter;

public class Uang implements BluePrint{
    private final int spp = 8_000_000;
    private int tunggakan;
    private int pembayaran = 0;
    private int gaji;
    private int jumlahGaji=0;

    /**
     * method untuk murid
     */
    public void setPembayaran(int pembayaran) {
        this.pembayaran += pembayaran;
        PrivateDashboard uang = new PrivateDashboard();
        uang.updateJumlahSpp(this.pembayaran);
    }

    public void settunggakan(int tunggakan) {
        this.tunggakan = tunggakan;
        tunggakan = spp-pembayaran;
        if (pembayaran<spp){
            System.out.println("Tidak ada tunggakan");
        }
    }

    public int getSpp(){
        return spp;
    }

    public int getPembayaran() {
        return pembayaran;
    }

    public int getTunggakan(){
        return tunggakan;
    }

    /**
     * untuk guru
     */
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setJumlahGaji(int jumlahGaji) {
        this.jumlahGaji += jumlahGaji;
        PrivateDashboard uang = new PrivateDashboard();
        uang.updateGajiGuru(this.jumlahGaji);
    }
    public int getGaji() {
        return gaji;
    }

    public int getJumlahGaji() {
        return jumlahGaji;
    }
}
