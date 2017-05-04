/**
 * 2009-9-3
 */
package com.example.demo.md;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.MessageDigest;

/**
 * MD消息摘要
 *
 * @author gaozhuo
 * @date 2017/5/1
 */
public class MDCoder {

    /**
     * MD2
     *
     * @param data 输入数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeMD2(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("MD2");

        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * MD5
     *
     * @param data 输入数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeMD5(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("MD5");

        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * MD4
     *
     * @param data 输入数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeMD4(byte[] data) throws Exception {
        //Security.addProvider(new BouncyCastleProvider());

        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("MD4",new BouncyCastleProvider());

        // 执行消息摘要
        return md.digest(data);
    }

}
