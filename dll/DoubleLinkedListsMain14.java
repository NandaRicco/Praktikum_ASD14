import java.util.Scanner;

public class DoubleLinkedListsMain14 {

    public static Mahasiswa14 inputMahasiswa(Scanner sc) {
        System.out.print("NIM  : ");
        String nim = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK  : ");
        double ipk = sc.nextDouble(); 
        sc.nextLine();
        return new Mahasiswa14(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedLists14 list = new DoubleLinkedLists14();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah di posisi tertentu (NIM)");
            System.out.println("8. Tambah di posisi tertentu (Index)");
            System.out.println("9. Hapus di posisi tertentu (NIM)");
            System.out.println("10. Hapus di posisi tertentu (Index)");
            System.out.println("11. Ambil Data Awal");
            System.out.println("12. Ambil Data Akhir");
            System.out.println("13. Ambil Data tententu (Index)");
            System.out.println("14. Tampilkan jumlah size");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa14 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                    
                case 2 -> {
                    Mahasiswa14 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                    
                case 3 -> list.removeFirst();

                case 4 -> list.removeLast();

                case 5 -> list.print();

                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node14 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan: ");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                }

                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari (key): ");
                    String key = scan.nextLine();

                    Mahasiswa14 mhs = inputMahasiswa(scan);
                    list.insertAfter(key, mhs);
                }
                
                case 8 -> {
                    System.out.print("Masukkan Index yang dicari: ");
                    int index = scan.nextInt();
                    scan.nextLine();

                    Mahasiswa14 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                }

                case 9 -> {
                    System.out.print("Masukkan NIM yang akan dihapus setelahnya: ");
                    String key = scan.nextLine();

                    list.removeAfter(key);
                }

                case 10 -> {
                    System.out.print("Masukkan Index yang akan dihapus: ");
                    int index = scan.nextInt();
                    scan.nextLine();

                    list.remove(index);
                }

                case 11 -> list.getFirst();

                case 12 -> list.getLast();

                case 13 -> {
                    System.out.print("Masukkan Index yang mau ditampilkan: ");
                    int index = scan.nextInt();
                    scan.nextLine();

                    list.getIndex(index);
                }

                case 14 -> list.getSize();

                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("");
            }
        } while (pilihan != 0);
        scan.close();
    }
}
