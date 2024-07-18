# Mediator模式——只有一个仲裁者

仲裁者模式不让个个对象（Colleague）之间互相通信，而是增加一个仲裁者（Mediator）角色，让他们各自与仲裁者通信，然后将控制显示的逻辑处理交给仲裁者负责。

示例程序是一个GUI应用程序，展示了一个登录对话框。

![mediator](asset/mediator.jpg)
![mediator2](asset/mediator2.jpg)
## 角色

* **Mediator**（仲裁者、中介者）：定义与Colleague角色进行通信和做出决定的接口。
* **Colleague**（同事）：定义与Mediator角色进行通信的接口。
* **ConcreteMediator**（具体仲裁者）：实现Mediator接口。
* **ConcreteColleague**（具体同事）：实现Colleague接口。