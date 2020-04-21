/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */



package transakasi;



/**

 *

 * @author karisma

 */

public class Costumer {

    private int noID;

    private String Nama,Alamat,No_tlp;



    public Costumer(int No_id, String Nama, String Alamat, String No_tlp) {

        this.noID = No_id;

        this.Nama = Nama;

        this.Alamat = Alamat;

        this.No_tlp = No_tlp;

    }



    public String getAlamat() {

        return Alamat;

    }



    public String getNama() {

        return Nama;

    }



    public int getNo_id() {

        return noID;

    }



    public String getNo_tlp() {

        return No_tlp;

    }



}





/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */



package transakasi;



/**

 *

 * @author karisma

 */

public interface Barang {



    public void setBarang(int kdBrg, String nmBarang, String Merk, long harga);



}

dan untuk kelas transaksinya adalah sebagai berikut :

1

2

3

4

5

6

7

8

9

10

11

12

13

14

15

16

17

18

19

20

21

22

23

24

25

26

27

28

29

30

31

32

33

34

35

36

37

38

39

40

41

42

43

44

45

46

47

48

49

50

51

52

53

54

55

56

57

58

59

/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */



package transakasi;



/**

 *

 * @author karisma

 */

public class Transaksi extends Costumer implements Barang{



    private int kdTrans, banyak,kdBrg;

    private String date;

    private String nmBarang,Merk;

    private long harga;



    public Transaksi(int No_id, String Nama, String Alamat, String No_tlp) {

        super(No_id, Nama, Alamat, No_tlp);

    }



    public void setTransaksi(int kdTrans, String date, int banyak) {

        this.kdTrans = kdTrans;

        this.date = date;

        this.banyak=banyak;



    }



    public long getTotal(int jml, long harga){

        return jml*harga;



    }



    public void setBarang(int kdBrg, String nmBarang, String Merk,long harga) {

        this.kdBrg=kdBrg;

        this.Merk=Merk;

        this.nmBarang=nmBarang;

        this.harga=harga;

    }



    public void showStruk() {



        System.out.println("Kode Transaksi :"+kdTrans);

        System.out.println("================================");

        System.out.println("Kode Costumer  :"+getNo_id());

        System.out.println("Nama Costumer  :"+getNama());

        System.out.println("Alamat         :"+getAlamat());

        System.out.println("=================================");

        System.out.println("Kode Barang    :"+kdBrg);

        System.out.println("Nama Barang    :"+nmBarang);

        System.out.println("Merk Barang    :"+Merk);

        System.out.println("Harga Barang   :"+harga);

        System.out.println("\nBanyak Pembelian :"+banyak);

        System.out.println("================================");

        System.out.println("Total          :"+getTotal(banyak, harga));

    }



}

nah tinggal kelas Main yang isinya methode utam yang static void main :

1

2

3

4

5

6

7

8

9

10

11

12

13

14

15

16

17

18

19

20

21

22

23

24

25

26

27

28

29

/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */



package transakasi;



import transakasi.Transaksi;



/**

 *

 * @author karisma

 */

public class Main {



    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        // TODO code application logic here

            ///multipler inheritance

        Transaksi Trans = new Transaksi(001, "Hendri Karisma",

                        "Bandung", "085659378***");

        Trans.setTransaksi(0011, "15-04-2010",3);

        Trans.setBarang(1000, "Printer", "EPSON", 550000);



    }





