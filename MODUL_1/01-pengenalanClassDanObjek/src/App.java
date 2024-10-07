// Membuat class sebagai template

class Mahasiswa{
    // Ciri-ciri atau atribut object
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}


public class App {
    public static void main(String[] args) {
        
        // instansiasi object
        Mahasiswa mhs_1 = new Mahasiswa();
        mhs_1.nama = "Udin";
        mhs_1.NIM = "11333355";
        mhs_1.jurusan = "PTI";
        mhs_1.IPK = 3.22;
        mhs_1.umur = 25;

        Mahasiswa mhs_2 = new Mahasiswa();
        mhs_2.nama = "jojo";
        mhs_2.NIM = "23232323";
        mhs_2.jurusan = "Kimia";
        mhs_2.IPK = 2.90;
        mhs_2.umur = 23;

        Mahasiswa mhs_3 = new Mahasiswa();
        mhs_3.nama = "nuri";
        mhs_3.NIM = "0897654";
        mhs_3.jurusan = "Arsitek";
        mhs_3.IPK = 2.91;
        mhs_3.umur = 26;

        // Cetak object
        System.out.println("Nama Mahasiswa : " + mhs_1.nama);
        System.out.println("NIM : " + mhs_1.NIM);
        System.out.println("Jurusan : " + mhs_1.jurusan);
        System.out.println("IPK : " + mhs_1.IPK);
        System.out.println("Umur : " + mhs_1.umur);
        System.out.println();
        System.out.println("Nama Mahasiswa : " + mhs_2.nama);
        System.out.println("NIM : " + mhs_2.NIM);
        System.out.println("Jurusan : " + mhs_2.jurusan);
        System.out.println("IPK : " + mhs_2.IPK);
        System.out.println("Umur : " + mhs_2.umur);
    }
}