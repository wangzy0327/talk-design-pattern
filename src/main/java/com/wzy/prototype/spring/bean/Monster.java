package com.wzy.prototype.spring.bean;

public class Monster {
    private Integer id = 10;
    private String nickname = "牛魔王";
    private String skill = "芭蕉扇";
    public Monster(){}

    public Monster(Integer id, String nickname, String skill) {
        this.id = id;
        this.nickname = nickname;
        this.skill = skill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}
