package com.wzy.flyweight.jdkinteger;


public class FlyWeight {
    public static void main(String[] args) {

        //如果Integer.valueOf(x) x在 -128 --- 127 直接就是使用享元模式返回，如果不在范围内，则仍然new Integer

        //小结
        //1. 在valueOf方法中，先判断值是否在IntegerCache中，如果不在，就创建新的Integer，否则，就直接从缓存池中取
        //2.valueOf方法就使用到了享元模式
        //3.如果使用valueOf方法得到一个Integer实例，范围在-128 - 127，执行速度比new要快


        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);// Integer.parseInt("127");
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);//Integer.parseInt("127");


//        @Deprecated(since="9")
//        public Integer(int value) {
//            this.value = value;
//        }


        /**
         * Integer 缓冲层
         *
         *
         /**
         * Returns an {@code Integer} instance representing the specified
         * {@code int} value.  If a new {@code Integer} instance is not
         * required, this method should generally be used in preference to
         * the constructor {@link #Integer(int)}, as this method is likely
         * to yield significantly better space and time performance by
         * caching frequently requested values.
         *
         * This method will always cache values in the range -128 to 127,
         * inclusive, and may cache other values outside of this range.
         *
         * @param  i an {@code int} value.
         * @return an {@code Integer} instance representing {@code i}.
         * @since  1.5
         *
        @HotSpotIntrinsicCandidate
        public static Integer valueOf(int i) {
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }
         *
         *
         *
         */

        System.out.println(x.equals(y)); // true
        System.out.println(x == y);  // false
        System.out.println(x == z);  //true
        System.out.println(w == x);  // false
        System.out.println(w == y); // false

        Integer x1 = Integer.valueOf(200);
        Integer x2 = Integer.valueOf(200);
        System.out.println("x1 == x2 : "+(x1 == x2)); //x1 == x2 : false
    }
}
