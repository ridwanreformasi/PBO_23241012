public class GajiBersih {

    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    public double getPajak() {
        return pajak;
    }

    public double hitungGajiBersih() {
        double gajiBersih = (gajiPokok + tunjangan) - (gajiPokok + tunjangan) * (pajak / 100);
        return gajiBersih;
    }

    public static void main(String[] args) {
        GajiBersih gaji = new GajiBersih();
        gaji.setGajiPokok(5000000);
        gaji.setTunjangan(1000000);
        gaji.setPajak(5);

        double gajiBersih = gaji.hitungGajiBersih();

        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}