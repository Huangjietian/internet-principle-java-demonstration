package cn.kerninventory.demos.internetprinciple.datastructure.linkedlist;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public interface DoubleLinked extends Linked {

    Node invertedPop();

    void appendFront(Node node);

    Node removeFront();

    Node removeBack();
}
