public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    String prodi;

    Mahasiswa14() {
        
    }

    Mahasiswa14(String nim, String nama, String kelas, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.prodi = prodi;
    }

    public void tampilInformasi() {
        System.out.println(nama + "    " + nim + "    " + kelas + "    " + prodi);
    }
}
