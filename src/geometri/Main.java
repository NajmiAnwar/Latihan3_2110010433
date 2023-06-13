package geometri;

public class Main {
    public static void main(String[] args) {
        
        PersegiPanjang najmi = new PersegiPanjang(3,4);
        System.out.println("Hasil Luas Persegi Panjang :"+najmi.setLuasPersegiPanjang());
        System.out.println("Hasil Keliling Persegi Panjang :"+najmi.setKelilingPersegiPanjang());
        
        Lingkaran najmiL = new Lingkaran(3);
        System.out.println("Hasil Luas Persegi Panjang :"+najmiL.setLuasLingkaran());
        System.out.println("Hasil Keliling Persegi Panjang :"+najmiL.setKelilingLingkaran());
        
        
    }
    
}
