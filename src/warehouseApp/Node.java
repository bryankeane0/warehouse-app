package warehouseApp;

public class Node<N> {

    public Node<N> next=null;
    private N contents; //ADT reference

    public N getContents() {
        return contents;
    }

    public void setContents(N c) {
        this.contents = c;
    }

}