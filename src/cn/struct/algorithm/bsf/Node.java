package cn.struct.algorithm.bsf;

/**
 * @author chenghuan
 * @Description 模型节点
 * @Date 2019/8/15 20:27
 */
public class Node {
    /**
     * 节点Id
     */
    private String id;

    /**
     * 父节点
     */
    private Node parent;

    /**
     * 构造函数
     * @param id
     * @param parent
     */
    public Node(String id,Node parent) {
        this.id = id;
        this.parent = parent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
