public class BinaryTreeMain14 {
    public static void main(String[] args) {
        BinaryTree14 bst = new BinaryTree14();

        bst.add(new Mahasiswa14("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa14("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa14("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa14("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal): ");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa: ");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa14("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa14("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa14("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa: ");
        System.out.println("InOrder Traversal  : ");
        bst.traverseInOrder(bst.root);
        System.out.println("PreOrder Traversal : ");
        bst.traversePreOrder(bst.root);
        System.out.println("PostOrder Traversal: ");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal): ");
        bst.traverseInOrder(bst.root);

        bst.addRekursif(new Mahasiswa14("244160144", "Grace", "B", 3.89));
        bst.addRekursif(new Mahasiswa14("244160145", "Michelle", "C", 3.90));
        bst.addRekursif(new Mahasiswa14("244160146", "Nanda", "A", 3.87));
        System.out.println("\nMenambah data mahasiswa secara rekursif");
        bst.traverseInOrder(bst.root);

        System.out.println();
        Mahasiswa14 mhsMin = bst.cariMin();
        mhsMin.tampilInformasi();

        System.out.println();
        Mahasiswa14 mhsMax = bst.cariMax();
        mhsMax.tampilInformasi();

        System.out.println("\nData Mahasiswa yang IPK diatas 3.6 : ");
        bst.tampilMahasiswaIPKdiAtas(bst.root, 3.6);
    }
}
