
/// example12
public class node<T> {
    private T element;
    private node<T> next;

    public node()            { element = null;    next = null; }
    public node(T element)   { this.element = element; next = null; }

    public node<T> getNext()               { return next; }
    public void setNext(node<T> next)      { this.next = next; }
    public T getElement()                  { return element; }
    public void setElement(T element)      { this.element = element; }
}