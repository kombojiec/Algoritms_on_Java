package Interfaces;

public interface Collection<T>{
    void insert(T el);
    T remove();
    T peek();
    boolean isEmpty();
    boolean isFull();
}
