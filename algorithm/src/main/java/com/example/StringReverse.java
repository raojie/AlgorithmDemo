package com.example;

/**
 * Created by raoj on 2017/7/7.
 */

public class StringReverse {

    public static void main(String[] args) {
        String str = strReverse("abcde");
        System.out.println(str);
    }

    /**
     * 字符串翻反转
     *
     * @param string
     */
    public static String strReverse(String string) {
        String str = null;
        if (string != null) {
            str = new StringBuffer(string).reverse().toString();
        }
        return str;
    }
}
