# State模式——用类表示状态

示例程序是一个金库报警系统

![state](asset/state.jpg)

## 角色
* **State**（状态）：定义了根据不同状态进行不同处理的接口，该接口是依赖于状态的处理方法集合。
* **ConcreteState**（具体状态）。
* **Context**（状况、前后关系、上下文）：Context持有当前状态的ConcreteState。