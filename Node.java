public class Node<T> {
    private T t;
    private Node<T> list;

    public void set(T t){
        this.t=t;
    }

    public T get(){
        return t;
    }

    public T nextNode(){

    }
    
    public T root(){

    }

    public String toString(){
        return t.toString();
    }
}
