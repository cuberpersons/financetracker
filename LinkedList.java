package app;

public class LinkedList<T> {

  private int size;
  private Node<T> head = null;

  public LinkedList() {
    this.head = null;
    this.size = 0;
  }

  public LinkedList(Node<T> first) {
    this.head = first;
    this.size = 1;
  }

  public int size() {
    return size;
  }

  public Node<T> getHead() {
    return head;
  } 

  public boolean addElement(T element) {
    boolean isAdded = false;
    if (this.head == null) {
        Node<T> newNode = new Node<T>(element, null);
        this.head = newNode;
        isAdded = true;
    }
    else {
        Node<T> curr = this.head;
        addHelper(curr, element, isAdded);
    }
    size++;
    return isAdded;
  }

  private boolean addHelper(Node<T> curr, T element, boolean isAdded) {
    if (curr.getNext() == null) {
        Node<T> newNode = new Node<T>(element, null);
        curr.setNext(newNode);
        isAdded = true;
        return isAdded;
    }
    else {
        curr = curr.getNext();
    }
    return isAdded;
  }

  public boolean removeElement(T element) {
    boolean isRemoved = false;
    if (this.head == null) {
        throw new NullPointerException("The list is empty, no data exists.");
    }
    else if (this.head.getData() == element) {
        Node<T> temp = this.head.getNext();
        this.head = temp;
        isRemoved = true;
    }
    else {
        Node<T> curr = this.head;
        isRemoved = removeHelper(curr, element, isRemoved);
    }
    size--;
    return isRemoved;
  }

  private boolean removeHelper(Node<T> curr, T element, boolean isRemoved) {
    if (curr.getNext().getData() == element) {
        curr.setNext(curr.getNext().getNext());
        isRemoved = true;
    }
    else {
        curr = curr.getNext();
    }
    return isRemoved;
  }
}