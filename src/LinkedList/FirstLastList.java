package LinkedList;

/* Класс, имитирующий  связанный список */
public class FirstLastList<T>{
    Node first;
    Node last;

    public void insertFirst(T value) {
        Node node = new Node(value);
        if(first == null) {
            first = node;
            last = node;
            return;
        }
        node.next = first;
        first = node;
    }

    public void insertLast(T value) {
        Node node = new Node(value);
        if(isEmpty()) {
            first = node;
            last = node;
            return;
        }
        last.next = node;
        last = node;
    }

    public Node deleteFirst() {
        if(first == null)
            throw new ArrayIndexOutOfBoundsException("Collection is empty");
        Node tmp = first;
        first = tmp.next;
        if(first == null){
            last = null;
        }
        return tmp;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public Node find(T value) {
        if(isEmpty())
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        Node current = first;
        while (current != null) {
            if(current.value == value)
                return current;
            current = current.next;
        }
        return null;
    }

    public Node delete(T value) {
        if(isEmpty())
            throw new ArrayIndexOutOfBoundsException("Array is Empty");
        Node current = first;
        Node prev = first;
        while(current.value != value) {
            if(current.next == null)
                return null;
            else {
                prev = current;
                current = current.next;
            }
        }
        if(current == first) {
            first = first.next;
        } else {
            prev.next = current.next;
        }
        return current;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        if(isEmpty())
            return "";
        Node current = first;
        while (current != null) {
            str.append(current.toString());
            current = current.next;
        }
        str.append("\n");
        return str.toString();
    }
}

class Node<T>{
    T value;
    Node next;

    Node(T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return value + " ";
    }
}
