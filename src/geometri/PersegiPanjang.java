package geometri;

public class PersegiPanjang {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double luasPersegiPanjang() {
        return panjang * lebar;
    }
    
    public double kelilingPersegiPanjang() {
        return 2 *(panjang + lebar);
    }
}
