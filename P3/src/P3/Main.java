package P3;

public class Main {
    public static void main(String[] args) {
        int tmp;
        boolean status;

        Nasabah Citra = new Nasabah("Gelya Ayu Citra", "Ezra Radinka");
        System.out.println("Nasabah atas nama : " + Citra.getNamaAwal() + " " + Citra.getNamaAkhir()
        + "\n-------------------------------------------------");

        Citra.setTabungan(new Tabungan(10000));
        tmp = Citra.getTabungan().getSaldo();

        System.out.println("Saldo awal : " + tmp);

        Citra.getTabungan().simpanUang(30000);
        System.out.println("Jumlah uang disimpan : 30000");

        status = Citra.getTabungan().ambilUang(90000);
        System.out.print("Jumlah uang ditarik : 90000");

        if (status) {
            System.out.println(" (success)");
        } else {
            System.out.println(" (fail)");
        }

        Citra.getTabungan().simpanUang(20000);
        System.out.println("Jumlah uang disimpan : 20000");

        status = Citra.getTabungan().ambilUang(5500);
        System.out.print("Jumlah uang ditarik : 5500");

        if (status) {
            System.out.println(" (success)");
        } else {
            System.out.println(" (fail)");
        }

        status = Citra.getTabungan().ambilUang(6666);
        System.out.print("Jumlah uang ditarik : 6666");

        if (status) {
            System.out.println(" (success)");
        } else {
            System.out.println(" (fail)");
        }

        Citra.getTabungan().simpanUang(10000);
        System.out.println("Jumlah uang disimpan : 10000");
        tmp = Citra.getTabungan().getSaldo();
        System.out.println("Saldo sekarang = " + tmp + "\n\n");

        Nasabah wysts = new Nasabah("Wisnu", "Yudhosantoso");
        wysts.setTabungan(new Tabungan(10000));
        System.out.println(wysts.toString());
        System.out.println("-------------------------------------------------");

        System.out.println(Citra.toString());

        wysts.getTabungan().transfer(Citra.getTabungan(), 5000);
        System.out.println(wysts.toString());

        System.out.println(Citra.toString());
        
        Citra.getTabungan().transfer(wysts.getTabungan(), 40000);
        System.out.println(Citra.toString());
        
        System.out.println(wysts.toString());
        
    }
}
