package geometri;

public class Main {
    public static void main(String[] args) {
        Lingkaran luas1 = new Lingkaran(3.0);
        Lingkaran keliling1 = new Lingkaran(2.0);
        
        double luasLingkaran = luas1.luasLingkaran();
        double kelilingLingkaran = keliling1.kelilingLingkaran();
        
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        PersegiPanjang luas2 = new PersegiPanjang(2.0, 5.0);
        PersegiPanjang keliling2 = new PersegiPanjang(5.0, 8.0);
        
        double luasPersegiPanjang = luas2.luasPersegiPanjang();
        double kelilingPersegiPanjang = keliling2.kelilingPersegiPanjang();
        
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
    }
}
