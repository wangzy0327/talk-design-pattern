package com.wzy.decorator.inputstream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Decorator {
    public static void main(String[] args) {

        /**
         * 说明
         *
         * 1.InputStream 是抽象类，类似我们前面讲的Drink
         * 2.FileInputStream 是InputStream子类，类似我们前面的DeCaf，LongBlack
         * 3.FilterInputStream 是InputStream子类：类似我们前面的Decorator修饰者
         * 4.DataInputStream 是 FilterInputStream子类，具体的修饰者，类似前面的Milk，Soy等
         */

        DataInputStream dis;
        try {
            dis = new DataInputStream(new FileInputStream("src/a.txt"));
            System.out.println(dis.read());
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
