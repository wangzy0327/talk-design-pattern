package com.wzy.composite;

public abstract class OrganizationComponent {
    private String name;  //名字
    private String des;   //说明

    //这里做成非抽象方法，避免叶子节点也必须实现，只需要非叶子节点实现
    protected void add(OrganizationComponent component){
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent component){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //方法print，做成抽象的，子类都需要实现
    protected abstract void print();

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


}
