# Iterator模式——一个一个遍历

迭代器模式用于在数据集合中按照顺序遍历集合。

实例程序作用将书Book放置到书架BookShelf中，并将书的名字按顺序显示出来。
![iterator](.\asset\iterator.jpg)

## 角色
* **Iterator**（迭代器）：负责定义但顺序逐个遍历元素的接口。
* **ConcreteIterator**（具体迭代器）：负责实现Iterator角色定义的接口。
* **Aggregate**（集合）：负责创建Iterator角色的接口。
* **ConcreteAggregate**（具体的集合）：负责实现Aggregate角色的接口。

## 拓展思路
* 引入Iterator设计模式后可以将遍历与实现分离开来，即不依赖于具体结合的实现。帮助我们编写可复用的类，使得当组件发生改变是只需进行小修改即可应对。
* 不要至使用具体类进行编程，优先使用抽象类和接口编程，以弱化类之间的耦合。
* `next`方法是“返回当前元素并指向下一元素”。
* `hasNext`方法请理解为“确认接下来是否还可以调用next方法。
* Java中，没有使用的实例对象会被自动删除，因此不需要对应的deleteIterator方法。