package abstractFactory.factory;

@SuppressWarnings("deprecation")
public abstract class Factory {

    /**
     * 调用Class类的forName方法动态读取类信息，使用newInstance方法生成该类的实例
     * @param classname 根据指定类名
     * @return 生成具体工厂的实例
     */
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("no such " + classname + " class");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 虽然getFactory方法生成具体工厂实例，但返回值类型是抽象工厂类型
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
