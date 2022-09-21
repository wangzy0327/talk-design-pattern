package com.wzy.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        Singer man = new Man();
        Singer woman = new Woman();

        objectStructure.add(man);
        objectStructure.add(woman);

        Action action = new Success();
        System.out.println("=======好评=========");
        objectStructure.evaluate(action);

        action = new Fail();
        System.out.println("=======差评=========");
        objectStructure.evaluate(action);



    }
}
