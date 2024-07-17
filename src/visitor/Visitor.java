package visitor;

/**
 * 表示访问者的抽象类，依赖于它所访问的数据结构
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
