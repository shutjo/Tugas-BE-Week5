public class Segitiga extends Rumus {
    int alas, tinggi, sisiKiri, sisiKanan;
    @Override
    double luas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Menghitung luas segitiga " + luas);
        return luas;
    }
    @Override
    double keliling() {
        double keliling = sisiKiri + sisiKanan + alas;
        System.out.println("Menghitung keliling segitiga " + keliling);
        return keliling;
    }
}
