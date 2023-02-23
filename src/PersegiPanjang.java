public class PersegiPanjang extends Rumus{
    int panjang, lebar;
    @Override
    double luas(){
        double luas = panjang * lebar;
        int luasInt = (int)luas;
        System.out.println("Menghitung luas persegi panjang " + luasInt);
        return luas;
    }
    @Override
    double keliling(){
        double keliling = 2 * (panjang + lebar);
        int keliInt = (int)keliling;
        System.out.println("Menghitung keliling persegi panjang " + keliInt);
        return keliling;
    }
}
