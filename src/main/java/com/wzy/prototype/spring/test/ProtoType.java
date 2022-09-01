package com.wzy.prototype.spring.test;

import com.wzy.prototype.spring.bean.Monster;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtoType {
    public static void main(String[] args) {
        //TODO
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //获取monster[通过id获取monster]
        Monster bean = (Monster)applicationContext.getBean("id01");
        System.out.println("bean "+bean);
        //bean Monster{id=10, nickname='牛魔王', skill='芭蕉扇'}
        Monster bean2 = (Monster)applicationContext.getBean("id01");
        System.out.println("bean2 "+bean2);
        //bean2 Monster{id=10, nickname='牛魔王', skill='芭蕉扇'}

        System.out.println(bean == bean2); //false 说明是原型创建

        bean.setNickname("铁扇公主");
        System.out.println("-----------修改bean的属性nickname---------------");
        System.out.println("bean "+bean);
        System.out.println("bean2 "+bean2);
        System.out.println("prototype是采用的深拷贝........");
    }
}
