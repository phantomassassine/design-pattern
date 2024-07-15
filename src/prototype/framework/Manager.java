package prototype.framework;
import java.util.*;

/**
 * 使用Product接口来复制实例
 */
public class Manager {
    private HashMap showcase = new HashMap();

    /**
     * 接收“名字-实例”注册到showcase里
     * @param name
     * @param proto
     */
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    public Product create(String protoname) {
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
