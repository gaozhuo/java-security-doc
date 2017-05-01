/**
 * 2008-6-11
 */
package com.example.demo.encrypt;

import org.apache.commons.codec.binary.Base64;
import org.junit.Before;
import org.junit.Test;

import java.security.Key;
import java.security.PublicKey;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * RAS加解密测试
 *
 * @author gaozhuo
 * @date 2017/5/1
 */
public class RSACoderTest {

    /**
     * 公钥
     */
    private byte[] publicKey;

    /**
     * 私钥
     */
    private byte[] privateKey;

    /**
     * 初始化密钥
     *
     * @throws Exception
     */
    @Before
    public void initKey() throws Exception {

        // 初始化密钥
        Key[] key = RSACoder.initKey();

        //获取公钥的二进制形式
        publicKey = key[0].getEncoded();

        //获取私钥的二进制形式
        privateKey = key[1].getEncoded();

        System.out.println("公钥: \n" + Base64.encodeBase64String(publicKey));
        System.out.println("私钥： \n" + Base64.encodeBase64String(privateKey));
    }

    /**
     * 校验
     *
     * @throws Exception
     */
    @Test
    public void test() throws Exception {

        System.out.println("\n---公钥加密——私钥解密---");
        String inputStr2 = "hello world";
        byte[] data2 = inputStr2.getBytes();
        System.out.println("原文:\n" + inputStr2);

        // 加密
        byte[] encodedData2 = RSACoder.encryptByPublicKey(data2, publicKey);
        System.out.println("加密后:\n" + Base64.encodeBase64String(encodedData2));

        // 解密
        byte[] decodedData2 = RSACoder.decryptByPrivateKey(encodedData2, privateKey);
        String outputStr2 = new String(decodedData2);
        System.out.println("解密后: " + outputStr2);

        // 校验
        assertEquals(inputStr2, outputStr2);
    }

}
