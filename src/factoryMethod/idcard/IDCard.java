package factoryMethod.idcard;
import factoryMethod.framework.*;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println("create " + owner + "'s card");
        this.owner = owner;
    }
    public void use() {
        System.out.println("use" + owner + "'s card");
    }
    public String getOwner() {
        return owner;
    }
}
