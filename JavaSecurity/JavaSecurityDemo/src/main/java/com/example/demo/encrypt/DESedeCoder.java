/**
 * 2009-10-5
 */
package com.example.demo.encrypt;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.Security;

/**
 * DESede加解密
 *
 * @author gaozhuo
 * @date 2017/4/30
 */
public class DESedeCoder {

    /**
     * 密钥算法
     */
    public static final String KEY_ALGORITHM = "DESede";

    /**
     * 加密、解密算法 / 工作模式 / 填充方式
     * Java 6支持PKCS5PADDING填充方式
     * Bouncy Castle支持PKCS7Padding填充方式
     */
    public static final String CIPHER_ALGORITHM = "DESede/ECB/PKCS5Padding";

    /**
     * 转换密钥
     *
     * @param key 二进制密钥
     * @return Key 密钥
     * @throws Exception
     */
    private static Key toKey(byte[] key) throws Exception {

        // 实例化DES密钥材料
        DESedeKeySpec dks = new DESedeKeySpec(key);

        // 实例化秘密密钥工厂
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(KEY_ALGORITHM);

        // 生成秘密密钥
        SecretKey secretKey = keyFactory.generateSecret(dks);

        return secretKey;

        /**
         * Bouncy Castle 的112、128位秘钥需要使用下面代码
         */
        //return new SecretKeySpec(key,"DESede");
    }

    /**
     * 解密
     *
     * @param data 待解密数据
     * @param key  密钥
     * @return byte[] 解密数据
     * @throws Exception
     */
    public static byte[] decrypt(byte[] data, byte[] key) throws Exception {

        // 还原密钥
        Key k = toKey(key);

		/* 
         * 实例化
		 * 使用PKCS7Padding填充方式
		 * Cipher.getInstance(CIPHER_ALGORITHM, new BouncyCastleProvider());
		 */
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);

        // 初始化，设置为解密模式
        cipher.init(Cipher.DECRYPT_MODE, k);

        // 执行操作
        return cipher.doFinal(data);
    }

    /**
     * 加密
     *
     * @param data 待加密数据
     * @param key  密钥
     * @return byte[] 加密数据
     * @throws Exception
     */
    public static byte[] encrypt(byte[] data, byte[] key) throws Exception {

        // 还原密钥
        Key k = toKey(key);

		/* 
         * 实例化
		 * 使用PKCS7Padding填充方式
		 * Cipher.getInstance(CIPHER_ALGORITHM, new BouncyCastleProvider());
		 */
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);

        // 初始化，设置为加密模式
        cipher.init(Cipher.ENCRYPT_MODE, k);

        // 执行操作
        return cipher.doFinal(data);
    }

    /**
     * 生成密钥 <br>
     *
     * @return byte[] 二进制密钥
     * @throws Exception
     */
    public static byte[] initKey() throws Exception {

        // 实例化
        KeyGenerator kg = KeyGenerator.getInstance(KEY_ALGORITHM);

        /**
         * 要使用128位或192位秘钥使用下面代码
         */
        //KeyGenerator kg = KeyGenerator.getInstance(KEY_ALGORITHM,new BouncyCastleProvider());

		/*
         * DESede 要求密钥长度为 112位或168位
		 */
        kg.init(168);

        // 生成秘密密钥
        SecretKey secretKey = kg.generateKey();

        // 获得密钥的二进制编码形式
        return secretKey.getEncoded();
    }
}