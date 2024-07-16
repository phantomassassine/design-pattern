package strategy;

/**
 * 猜拳策略地抽象方法接口
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
