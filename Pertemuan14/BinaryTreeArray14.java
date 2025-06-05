public class BinaryTreeArray14 {
    Mahasiswa14[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray14(){
        this.dataMahasiswa = new Mahasiswa14[10];
        this.idxLast = -1;
    }

    void populateData (Mahasiswa14 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast){
            if (dataMahasiswa[idxStart] != null){
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa14 mhs) {
        if (idxLast + 1 < dataMahasiswa.length) {
            idxLast++;
            dataMahasiswa[idxLast] = mhs;
        } else {
            System.out.println("Tree penuh");
        }
    }

    void traversePreOrder(int idxStart){
        if (idxStart <= idxLast){
            if (dataMahasiswa[idxStart] != null){
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 1);
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}
