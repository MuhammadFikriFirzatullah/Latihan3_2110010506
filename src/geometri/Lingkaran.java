package geometri;

public class Lingkaran {
    public double radius;
    
     public Lingkaran(double radius){
        this.radius = radius;   
    }
    
    //membuat method luas dan keliling
    public double luas(){
        return Math.PI * radius * radius;
    }
        
    public double keliling(){
        return 2 * Math.PI * radius;
    }
    
}
