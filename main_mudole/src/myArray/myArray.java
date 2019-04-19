package myArray;

public class myArray implements dyArray {
    public int size;
    int[] data ;

    public myArray(int capcity) {
        data = new int[capcity];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void add(int index, int element) {

    }
}
