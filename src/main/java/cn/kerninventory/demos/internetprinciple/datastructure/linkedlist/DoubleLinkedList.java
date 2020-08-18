package cn.kerninventory.demos.internetprinciple.datastructure.linkedlist;

/**
 * <h1>双向链表</h1>
 * <p>
 *
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class DoubleLinkedList implements DoubleLinked {

    protected Node head;
    protected Node tail;
    protected int size;

    @Override
    public Node invertedPop() {
        return removeBack();
    }

    @Override
    public void appendFront(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.previousNode = node;
            node.nextNode = head;
            node.previousNode = null;
            head = node;
        }

        size ++;
    }

    @Override
    public Node removeFront() {
        if (size == 0)
            return null;
        Node headNode = head;
        Node nextNode = headNode.nextNode;
        headNode.nextNode = null;
        if (nextNode != null)
            nextNode.previousNode = null;
        head = nextNode;
        if (size == 1)
            tail = null;
        size --;
        return headNode;
    }

    @Override
    public Node removeBack() {
        if (size == 0)
            return null;
        Node tailNode = tail;
        Node previousNode = tailNode.previousNode;
        tailNode.previousNode = null;
        if (previousNode != null)
            previousNode.nextNode = null;
        tail = previousNode;
        if (size == 1)
            head = null;
        size --;
        return tailNode;
    }

    @Override
    public Node pop() {
        return removeFront();
    }

    @Override
    public void append(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.nextNode = node;
            node.previousNode = tail;
            node.nextNode = null;
            tail = node;
        }

        size ++;
    }

    @Override
    public void remove(Node node) {
        if (size == 0)
            return;
        if (node == null)
            node = tail;
        if (node.equals(tail))
            removeBack();
        else if (node.equals(head))
            removeFront();
        else {
            Node previous = node.previousNode;
            Node next = node.nextNode;
            node.previousNode = null;
            node.nextNode = null;
            previous.nextNode = next;
            next.previousNode = previous;
            size --;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        StringBuilder builder = new StringBuilder();
        Node node = head;
        while (node != null) {
            builder.append(node.toString() + "[" + size + "]");
            node = node.nextNode;
            if (node != null)
                builder.append(" -> ");
        }
        System.out.println(builder.toString());
    }
}
