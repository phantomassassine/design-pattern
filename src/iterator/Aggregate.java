package iterator;

/**
 * Aggregate所要遍历集合的接口，
 * 实现本接口的类将成为一个可以保存多个元素的集合
 */
public interface Aggregate {

    /**
     * @return 用于遍历集合的迭代器
     */
    public abstract Iterator iterator();
}
