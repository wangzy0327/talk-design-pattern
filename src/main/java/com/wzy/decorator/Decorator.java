package com.wzy.decorator;

//包装抽象类，具体包什么不知道，可能是牛奶，可能是巧克力，价格就不确定
public abstract class Decorator extends Drink{
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice()是自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes(){
        //obj.getDes() 输出被装饰者的信息
        return super.des + " "+super.getPrice()+" && "+obj.getDes();
    }
}
