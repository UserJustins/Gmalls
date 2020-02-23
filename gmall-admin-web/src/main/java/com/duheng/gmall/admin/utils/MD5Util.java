package com.duheng.gmall.admin.utils;

import java.security.MessageDigest;

/*************************
 Author: 杜衡
 Date: 2020/2/7
 Describe:
 *************************/
public class MD5Util {
    public static String encryption(String source) {
        StringBuilder builder = new StringBuilder();
        // 定义一个字符数组
        char[] character = { '0', '1', '2', '3', '4', '5',  '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        try {
            // 指定加密的方式获取执行加密的核心对象
            MessageDigest digest =  MessageDigest.getInstance("MD5");
            // 将明文转换为字节数组
            byte[] inputBytes = source.getBytes();
            // 执行加密
            byte[] outputBytes =  digest.digest(inputBytes);
            // 遍历字节数组
            for (int i = 0; i < outputBytes.length; i++) {
                // 单个字节就是8位，将它拆分成低四位和高四位
                byte b = outputBytes[i];
                // 获取 低四位
                int lowValue = b & 15;
                // 获取高四位
                int highValue = (b >> 4) & 15;
                // 以高四位和低四位的值位下标获取字符数组中的字符
                char highCharacter =  character[highValue];
                char lowCharacter = character[lowValue];
                // 进行拼接
                builder.append(highCharacter).append(lowCharacter);
            }
        } catch (Exception e) {
            throw new RuntimeException("MD5加密有误");
        }
        return builder.toString();
    }
}
