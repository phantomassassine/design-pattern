# Builder模式——组装复杂的实例

Builder模式用于组装具有复杂结构的实例。

示例程序使用Builder模式编写文档程序，该文档具有以下结构：含有一个标题，含有若干个字符串，含有条目项目。

![builder](asset/builder.jpg)

## 角色

* **Builder**（建造者）：负责定义用于生成实例的接口。
* **ConcreteBuilder**（具体的建造者）：负责实现Builder角色的接口类。
* **Director**（监工）：负责使用Builder角色的接口来生成实例，只调用Builder中定义的方法。
* **Client**（使用者）：使用建造者模式。