class Kalkulator{
    // atribut
    double Perkalian;
    double Penjumlahan;
    double Pengurangan;
    double Pembagian;

    // constructor dengan parameter
    Kalkulator (double Input1, double Input2, double Input3, double Input4){
        Perkalian = Input1 * Input2 * Input3 * Input4;
        Penjumlahan = Input1 + Input2 + Input3 + Input4;
        Pengurangan = Input1 - Input2 - Input3 - Input4;
        Pembagian = Input1 / Input2 / Input3 / Input4;
        
        // cetak
        System.out.println("Hasil Perkalian: " + Perkalian);
        System.out.println("Hasil Penjumlahan: " + Penjumlahan);
        System.out.println("Hasil Pengurangan: " + Pengurangan);
        System.out.println("Hasil Pembagian: " + Pembagian);
    }
}


public class App {
    public static void main(String[] args) throws Exception {

        // instansi object class kalkulator
        Kalkulator Kalkulator1 = new Kalkulator(5, 2, 4, 10);

        Kalkulator kalkulator2 = new Kalkulator(10, 5, 8, 4);
    }
}
