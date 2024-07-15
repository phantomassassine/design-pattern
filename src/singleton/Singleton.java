package singleton;

public class Singleton {

    /**
     * 构造函数声明为private，禁止外部类调用构造函数
     */
    private static Singleton singleton = new Singleton();
    private Singleton() {                                 
        System.out.println("生成了一个实例。");
    }

    /**
     * 初始化行为仅在该类被加载时进行
     * @return singleton静态实例
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
