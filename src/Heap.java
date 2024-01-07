import java.util.*;

public class Heap<T extends Comparable<T>> {

    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }


    //insert method
    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    //delete method
    public T remove() throws Exception{
        if(list.isEmpty()) {
            throw new Exception("Heap is empty!");
        }
        //get root node to be removed
        T temp = list.get(0);

        //get last node
        T last = list.remove(list.size() - 1);

        if(!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }

        return temp;

    }

    private void upheap(int index) {
        if(index == 0) return;

        int parent_index = parent(index);

        //minheap: child >= parent
        if(list.get(index).compareTo(list.get(parent_index)) < 0) {
            swap(index, parent_index);
            upheap(parent_index);
        }
    }

    private void downheap(int index) {
        //minheap: node <= children
        //find smaller child

        int min_idx = index;
        int left_idx = left(index);
        int right_idx = right(index);

        if(left_idx < list.size() && list.get(min_idx).compareTo(list.get(left_idx)) > 0) {
            min_idx = left_idx;
        }

        if(right_idx < list.size() && list.get(min_idx).compareTo(list.get(right_idx)) > 0) {
            min_idx = right_idx;
        }

        //swap min and index

        if(index != min_idx) {
            swap(index, min_idx);
            downheap(min_idx);
        }


    }

    private int parent(int index) {
        return index / 2;
    }

    private void swap(int a, int b) {
        T temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    private int left(int index) {
        return index * 2;
    }

    private int right(int index) {
        return index * 2 + 1;
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()) {
            data.add(this.remove());//this keyword makes sure you are invoking the remove method from current class, and not Object calss
        }

        return data;
    }


}
