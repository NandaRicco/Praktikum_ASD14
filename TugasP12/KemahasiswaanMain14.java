import java.util.Scanner;

public class KemahasiswaanMain14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilih;

        Kemahasiswaan14 antrian = new Kemahasiswaan14();

        do {
            System.out.println("\n=== Menu Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Cek Antrian Kosong");
            System.out.println("3. Cek Antrian Penuh");
            System.out.println("4. Kosongkan Antrian");
            System.out.println("5. Memanggil Antrian");
            System.out.println("6. Tampilkan Antrian Terdepan");
            System.out.println("7. Tampilkan Antrian Terbelakang");
            System.out.println("8. Tampilkan Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = input.nextLine();
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = input.nextLine();
                    Mahasiswa14 dataMhs = new Mahasiswa14(nim, nama, kelas, prodi);
                    antrian.tambahAntrian(dataMhs);
                    break;

                case 2:
                    System.out.println(antrian.isEmpty() ? "Antrian masih kosong" : "Antrian sudah terisi");
                    break;

                case 3:
                    System.out.println(antrian.isFull() ? "Antrian sudah penuh" : "Antrian belum penuh");
                    break;

                case 4:
                    antrian.clear();
                    break;

                case 5:
                    antrian.panggilAntrian();
                    break;

                case 6:
                    antrian.antrianTerdepan();
                    break;

                case 7:
                    antrian.antrianTerbelakang();
                    break;

                case 8:
                    antrian.jumlahAntrian();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (pilih != 0);

        input.close();
    }
}
