import org.w3c.dom.Node;

public class BinaryTree14 {
    Node14 root;

    public BinaryTree14() {

    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa14 mahasiswa) {
        Node14 newNode = new Node14(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node14 current = root;
            Node14 perent = null;
            while (true) {
                perent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        perent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        perent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node14 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node14 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node14 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node14 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node14 getSuccessor(Node14 del) {
        Node14 successor = del.right;
        Node14 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binnary Tree Kosong");
            return;
        }
        Node14 parent = root;
        Node14 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node14 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public Node14 addRekusif(Node14 cureent, Mahasiswa14 mahasiswa) {
        if (cureent == null) {
            return new Node14(mahasiswa);
        }
        if (mahasiswa.ipk < cureent.mahasiswa.ipk) {
            cureent.left = addRekusif(cureent.left, mahasiswa);
        } else {
            cureent.right = addRekusif(cureent.right, mahasiswa);
        }
        return cureent;
    }

    public void addRekursif(Mahasiswa14 mahasiswa) {
        root = addRekusif(root, mahasiswa);
    }

    public Mahasiswa14 cariMin() {
        if (root == null) {
            return null;
        }
        Node14 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil adalah: " + current.mahasiswa.nama);
        return current.mahasiswa;
    }

    public Mahasiswa14 cariMax() {
        if (root == null) {
            return null;
        }
        Node14 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK terbesar adalah: " + current.mahasiswa.nama);
        return current.mahasiswa;
    }

    public void tampilMahasiswaIPKdiAtas(Node14 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);

            if (node.mahasiswa.ipk > ipkBatas) {
                System.out.println("Nama: " + node.mahasiswa.nama + " " + "IPK: " + node.mahasiswa.ipk);
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}
