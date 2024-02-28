public class hasilbangundatar {
    public static void main(String[] args) {
        BangunDatar b = new BangunDatar();
        persegi p = new persegi();
        segitiga s = new segitiga();
        
        p.sisi=12;
        p.sisi=21;

        s.a=12;
        s.b=12;
        s.c=12;
        s.alas=12;
        s.tinggi=13;

        b.Keliling();
        p.keliling();
        s.keliling();

        b.luas();
        p.luas();
        s.luas();
        
    }
    
}


