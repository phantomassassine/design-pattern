package factoryMethod.framework;

/**
 * 使用了模板方法模式，还声明了用于生产产品和注册产品的抽象方法
 * 具体处理则交给Factory的子类去处理
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
