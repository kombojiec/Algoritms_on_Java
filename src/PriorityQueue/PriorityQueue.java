package PriorityQueue;

import Interfaces.Collection;

/* Класс, имитирующий приоритетную очередь. */
public class PriorityQueue implements Collection<Integer> {
    int size;
    int amount;
    int[] data;

    public PriorityQueue(int size){
        this.size = size;
        data = new int[size];
        amount = 0;
    }


    @Override
    public void insert(Integer el) {
        if(isFull())
            throw new ArrayIndexOutOfBoundsException("Queue is full");
        if(isEmpty()) {
            data[amount++] = el;
            return;
        }
        int position = amount++;
        for (int i = amount-1; i > 0 ; i--) {
            if(data[i-1] < el){
                data[i] = data[i-1];
                position = i-1;
            } else {
                break;
            }
        }
        data[position] = el;
    }

    @Override
    public Integer remove() {
        if(!isEmpty()) {
            --amount;
            return data[amount];
        } else {
          throw new ArrayIndexOutOfBoundsException("Queue is empty");
        }
    }

    @Override
    public Integer peek() {
        if(!isEmpty())
            return data[amount-1];
        throw new ArrayIndexOutOfBoundsException("Queue is empty");
    }

    @Override
    public boolean isEmpty() {
        return amount == 0;
    }

    @Override
    public boolean isFull() {
        return amount == size;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            str.append(data[i]);
            str.append(" ");
        }
        return str.toString();
    }
}
