import java.util.Scanner;

public class SLLMain14 {
    public static void main(String[] args) {
        SingleLinkedList14 sll = new SingleLinkedList14();
        // Scanner sc = new Scanner(System.in);
        // int pilihan;

        // do {
        //     System.out.println("\nMenu:");
        //     System.out.println("1. Tambah Data Mahasiswa");
        //     System.out.println("2. Tampilkan Data");
        //     System.out.println("3. Keluar");
        //     System.out.print("Pilih menu: ");
        //     pilihan = sc.nextInt();
        //     sc.nextLine();

        //     switch (pilihan) {
        //         case 1:
        //             System.out.print("NIM  : ");
        //             String nim = sc.nextLine();
        //             System.out.print("Nama : ");
        //             String nama = sc.nextLine();
        //             System.out.print("Kelas: ");
        //             String kelas = sc.nextLine();
        //             System.out.print("IPK  : ");
        //             double ipk = sc.nextDouble();
        //             sc.nextLine();

        //             Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
        //             sll.addLast(mhs);
        //             System.out.println("Data berhasil ditambahkan.");
        //             break;

        //         case 2:
        //             System.out.println("\nDaftar Mahasiswa:");
        //             sll.print();
        //             break;

        //         case 3:
        //             System.out.println("Terima kasih!");
        //             break;

        //         default:
        //             System.out.println("Pilihan tidak valid.");
        //     }

        // } while (pilihan != 3);

        // sc.close();
        Mahasiswa14 mhs1 = new Mahasiswa14("2201", "Nanda", "TI-1A", 3.9);
        Mahasiswa14 mhs2 = new Mahasiswa14("2202", "Grace", "TI-1B", 3.6);
        Mahasiswa14 mhs3 = new Mahasiswa14("2203", "Michelle", "TI-1C", 3.8);
        Mahasiswa14 mhs4 = new Mahasiswa14("2204", "Trisha", "TI-1D", 3.4);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Trisha", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data index 1");
        sll.getData(1);

        System.out.println("data mahasiswa an Grace berada pada index : " + sll.indexOf("Grace"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}