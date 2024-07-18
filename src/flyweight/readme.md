# Flyweight模式——共享对象，避免浪费

通过尽量共享实例来避免创建新实例。

![flyweight](asset/flyweight.jpg)

## 角色

* **Flyweight**（轻量级）：表示哪些实例会被共享的类。
* **FlyweightFactory**（轻量级工厂）：生成Flyweight。
* **Client**（请求者）。