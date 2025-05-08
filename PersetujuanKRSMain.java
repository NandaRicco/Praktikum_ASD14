import java.util.Scanner;

public class PersetujuanKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersetujuanKRS antrian = new PersetujuanKRS(10);

        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Mahasiswa Terakhir");
            System.out.println("7. Cetak Jumlah yang Sudah Proses KRS");
            System.out.println("8. Cetak Jumlah yang Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("10. Cek Antrian Kosong");
            System.out.println("11. Cek Antrian Penuh");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.layaniMahasiswa();
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;

                case 4:
                    antrian.tampilkanSemua();
                    break;

                case 5:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + antrian.getJumlahAntrian());
                    break;

                case 6:
                    antrian.lihatAkhir();
                    break;

                case 7:
                    antrian.cetakJumlahProsesKRS();
                    break;

                case 8:
                    antrian.cetakJumlahBelumProsesKRS();
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 10:
                    if (antrian.IsEmpty()){
                        System.out.println("Antrian masih kosong");   
                    } else {
                        System.out.println("Antrian sudah terisi");
                    }
                    break;

                case 11:
                    if (antrian.IsFull()){
                        System.out.println("Antrian sudah penuh");
                    } else {
                        System.out.println("Antrian belum penuh");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
