package com.wzy.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛的类");
        
        //方式1 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();
        System.out.println("p.name = "+p.name+ " p.deepCloneableTarget = "+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name = "+p2.name+ " p2.deepCloneableTarget = "+p2.deepCloneableTarget.hashCode());

//        p.name = 宋江 p.deepCloneableTarget = 2047526627
//        p2.name = 宋江 p2.deepCloneableTarget = 760563749

        //方式2 序列化完成深拷贝(推荐)
        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        System.out.println("p3.name = "+p3.name+ " p3.deepCloneableTarget = "+p3.deepCloneableTarget.hashCode());

//        p3.name = 宋江 p3.deepCloneableTarget = 832947102

    }
}
