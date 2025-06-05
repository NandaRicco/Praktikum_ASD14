public class BinaryTreeArrayMain14 {
    public static void main(String[] args) {
        BinaryTreeArray14 bta = new BinaryTreeArray14();

        Mahasiswa14 mhs1 = new Mahasiswa14("244160121", "Ali", "A", 3.57);
        Mahasiswa14 mhs2 = new Mahasiswa14("244160185", "Candra", "C", 3.21);
        Mahasiswa14 mhs3 = new Mahasiswa14("244160221", "Badar", "B", 3.85);
        Mahasiswa14 mhs4 = new Mahasiswa14("244160220", "Dewi", "B", 3.54);

        Mahasiswa14 mhs5 = new Mahasiswa14("244160131", "Devi", "A", 3.72);
        Mahasiswa14 mhs6 = new Mahasiswa14("244160205", "Ehsan", "D", 3.37);
        Mahasiswa14 mhs7 = new Mahasiswa14("244160170", "Fizi", "B", 3.46);

        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs7);

        System.out.println("\nPreOrder Travelsal: ");
        bta.traversePreOrder(0);
    }
}
