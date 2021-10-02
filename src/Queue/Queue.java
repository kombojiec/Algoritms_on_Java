package Queue;

/* Класс, имитирующий работу очереди на базе массива */
public class Queue <T>{
    private final int size;
    private int amount;
    private int head;
    private int tail;
    T[] data;

    {
     head = 0;
     tail = -1;
     amount = 0;
    }

    public Queue(int size){
        this.size = size;
        data = (T[]) new Object[size];
    }

    public void insert(T el){
        if(size - amount == 0)
            throw new ArrayIndexOutOfBoundsException("Queue is full");
        if(tail == size -1)
            tail = -1;
        data[++tail] = el;
        ++amount;
    }

    public T remove(){
        if(isEmpty())
            throw new ArrayIndexOutOfBoundsException("Queue is empty");
        T tmp = data[head++];
        if(head == size) {
            head = 0;
        }
        --amount;
        return tmp;
    }

    public T peek(){
        if(!isEmpty())
            return data[head];
        else throw new ArrayIndexOutOfBoundsException("Queue is empty");
    }

    public boolean isFull(){
        return amount == size;
    }

    public boolean isEmpty(){
        return amount == 0;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(T el: data) {
            str.append(el);
            str.append(" ");
        }
        return str.toString();
    }


}
