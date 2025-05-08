public class PersetujuanKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int maxProsesDPA = 30;
    int jumlahSudahDiproses = 0;

    public PersetujuanKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear(){
        if (!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs){
        if(IsFull()){
            System.out.println("Antrian penuh, tidak dapat menambahkan mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public void layaniMahasiswa(){
        if (size < 2){
            System.out.println("Antrian tidak cukup untuk memanggil 2 mahasiswa");
        } else {
            for (int i = 0; i < 2; i++){
                Mahasiswa mhs = data[front];
                System.out.println("Memanggil Mahasiswa: " + mhs.nama);
                front = (front + 1) % max;
                size--;
                jumlahSudahDiproses++;
            }
        }
    }

    public void tampilkanSemua(){
        if(IsEmpty()){
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa Dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatTerdepan(){
        if(IsEmpty()){
            System.out.println("Antrian kosong.");
        } else if (size == 1) {
            System.out.println("Hanya ada satu mahasiswa dalam antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        } else {
            System.out.println("2 Mahasiswa terdepan dalam antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    public void lihatAkhir(){
        if(IsEmpty()){
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public void cetakJumlahProsesKRS() {
        System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + jumlahSudahDiproses);
    }

    public void cetakJumlahBelumProsesKRS() {
        int belumDiproses = maxProsesDPA - jumlahSudahDiproses;
        if (belumDiproses < 0) {
            belumDiproses = 0;
        }
        System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + belumDiproses);
    }
}
