package com.wzy.template.advance;

public class Client {
    public static void main(String[] args) {
        System.out.println("----------制作黑豆豆浆----------");
        SoyMilk blackSoyMilk = new BlackSoyMilk();
        blackSoyMilk.make();
        System.out.println("----------制作花生豆浆----------");
        SoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
        System.out.println("----------制作纯豆浆----------");
        SoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();

        /**
         *
         * ----------制作黑豆豆浆----------
         * 第一步：选择好的新鲜豆子
         * 第二步：加入黑豆
         * 第三步：豆子和配料开始浸泡，需要3小时
         * 第四步：打豆子
         * ----------制作花生豆浆----------
         * 第一步：选择好的新鲜豆子
         * 第二步：加入花生
         * 第三步：豆子和配料开始浸泡，需要3小时
         * 第四步：打豆子
         * ----------制作纯豆浆----------
         * 第一步：选择好的新鲜豆子
         * 第三步：豆子和配料开始浸泡，需要3小时
         * 第四步：打豆子
         *
         */
    }
}
