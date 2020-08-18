package cn.kerninventory.demos.internetprinciple.datastructure.linkedlist;

/**
 * <h1>节点元素</h1>
 * <p>
 *     链表的节点元素
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Node {

    private int index;
    protected Node previousNode;
    protected Node nextNode;

    public Node(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public Node setIndex(int index) {
        this.index = index;
        return this;
    }

    @Override
    public String toString() {
        return "" + index;
    }
}
