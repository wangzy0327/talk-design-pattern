# Java设计模式

按照大话设计模式来梳理设计模式。七大设计原则

- 单一职责（简单来说，每个类或函数负责的功能要相对独立，保持高内聚）
- 接口隔离（类不应该包含实现其不需要的接口方法，接口拆分）
- 依赖倒置（高层不应依赖底层，面向抽象编程）
- 里式替换（子类最好不要改变父类已实现的方法，保证子类调实现用父类的方法与父类调用保持一致）
- 开闭原则（最重要，代码设计应该对修改关闭，对扩展开放）
- 迪米特原则（最小知道，类的方法不应该包含与其无关的类，保持低耦合）
- 合成复用原则（多用组合，少用继承，降低耦合性，提高扩展）



23种设计模式，按功能可分为创建型、结构型、行为型三种。

创建型：单例、抽象工厂、原型、建造者、工厂

结构型：适配器、桥接、装饰器、组合、外观、享元、代理

行为型：模板方法、命令、访问者、迭代器、观察者、中介者、备忘录、解释器、状态、策略、职责链（责任链）

### 单例模式

1）[饿汉式（静态常量）](src/main/java/com/wzy/singleton/type1/SingletonTest01.java)

2）[饿汉式（静态代码块）](src/main/java/com/wzy/singleton/type2/SingletonTest02.java)

3）[~~懒汉式（线程不安全）~~](src/main/java/com/wzy/singleton/type3/SingletonTest03.java)

4）[~~懒汉式（线程安全、同步方法）~~](src/main/java/com/wzy/singleton/type4/SingletonTest04.java)

5）[~~懒汉式（线程安全、同步代码块）~~](src/main/java/com/wzy/singleton/type5/SingletonTest05.java)

6）[懒汉式 - 双重检查（线程安全、效率高、推荐）](src/main/java/com/wzy/singleton/type6/SingletonTest06.java)

7）[静态内部类（线程安全、推荐）](src/main/java/com/wzy/singleton/type7/SingletonTest07.java)

8）[枚举（线程安全、防御反射攻击、防御序列化攻击，推荐）](src/main/java/com/wzy/singleton/type8/SingletonTest08.java)

### 简单工厂模式

示例：制造披萨饼

具体需求：

```
要便于披萨种类的扩展、要便于维护
1）披萨的种类很多（比如GreekPizza、CheesePizza等）
2）披萨的制作有prepare、bake、cut、box
3）完成披萨店的订购功能
```

初级版本UML

[实现代码](src/main/java/com/wzy/factory/simplefactory/pizzastore/ugly/order/PizzaStore.java)

![订购披萨类图](imgs/pizzastore01.png)

使用简单工厂UML

[实现代码](src/main/java/com/wzy/factory/simplefactory/pizzastore/advance/order/PizzaStore.java)

![订购披萨类图](imgs/pizzastore02.png)





