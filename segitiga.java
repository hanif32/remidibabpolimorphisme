public class segitiga extends BangunDatar{
    double a,b,c,alas,tinggi;
    
    public void keliling(){
        double keliling=a+b+c;
        System.out.println("keliling segitiga adalah = " + keliling);
    }
    
    public void luas(){
        double luas=1/2 * alas * tinggi;
        System.out.println("luas segitiga= " + luas);
    }
    
}


