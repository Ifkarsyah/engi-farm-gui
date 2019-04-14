import java.util.*;

public class List<T> {
    private LinkedList<T> arr;

    public List() {
        arr = new LinkedList<T>();
    }

    // // Copy Constructor
    // // Need to copy ALL element
    // List(const List& l) {
    //     arr = new T*[100];
    //     size = l.size;
    //     for (int i = 0; i < l.size; i++) {
    //         arr[i] = new T(*(l.arr[i]));
    //     }
    // }

    // // Destructor
    // // Need to delete ALL elements first
    // ~List() {
    //     for (int i = 0; i < this->size; i++) {
    //         delete arr[i];
    //     }

    //     delete arr;
    // }

    // // operator overloading=
    // // Needed to copy ALL elements
    // List& operator=(const List& l) {
    //     for (int i = 0; i < this->size; i++) {
    //         delete arr[i];
    //     }

    //     delete arr;

    //     arr = new T*[100];

    //     this->size = l.size;

    //     for (int i = 0; i < this->size; i++) {
    //         arr[i] = new T(*(l.arr[i]));
    //     }
    // }

    // Mengembalikan indeks dimana elemen ditemukan, -1 jika tidak ada
    int find(T el) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == el) {
                return i;
            }
        }
        return -1;
    }

    // Mengembalikan True jika linked list kosong
    boolean isEmpty() { return arr.size() == 0; }

    // // Menambahkan elemen sebagai elemen paling akhir
    void add(T el) {
        arr.add(el);
    }

    // Membuang elemen pertama dari linked list sama
    void remove(T el) {
        arr.remove(el);
    }

    // Mengembalikan elemen p
    T get(int p) {
        return arr.get(p);
    }

    T removeFirst() {
        return arr.removeFirst();
    }

    int getSize(){
        return arr.size();
    }

};