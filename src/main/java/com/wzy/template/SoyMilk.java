package com.wzy.template;

//抽象类，表示豆浆
public abstract class SoyMilk {

    //模板方法，make,模板方法可以做成final，不让子类去覆盖
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    //选材料
    private void select(){
        System.out.println("第一步：选择好的新鲜豆子 ");
    }

    //添加不同的配料，抽象方法，子类具体实现
    abstract void addCondiments();

    //void 浸泡
    private void soak(){
        System.out.println("第三步：豆子和配料开始浸泡，需要3小时 ");
    }

    private void beat(){
        System.out.println("第四步：打豆子");
    }
}
