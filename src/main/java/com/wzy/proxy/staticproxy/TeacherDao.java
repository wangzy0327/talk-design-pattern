package com.wzy.proxy.staticproxy;

//主体对象
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
