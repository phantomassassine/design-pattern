package iterator;

public interface Iterator {
    public abstract boolean hasNext();

    // 返回下一元素，同时向后移动迭代器
    public abstract Object next();
}
