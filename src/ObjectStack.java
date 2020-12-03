public class ObjectStack<T> implements Stack<T>{
    private Node<T> top;

    private class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void push(T data){
        Node<T> aux = new Node<>(data);

        if (isEmpty()) {
            top = aux;
            aux.next = null;
        }else{
            aux.next = top;
            top = aux;
        }

    }

    public T pop(){
        Node<T> aux;
        T data;

        if(isEmpty()){
            throw new IndexOutOfBoundsException("Pilha vazia! Impossível remover.");
        }

        if(top.next==null){
            aux = top;
            top = null;
            data = aux.data;

        } else {
            aux = top;
            top = top.next;
            data = aux.data;

        }
        return data;

    }
}
