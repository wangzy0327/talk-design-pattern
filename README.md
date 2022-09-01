# Java设计模式

按照大话设计模式来梳理设计模式。七大设计原则

- 单一职责（简单来说，每个类或函数负责的功能要相对独立，保持高内聚）
- 接口隔离（类不应该包含实现其不需要的接口方法，接口拆分）
- 依赖倒置（高层不应依赖底层，面向抽象编程）
- 里式替换（子类最好不要改变父类已实现的方法，保证子类调实现用父类的方法与父类调用保持一致）
- 开闭原则（最重要，代码设计应该对修改关闭，对扩展开放）
- 迪米特原则（最小知道，类的方法不应该包含与其无关的类，保持低耦合）
- 合成复用原则（多用组合，少用继承，降低耦合性，提高扩展）

UML类图中类的关系有：依赖（....>）、关联（---->）、泛化（<|-----）、实现（<|.....）、聚合（o----）、组合（*-----）

几种关系的理解：

- 依赖关系：简单理解为在某个方法里通过传参的方式用到了某个类或者返回了某个类（耦合度低）
- 关联关系：简单理解为类里面有属性引用了另一个类（耦合度中），关联关系的两种特例是聚合与组合
- 泛化关系：表示类之间的继承关系（关系紧密）
- 实现关系：表示接口与实现类之间的关系（关系紧密）
- 聚合关系：表示整体和部分，整体可以脱离部分存在。简单理解为整体类的有属性引用了部分类（set方法）（耦合度略高）
- 组合关系：表示整体和部分，相比组合关系更为紧密，不能单独存在。简单理解为整体类在构造的时候，必须将部分类的属性值设置进去否则不能创建整体类（构造时初始化必要的属性）（耦合度高）

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

JDK中java.lang.Runtime类使用了单例模式（饿汉式）

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

简单工厂模式介绍：

1. 简单工厂模式属于创建型模式，是工厂模式的一种。**简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例**。简单工厂模式时工厂家族中最简单实用的模式。
2. 简单工厂模式：定义了一个创建对象的类，由这个类来**封装实例化对象的行为**（代码）
3. 在软件开发过程中，当我们会用到大量的创建某种、某类或者某批对象时，就会用到工厂模式。

[实现代码](src/main/java/com/wzy/factory/simplefactory/pizzastore/ugly/order/PizzaStore.java)

![订购披萨类图](imgs/pizzastore01.png)

使用简单工厂UML

[实现代码](src/main/java/com/wzy/factory/simplefactory/pizzastore/advance/order/PizzaStore.java)

![订购披萨类图](imgs/pizzastore02.png)

JDK中的Calendar类中，就使用了简单工厂模式



### 工厂方法模式

示例：披萨

```
披萨项目新的需求：客户在点披萨时，可以点不同口味的披萨，比如北京的奶酪pizza、北京的胡椒pizza、伦敦的奶酪pizza、伦敦的胡椒pizza

思路1
使用简单工厂模式，创建不同的简单工厂类，比如BJPizzaSimpleFactory、LDPizzaSimpleFactory等等。从当前这个案例来说，也是可以的，但是考虑到项目的规模，以及软件的可维护性、可扩展性并不是特别好

思路2
使用工厂方法模式
```

工厂方法模式介绍

1. 工厂方法模式设计方案：将披萨项目的实例化功能抽象成抽象方法，在不同的口味点餐子类中具体实现。一定程度上通过加层给大工厂（OrderPizza）加上小工厂(BJOrderPizza)

2. 工厂方法模式：定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将**对象的实例化推迟到子类**。


使用工厂方法UML

[实现代码](src/main/java/com/wzy/factory/factorymethod/pizzastore/order/PizzaStore.java)

![工厂方法-披萨类图](imgs/pizzastore03.png)

### 抽象工厂模式

示例：披萨饼

抽象工厂模式介绍：

1. 抽象工厂模式：定义了一个**interface**用于创建相关或有依赖关系的对象簇，而无需指明具体的类
2. 抽象工厂模式可以将**简单工厂模式**和**工厂方法模式**进行整合。
3. 从设计层面看，抽象工厂模式就是对简单工厂模式的改进（或者称为进一步的抽象）。
4. 将工厂抽象成两层，AbsFactory(抽象工厂)和具体实现的工厂子类。程序员可以根据创建对象类型使用对应的工厂子类。这样将单个的简单工厂类变成了**工厂簇**，更利于代码的维护和扩展。

使用抽象工厂UML

[实现代码](src/main/java/com/wzy/factory/abstractfactory/pizzastore/order/PizzaStore.java)

![抽象工厂-披萨类图](imgs/pizzastore04.png)



##### 工厂模式小结

1. 工厂模式的意义:将实例化对象的代码提取出来，放到一个类中统一管理和维护，达到和主项目的依赖关系的解耦。从而提高项目的扩展和维护性
2. 三种工厂模式（简单工厂、工厂方法、抽象工厂）
3. 设计模式的**依赖抽象**原则

- 创建对象实例时，不要直接new类，而是把这个new类的动作放在一个工厂的方法中，并返回。有的书上说，变量不要直接持有具体类的引用
- 不要让类继承具体类，而是继承抽象类或者是实现interface（接口）
- 不要覆盖基类中已经实现的方法（里式替换）



### 原型模式

克隆羊问题

```
现在有一只羊tom，姓名为tom，年龄为1，颜色为白色，请编写程序创建和tom羊属性完全相同的10只羊
```

传统方式解决克隆羊问题

传统方式UML

![传统方式-克隆羊](imgs/prototype01.png)

[实现代码](src/main/java/com/wzy/prototype/Client.java)

传统方式优缺点：

1）优点是比较好理解，简单易操作

2）在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低

3）总是需要重新初始化对象，而不是动态地获得对象运行时的状态，不够灵活

4）改进的思路分析

思路：Java中的Object类是所有类的根类，Object类提供了一个clone()方法，该方法可以将一个Java对象复制一份，但是需要实现clone的java类必须要实现一个接口Cloneable，该接口表示该类能够复制且具有复制的能力=>原型模式

**原型模式介绍**

1）原型模式（Prototype模式）是指：用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象

2）原型模式时一种创建型设计模式，允许一个对象再创建另外一个可定制的对象，无需知道如何创建的细节

3）工作原理是：通过将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建，即 对象.clone()

4）形象的理解：孙大圣拔出猴毛，变出其它孙大圣

原型模式UML

[实现代码](src/main/java/com/wzy/prototype/advance/Client.java)

![传统方式-克隆羊](imgs/prototype02.png)

原理结构图说明：

1）Prototype：原型类，声明一个克隆自己的接口，可以理解为Object类

2）ConcretePrototype：具体的原型类，实现一个克隆自己的操作，可以理解为Sheep类，Cat类

3）Client：让一个原型对象克隆自己，从而创建一个新的对象（属性一样）

##### 原型模式在Spring框架中源码分析

1）Spring中原型bean的创建，就是原型模式的应用

2）代码分析  [实现代码](src/main/java/com/wzy/prototype/spring/test/ProtoType.java)

```xml
beans.xml
<bean id="id01" class = "com.atguigu.spring.bean.Monster" scope="prototype"/>
```

```java
Test.java
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//获取monster[通过id获取monster]
Object bean = applicationContext.getBean("id01");
System.out.println("bean"+bean);

@Override
public Object getBean(String name) throws BeansException{
	return doGetBean(name,null,null,false);
}
```

浅拷贝-深拷贝  [实现代码](src/main/java/com/wzy/prototype/deepclone/Client.java)

```
浅拷贝的方式，就是说基本数据类型采用值传递，引用数据类型采用不同引用指向同一个对象，即引用传递
浅拷贝意味着原对象修改引用数据对象属性，拷贝对象的属性跟着改变
浅拷贝是使用默认clone()方法来实现 super.clone()
如果要采用深拷贝的方式，需要为所有引用数据类型的成员变量申请空间，并复制每个引用数据类型成员变量所引用的对象。
深拷贝实现方式1：需要重写clone()方法来实现
深拷贝实现方式2：通过对象序列化实现深拷贝
```

1.[重写clone()完成深拷贝](src/main/java/com/wzy/prototype/deepclone/DeepProtoType.java)

2.[通过对象序列化完成深拷贝 - deepcopy](src/main/java/com/wzy/prototype/deepclone/DeepProtoType.java)

