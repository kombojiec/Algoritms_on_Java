package Stack;

/* Класс, имитирующий работу стека на базе массива */
public class Stack <T>{
    private T[] stack;
    private int size;
    private int position;

    public Stack(int size){
        this.size = size;
        position = -1;
        stack = (T[]) new Object[size];
    }

    public void push(T el){
        if(isFull())
            throw new ArrayIndexOutOfBoundsException("Stack overflow");
        stack[++position] = el;
    }

    public T pop(){
        if(isEmpty()){
            throw  new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        return stack[position--];
    }

    public T peek(){
        return stack[position];
    }

    public boolean isEmpty(){
        return this.position == -1;
    }

    public boolean isFull(){
        return position == size -1;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i <= position; i++) {
            str.append(stack[i]);
            if(i != position)
                str.append(", ");
        }
        str.append("]\n");
        return str.toString();
    }
}
