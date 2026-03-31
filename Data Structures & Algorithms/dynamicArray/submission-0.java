class DynamicArray {

    private int[] arr; 
    private int len;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.len = 0;
        this.arr = new int[this.capacity];

    }

    public int get(int i) {
        return arr[i];

    }

    public void set(int i, int n) {
        arr[i]= n;

    }

    public void pushback(int n) {
        if(len == capacity){
            resize();
        }
        arr[len] = n;
        len++;

    }

    public int popback() {
        if(len >0 ){
            len--;
        }
        return arr[len];

    }

    private void resize() {
        capacity = capacity * 2; 
        int[] newArr = new int[capacity];
        for(int i =0;i< len;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;

    }

    public int getSize() {
        return len ;

    }

    public int getCapacity() {
        return capacity;

    }
}
