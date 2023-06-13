package geometri;

public class PersegiPanjang {
    public double panjang, lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        
        //membuat method luas dan keliling
    public double panjang(){
        return panjang * lebar;
    }
        
    public double lebar(){
        return 2 * (panjang + lebar);
    }
    
    }

    
}
