public class Kemahasiswaan14 {
    Node14 head;
    Node14 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return false;
    }

    public void clear() {
        head = tail = null;
        System.out.println("Antrian dikosongkan");
    }

    public void tambahAntrian(Mahasiswa14 mhs) {
        Node14 baru = new Node14(mhs, null);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa yang dipanggil:");
            head.data.tampilInformasi();
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void antrianTerdepan() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terdepan:");
            head.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void antrianTerbelakang() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling akhir:");
            tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void jumlahAntrian() {
        int count = 0;
        Node14 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Jumlah mahasiswa dalam antrian: " + count);
    }

    public void tampilAntrian() {
        Node14 current = head;
        if (current == null) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Isi Antrian:");
            while (current != null) {
                current.data.tampilInformasi();
                System.out.println("-------------------");
                current = current.next;
            }
        }
    }
}
