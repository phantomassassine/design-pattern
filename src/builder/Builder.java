package builder;

/**
 * 声明一个编写文档的方法的抽象类
 */

public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
