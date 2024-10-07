// class tanpa constructor "class polos"
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa{
    // atribut
    String nama;
    String NIM;
    String prodi;

    // constructor nama sama dengan nama class
    // constructor dipanggil saat object pertama kali dibuat
    // construkctor tidak mengembalikan nilai (tidak punya return)

    //constructor dengan parameter
    
    Mahasiswa (String InputNama, String InputNIM, String InputProdi){
        nama = InputNama;
        NIM = InputNIM;
        prodi = InputProdi;

        // cetak
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi : " + prodi);
    }

}



public class App {
    public static void main(String[] args) throws Exception {
        
        // //instansiasi object class polos
        // Polos objectPolos = new Polos();

        // // pengisian data
        // objectPolos.dataString = "Polos";
        // objectPolos.dataInteger = 10;

        // // cetak
        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

        // instansiasi object class Mahasiswa
        Mahasiswa mhs_1 = new Mahasiswa("ucup", 
        "23231010", "Arsitek");
        
        Mahasiswa mhs_2 = new Mahasiswa("Udin", 
        "11333355", "Kimia");
    }
}
