package cn.kerninventory.demos.internetprinciple.datastructure.linkedlist;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public interface Linked {

    //访问第一个元素
    Node pop();

    void append(Node node);

    void remove(Node node);

    int size();

    void print();

}
