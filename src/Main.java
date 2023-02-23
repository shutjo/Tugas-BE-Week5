public class Main {
    public static void main(String[] args) {
        Rumus rumus = new Rumus();

        System.out.println(" ");
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        persegi.luas();
        persegi.keliling();

        System.out.println(" ");
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.lebar = 5;
        persegiPanjang.panjang = 10;
        persegiPanjang.luas();
        persegiPanjang.keliling();

        System.out.println(" ");
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 10;
        segitiga.tinggi = 7;
        segitiga.sisiKanan = 9;
        segitiga.sisiKiri = 8;
        segitiga.luas();
        segitiga.keliling();

        System.out.println(" ");
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jariJari = 7;
        lingkaran.luas();
        lingkaran.keliling();
    }
}