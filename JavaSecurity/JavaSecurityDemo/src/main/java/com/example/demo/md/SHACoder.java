/**
 * 2009-9-3
 */
package com.example.demo.md;

import java.security.MessageDigest;


/**
 * SHA消息摘要
 *
 * @author gaozhuo
 * @date 2017/5/1
 */
public class SHACoder {

    /**
     * SHA-1
     *
     * @param data 输入数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA");

        // 执行消息摘要
        return md.digest(data);
    }


    /**
     * SHA-256
     *
     * @param data 输入数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA256(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * SHA-384
     *
     * @param data 输入数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA384(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-384");

        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * SHA-512
     *
     * @param data 输入数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA512(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-512");

        // 执行消息摘要
        return md.digest(data);
    }


    /**
     * SHA-224
     *
     * @param data 输入数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA224(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-224");

        // 执行消息摘要
        return md.digest(data);
    }
}
