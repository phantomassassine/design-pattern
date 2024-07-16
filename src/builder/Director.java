package builder;

/**
 * 使用Builder类中声明的方法编写文档。
 * 实际上传递给Director类构造函数的是Builder类的子类实例，子类决定了编写文档的形式。
 * Director仅使用Builder提供的方法，但并不关心实际编写的文档到底是TextBuilder还是HTMLBuilder
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {              // 因为接收的参数是Builder类的子类
        this.builder = builder;                     // 所以可以将其保存在builder字段中
    }

    /**
     * 编写内容
     * 方法都是Builder类中声明的方法
     */
    public void construct() {                       // 编写文档
        builder.makeTitle("Greeting");              // 标题
        builder.makeString("从早上至下午");         // 字符串
        builder.makeItems(new String[]{             // 条目
            "早上好。",
            "下午好。",
        });
        builder.makeString("晚上");                 // 其他字符串
        builder.makeItems(new String[]{             // 其他条目
            "晚上好。",
            "晚安。",
            "再见。",
        });
        builder.close();                            // 完成文档
    }
}
