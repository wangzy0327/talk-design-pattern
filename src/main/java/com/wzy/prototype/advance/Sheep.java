package com.wzy.prototype.advance;

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //克隆该实例，使用默认的clone方法来完成

    /**
     * A class implements the Cloneable interface to indicate to the Object.clone() method
     * that it is legal for that method to make a field-for-field copy of instances of that class.
     *
     * Invoking Object's clone method on an instance that does not implement the Cloneable interface
     * results in the exception CloneNotSupportedException being thrown. JDK1.8
     * 在不实现可克隆接口的实例上调用对象的克隆方法会导致引发异常CloneNotSupportedException。JDK1.8
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Sheep clone() {
        //这里默认采用了浅拷贝的方式，就是说基本数据类型拷贝，引用数据类型采用不同引用指向同一个对象
        //浅拷贝意味着原对象修改引用数据对象属性，拷贝对象的属性跟着改变
        //如果要采用深拷贝的方式，需要重写clone()方法，并且将其中引用数据类型通过new 对象的方式重新赋值
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return sheep;
    }
}
