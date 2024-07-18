# Memento模式——保存对象状态

备忘录模式通过引入表示实例状态的角色，可以在保存和恢复实例时有效地防止对象的封装性遭到破坏。

示例程序是一个收集水果和获得金钱数的掷骰子游戏。

![memento](asset/memento.jpg)
![memento2](asset/memento2.jpg)
## 角色

* **Originator**（生成者）：在保存自己的最新状态是生成Memento角色。当传递给它之前保存状态时会恢复到之前的节点。
* **Memento**（备忘录）：将Originator角色的内部消息整合在一起。
* **Caretaker**（负责人）：当Caretaker想要保存当前Originator的状态时会通知它。