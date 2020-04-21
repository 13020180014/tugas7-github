package WILDAN_TECHNO_ART;

//Interface
interface komponen {
    
    //Secara Implisit Variable tersebut Bersifat Public Static dan Final
    double kecepatan = 160.0;
    String model = "Lamborghini";
    
    //Secara Implisit Method Tersebut Bersifat Public dan Abstrak
    void mesin();
    void design();
}



Berbeda dengan class abstrak, komponen didalam interface memiliki aturan dimana kita tidak perlu menambahkan sifat seperti public, abstract dan final pada variable atau method tersebut, karena secara implisit variable atau method tersebut sudah bersifat public, abstract dan final.

Buatlah class baru dan berimana mobil, pada class tersebut kita perlu mengimplementasikan class komponen dengan menggunakan keyword implements.


package WILDAN_TECHNO_ART;

public class mobil implements komponen{
    public static void main(String[] args){
        mobil data = new mobil();
    }

    @Override
    public void mesin() {
        
    }

    @Override
    public void design() {
        
    }
}



Kita bisa melakukan apa saja pada method-method tersebut, seperti berikut ini:


package WILDAN_TECHNO_ART;

public class mobil {
    public static void main(String[] args){
        mobil data = new mobil();
        data.mesin();
        data.design();
    }


    public void mesin() {
        System.out.println("Kecepatan Mobil: "+kecepatan);
    }

    @Override
    public void design() {
        System.out.println("Mempunyai Model: "+model);
    }
}