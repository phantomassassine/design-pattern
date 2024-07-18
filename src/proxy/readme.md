# Proxy模式——只在必要时生成实例

![proxy](asset/proxy.jpg)

## 角色

* **Subject**（主体）：定义了使Proxy和RealSubject之间具有一致性的接口。
* **Proxy**（代理人）：尽量处理来自Client的请求
* **RealSubject**（实际主体）：在Proxy无法胜任工作时出场。
* **Client**（请求者）