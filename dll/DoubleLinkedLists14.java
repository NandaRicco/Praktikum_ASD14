public class DoubleLinkedLists14 {
    Node14 head;
    Node14 tail;
    int size;

    public DoubleLinkedLists14() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa14 data) {
        Node14 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        Node14 newNode = new Node14(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
        size++;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Warning, data kosong");
        }
        Node14 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public Node14 search(String nim) {
        Node14 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List masih kosong, tidak dapat dihapus");
            return;
        }
        String namaTerhapus = head.data.nama;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println(
                "Data sudah berhasil dihapus. Data yang terhapus adalah Mahasiswa dengan nama " + namaTerhapus);
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List masih kosong, tidak dapat dihapus");
            return;
        }
        String namaTerhapus = head.data.nama;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println(
                "Data sudah berhasil dihapus. Data yang terhapus adalah Mahasiswa dengan nama " + namaTerhapus);
    }

    public void add(int index, Mahasiswa14 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node14 temp = head;
        int i = 0;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Indeks melebihi ukuran list");
            return;
        } else if (temp == tail) {
            addLast(data);
        } else {
            Node14 newNode = new Node14(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
        size++;
    }

    public void removeAfter(String key) {
        Node14 temp = head;

        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp.next == null) {
                    System.out.println("Tidak ada node setelah " + key);
                } else if (temp.next == tail) {
                    String namaTerhapus = head.data.nama;
                    if (head == tail) {
                        head = tail = null;
                    } else {
                        tail = tail.prev;
                        tail.next = null;
                    }
                    System.out.println("Mahasiswa setelah " + key + " terhapus");
                } else {
                    Node14 toDelete = temp.next;
                    temp.next = toDelete.next;
                    toDelete.next.prev = temp;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data dengan NIM " + key + " tidak ditemukan");
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak bisa dihapus");
        }
        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas");
        }
        if (index == 0) {
            String namaTerhapus = head.data.nama;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            System.out.println("Data sudah berhasil dihapus");

        } else {
            Node14 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            if (temp == tail) {
                String namaTerhapus = head.data.nama;
                if (head == tail) {
                    head = tail = null;
                } else {
                    tail = tail.prev;
                    tail.next = null;
                }
                System.out.println("Data sudah berhasil dihapus");
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                System.out.println("Data di index " + index + " berhasil dihapus.");
            }
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas.");
            return;
        }

        Node14 current = head;
        int count = 0;

        while (count < index) {
            current = current.next;
            count++;
        }

        current.data.tampil();
    }

    public void getSize() {
        System.out.println("Jumlah data dalam linked list: " + size);
    }
}
