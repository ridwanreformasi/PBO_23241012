class Data {
    // Data Member atau variabel
    public int intpublic;
    private int intprivate;
    private double doublePrivate;

    // konstruktor demgan modifier public
    public Data() {
        this.intpublic = 0;
        this.intprivate = 1000;
        this.doublePrivate = 3.14;
    }

    // Method modifier default
    void cetak() {
        System.out.println(this.intpublic);
        System.out.println(this.intprivate);
    }

    // setter
    public void setIntPrivate(int value) {
        this.intprivate = value;
    }

    // getter
    public double getDoublePrivate() {
        return this.doublePrivate;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // instansi objek
        Data objek = new Data();

        // baca dan tulis dengan public
        objek.intpublic = 50; // tulis
        System.out.println("Public : " + objek.intpublic); // baca

        // tulis saja (setter)
        objek.setIntPrivate(10);
        objek.cetak();

        // baca saja (getter)
        double angka = objek.getDoublePrivate();
        System.out.println("getter : " + angka);
    }
}

// getter/baca untuk membaca variabel modifionernya private
// setter/tulis untuk menulis variabel modifionernya private