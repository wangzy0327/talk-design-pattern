package com.wzy.flyweight;

//具体网站
public class ConcreateWebSite extends Website{

    //类型是共享的部分
    private String type = "";  //网站发布的形式（类型）

    public ConcreateWebSite(String type) {
        this.type = type;
    }

    @Override
    void use(User user) {
        System.out.println("网站的发布形式为："+type+" 在使用中 ... 使用者是 ： "+user.getName());
    }
}
