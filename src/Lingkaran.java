public class Lingkaran extends Rumus{
    double jariJari;
    @Override
    double luas(){
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Menghitung luas lingkaran " + luas);
        return luas;
    }
    @Override
    double keliling(){
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Menghitung keliling lingkaran " + keliling);
        return keliling;
    }
}
