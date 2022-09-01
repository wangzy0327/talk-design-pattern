package com.wzy.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name; //String 属性
    public DeepCloneableTarget deepCloneableTarget; //引用类型

    public DeepProtoType() {
        super();
    }

    @Override
    protected DeepProtoType clone() throws CloneNotSupportedException{
        Object deep = null;
        //这里完成对基本数据类型（属性）和String的克隆
        deep =  super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }

    //深拷贝 - 方式2 通过对象的序列化实现（推荐）
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        DeepProtoType deepCopy = null;
        try {
            //注意这个类跟其他引用类都要实现Serializable接口
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);  //当前对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            deepCopy = (DeepProtoType) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return deepCopy;

    }
}
