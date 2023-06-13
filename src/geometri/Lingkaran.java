package geometri;

public class Lingkaran {
     double bil1, bil2;
    
    public Lingkaran(double  bil1, double bil2){
        this.bil1 = bil1;
    }
    
    public double setLuasLingkaran(){
        return 3.14 * bil1 * bil1;
    }
    
     public double setKelilingLingkaran(){
        return 2 * 3.14 * bil1;
    }
    
}
