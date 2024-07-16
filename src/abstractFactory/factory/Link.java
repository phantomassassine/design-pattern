package abstractFactory.factory;

/**
 * 抽象表示HTML超链接的类
 * 由于没有实现父类Item中的抽象方法makeHTML，因此它也是抽象类。
 */
public abstract class Link extends Item {
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
