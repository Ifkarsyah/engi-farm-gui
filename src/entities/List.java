package entities;
import java.util.*;

public class List<T> {
    private LinkedList<T> arr;

    public List() {
        arr = new LinkedList<T>();
    }

    // operator overloading=
    // Needed to copy ALL elements
    public void copy(List<T> l) {
        for (int i = 0; i < l.getSize(); i++) {
            arr.add(l.get(i));
        }
    }

    // Mengembalikan indeks dimana elemen ditemukan, -1 jika tidak ada
    public int find(T el) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == el) {
                return i;
            }
        }
        return -1;
    }

    // Mengembalikan True jika linked list kosong
    public boolean isEmpty() { return arr.size() == 0; }

    // // Menambahkan elemen sebagai elemen paling akhir
    public void add(T el) {
        arr.add(el);
    }

    // Membuang elemen pertama dari linked list sama
    public void remove(T el) {
        arr.remove(el);
    }

    // Mengembalikan elemen p
    public T get(int p) {
        return arr.get(p);
    }

    public T removeFirst() {
        return arr.removeFirst();
    }

    public int getSize(){
        return arr.size();
    }

};