/**
 * 2009-9-10
 */
package com.example.demo.md;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * MAC消息摘要
 *
 * @author gaozhuo
 * @date 2017/5/1
 */
public class MACCoder {

    /**
     * 初始化HmacMD5密钥
     *
     * @return
     * @throws Exception
     */
    public static byte[] initHmacMD5Key() throws Exception {

        // 初始化KeyGenerator
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacMD5");

        // 产生秘密密钥
        SecretKey secretKey = keyGenerator.generateKey();

        // 获得密钥
        return secretKey.getEncoded();
    }

    /**
     * HmacMD5
     *
     * @param data 输入数据
     * @param key  密钥
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeHmacMD5(byte[] data, byte[] key)
            throws Exception {

        // 还原密钥
        SecretKey secretKey = new SecretKeySpec(key, "HmacMD5");

        // 实例化Mac
        Mac mac = Mac.getInstance("HmacMD5");

        // 初始化Mac
        mac.init(secretKey);

        // 执行消息摘要
        return mac.doFinal(data);
    }

    /**
     * 初始化HmacSHA1密钥
     *
     * @return
     * @throws Exception
     */
    public static byte[] initHmacSHAKey() throws Exception {

        // 初始化KeyGenerator
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA1");

        // 产生秘密密钥
        SecretKey secretKey = keyGenerator.generateKey();

        // 获得密钥
        return secretKey.getEncoded();
    }

    /**
     * HmacSHA1加密
     *
     * @param data 输入数据
     * @param key  密钥
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeHmacSHA(byte[] data, byte[] key)
            throws Exception {

        // 还原密钥
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA1");

        // 实例化Mac
        Mac mac = Mac.getInstance("HmacSHA1");
        // 初始化Mac
        mac.init(secretKey);

        // 执行消息摘要
        return mac.doFinal(data);
    }


    /**
     * 初始化HmacSHA256密钥
     *
     * @return
     * @throws Exception
     */
    public static byte[] initHmacSHA256Key() throws Exception {

        // 初始化KeyGenerator
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");

        // 产生秘密密钥
        SecretKey secretKey = keyGenerator.generateKey();

        // 获得密钥
        return secretKey.getEncoded();
    }

    /**
     * HmacSHA256
     *
     * @param data 输入数据
     * @param key  密钥
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeHmacSHA256(byte[] data, byte[] key)
            throws Exception {

        // 还原密钥
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA256");

        // 实例化Mac
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());

        // 初始化Mac
        mac.init(secretKey);

        // 执行消息摘要
        return mac.doFinal(data);
    }

    /**
     * 初始化HmacSHA384密钥
     *
     * @return
     * @throws Exception
     */
    public static byte[] initHmacSHA384Key() throws Exception {

        // 初始化KeyGenerator
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA384");

        // 产生秘密密钥
        SecretKey secretKey = keyGenerator.generateKey();

        // 获得密钥
        return secretKey.getEncoded();
    }

    /**
     * HmacSHA384
     *
     * @param data 输入数据
     * @param key  密钥
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeHmacSHA384(byte[] data, byte[] key)
            throws Exception {

        // 还原密钥
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA384");

        // 实例化Mac
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());

        // 初始化Mac
        mac.init(secretKey);

        // 执行消息摘要
        return mac.doFinal(data);
    }

    /**
     * 初始化HmacSHA512密钥
     *
     * @return
     * @throws Exception
     */
    public static byte[] initHmacSHA512Key() throws Exception {

        // 初始化KeyGenerator
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA512");

        // 产生秘密密钥
        SecretKey secretKey = keyGenerator.generateKey();

        // 获得密钥
        return secretKey.getEncoded();
    }

    /**
     * HmacSHA512
     *
     * @param data 输入数据
     * @param key  密钥
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeHmacSHA512(byte[] data, byte[] key)
            throws Exception {

        // 还原密钥
        SecretKey secretKey = new SecretKeySpec(key, "HmacSHA512");

        // 实例化Mac
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());

        // 初始化Mac
        mac.init(secretKey);

        // 执行消息摘要
        return mac.doFinal(data);
    }
}
