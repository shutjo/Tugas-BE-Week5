public class Persegi extends Rumus {
    int sisi;
    @Override
    double luas(){
        double luas = sisi * sisi; // DEKLARASI RUMUS
        int luasInt = (int)luas; // CASTING TIPE DATA
        System.out.println("Menghitung luas persegi " + luasInt);
        return luas;
    }
    @Override
    double keliling(){
        double keliling = 4 * sisi;
        int keliInt = (int)keliling;
        System.out.println("Menghitung keliling persegi "+ keliInt);
        return keliling;
    }
}