public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KuePesanan("Kue tart", 60000, 9);
        kueArray[1] = new KuePesanan("Bika ambon", 13000, 3);
        kueArray[2] = new KuePesanan("Roti gulung", 8000, 2.4);
        kueArray[3] = new KuePesanan("Lapis legit", 16000, 4);
        kueArray[4] = new KuePesanan("Donat", 5000, 1);
        kueArray[5] = new KuePesanan("Brownies", 3000, 2.5);
        kueArray[6] = new KuePesanan("Kue Putu ayu", 7000, 1.8);
        kueArray[7] = new KuePesanan("Kue Nastar", 20000, 3);
        kueArray[8] = new KuePesanan("Kue Kestengel", 30000, 2.5);
        kueArray[9] = new KuePesanan("Apem", 2500, 1);
        kueArray[10] = new KueJadi("Kue Kering", 30000, 40);
        kueArray[11] = new KueJadi("Kue Klepon", 4000, 13);
        kueArray[12] = new KueJadi("Kue Kue Cubir", 9000, 2);
        kueArray[13] = new KueJadi("Kue Dadar Gulung", 1000, 12);
        kueArray[14] = new KueJadi("Kue Kue Cubir", 3000, 9);
        kueArray[15] = new KueJadi("Kue Onde-Onde", 9000, 6);
        kueArray[16] = new KueJadi("Kue Kue Cubir", 30000, 5);
        kueArray[17] = new KueJadi("Kue Pia", 20000, 2);
        kueArray[18] = new KueJadi("Kue Kue Cubir", 4000, 7);
        kueArray[19] = new KueJadi("Kue Brownies Mini", 2500, 4);

        System.out.println("----------------------------------------------------");
        System.out.println("                 Tampilkan semua kue                ");
        System.out.println("----------------------------------------------------");
        for (Kue kue : kueArray) {
            System.out.println(kue);
        }

        double totalHargaSemuaKue = 0;
        for (Kue kue : kueArray) {
            totalHargaSemuaKue += kue.hitungHarga();
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Total Harga Semua Kue: " + totalHargaSemuaKue);
        System.out.println("----------------------------------------------------");

        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga KuePesanan: " + totalHargaKuePesanan);
        System.out.println("Total Berat KuePesanan: " + totalBeratKuePesanan + " kg");
        System.out.println("----------------------------------------------------");
        double totalHargaKueJadi = 0;
        int totalJumlahKueJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga KueJadi: " + totalHargaKueJadi);
        System.out.println("Total Jumlah KueJadi: " + totalJumlahKueJadi);
        System.out.println("----------------------------------------------------");
        Kue kueTermahal = kueArray[0];
        for (Kue kue : kueArray) {
            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }
        System.out.println("Kue dengan Harga Terbesar: " + kueTermahal.hitungHarga());
        System.out.println("----------------------------------------------------");
    }
}