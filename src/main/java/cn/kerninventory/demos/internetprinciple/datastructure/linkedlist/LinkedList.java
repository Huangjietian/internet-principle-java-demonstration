package cn.kerninventory.demos.internetprinciple.datastructure.linkedlist;

/**
 * <h1>单项链表</h1>
 * <p>
 *
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class LinkedList implements Linked {

    protected Node head;
    protected Node tail;
    protected int size;

    @Override
    public Node pop() {
        if (size == 0)
            return null;

        Node headNode = head;
        head = headNode.nextNode;
        headNode.nextNode = null;
        size --;

        if (size == 0)
            tail = null;
        return headNode;
    }

    @Override
    public void append(Node node) {
        node.nextNode = null;
        if (head == null) {
            head = node;
        } else {
            tail.nextNode = node;
        }
        tail = node;
        size ++;
    }

    @Override
    public void remove(Node node) {
        //没有元素可以删除
        if (size == 0) {
            return;
        }
        //默认删除最后一个
        if (node == null)
            node = tail;

        if (node.equals(head)) {
            pop();
        } else {
            Node n1 = head;
            Node n2;
            while (n1 != null && (n2 = n1.nextNode) != null) {
                if (n2.equals(node)) {
                    Node n3 = node.nextNode;
                    node.nextNode = null;
                    if (n2.equals(tail))
                        tail = n1;
                    n1.nextNode = n3;

                    size --;
                } else {
                    n1 = n1.nextNode;
                }
            }
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
            builder.append(" -> " + node.toString() + "[" + size + "]");
            node = node.nextNode;
        }
        System.out.println(builder.toString());
    }

}
