/**
 * 2008-6-13
 */
package com.example.demo.signature;

import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * DSA数字签名
 *
 * @author gaozhuo
 * @date 2017/5/4
 */
public class DSASignatureCoder {

    /**
     * 数字签名密钥算法
     */
    public static final String KEY_ALGORITHM = "DSA";

    /**
     * 数字签名
     * 签名/验证算法
     */
    public static final String SIGNATURE_ALGORITHM = "SHA1withDSA";


    /**
     * DSA密钥长度
     * 默认1024位，
     * 密钥长度必须是64的倍数，
     * 范围在512至1024位之间（含）
     */
    private static final int KEY_SIZE = 1024;

    /**
     * 签名
     *
     * @param data       待签名数据
     * @param privateKey 私钥
     * @return byte[] 数字签名
     * @throws Exception
     */
    public static byte[] sign(byte[] data, byte[] privateKey) throws Exception {

        // 还原私钥
        // 转换私钥材料
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(privateKey);

        // 实例化密钥工厂
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);

        // 生成私钥对象
        PrivateKey priKey = keyFactory.generatePrivate(pkcs8KeySpec);



        // 实例化Signature
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);

        // 初始化Signature
        signature.initSign(priKey);

        // 更新
        signature.update(data);

        // 签名
        return signature.sign();
    }

    /**
     * 校验
     *
     * @param data      待校验数据
     * @param publicKey 公钥
     * @param sign      数字签名
     * @return boolean 校验成功返回true 失败返回false
     * @throws Exception
     */
    public static boolean verify(byte[] data, byte[] publicKey, byte[] sign)
            throws Exception {

        // 还原公钥
        // 转换公钥材料
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKey);

        // 实例化密钥工厂
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);

        // 取公钥匙对象
        PublicKey pubKey = keyFactory.generatePublic(keySpec);



        // 实例话Signature
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);

        // 初始化Signature
        signature.initVerify(pubKey);

        // 更新
        signature.update(data);

        // 验证
        return signature.verify(sign);
    }

    /**
     * 初始化秘钥对
     *
     * @return
     * @throws Exception
     */
    public static Key[] initKey() throws Exception {

        // 实例化密钥对生成器
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);

        // 初始化密钥对生成器
        keyPairGen.initialize(KEY_SIZE);

        // 生成密钥对
        KeyPair keyPair = keyPairGen.generateKeyPair();

        // 公钥
        PublicKey publicKey = keyPair.getPublic();

        // 私钥
        PrivateKey privateKey = keyPair.getPrivate();

        return new Key[]{publicKey, privateKey};
    }
}
