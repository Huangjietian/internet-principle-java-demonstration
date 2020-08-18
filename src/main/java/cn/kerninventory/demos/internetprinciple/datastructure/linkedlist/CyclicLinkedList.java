package cn.kerninventory.demos.internetprinciple.datastructure.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class CyclicLinkedList extends LinkedList {

    public static <R> List<R> cyclicOperateElementBy(Node node, Function<Node, R> function) {
        Node initialPosition = node;
        List<R> rList = new ArrayList<>(16);
        while (node != null) {
            rList.add(function.apply(node));
            node = node.nextNode;
            if (node.equals(initialPosition)) {
                node = null;
            }
        }
        return rList;
    }

    @Override
    public Node pop() {
        Node node = super.pop();
        if (tail != null && !tail.equals(head))
            tail.nextNode = head;
        return node;
    }

    @Override
    public void append(Node node) {
        super.append(node);
        if (size > 1) {
            tail.nextNode = head;
        }
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
                    //此处需要重新维护tail的next引用
                    if (n2.equals(tail)) {
                        tail = n1;
                        if (!tail.equals(head))
                            tail.nextNode = head;
                    }
                    n1.nextNode = n3;

                    size --;
                } else {
                    n1 = n1.nextNode;
                }
            }
        }
    }

    @Override
    public void print() {
        StringBuilder builder = new StringBuilder();
        Node node = head;
        while (node != null) {
            builder.append(" -> " + node.toString() + "[" + size + "]");
            node = node.nextNode;
            //避免死循环
            if (head.equals(node))
                node = null;
        }
        System.out.println(builder.toString());
    }
}
