abstract public class Mobil implements PropertiInM{ 
abstract public void injakPedalGas();
 public void injakRem(){
  System.out.println("Mobil berhenti!");  
}
 }
 class Kijang extends Mobil{
 public void injakPedalGas(){
 System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam...");
  } 
 
public int berukuran(int ukuran) { 

 // TODO Auto-generated method 
stub return ukuran;  } 
 
 public int berkekuatan(int kekuatan) {
  // TODO Auto-generated method 
stub return kekuatan;
  }
 }
 class BMW extends Mobil {
  public void injakPedalGas(){ 
System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam...");
  } 
 
  public int berukuran(int ukuran) { 
 // TODO Auto-generated method
 stub return ukuran;
  } 
 
 public int berkekuatan(int kekuatan) {  

 // TODO Auto-generated method
 stub return kekuatan; 
 }
 } 