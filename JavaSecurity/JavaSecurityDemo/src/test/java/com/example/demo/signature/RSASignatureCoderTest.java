/**
 * 2008-6-11
 */
package com.example.demo.signature;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.junit.Before;
import org.junit.Test;

import java.security.Key;

import static org.junit.Assert.assertTrue;

/**
 * RSA数字签名测试
 *
 * @author gaozhuo
 * @date 2017/5/4
 */
public class RSASignatureCoderTest {

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
        Key[] key = RSASignatureCoder.initKey();

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
    public void testSign() throws Exception {

        String inputStr = "RSA数字签名";
        byte[] data = inputStr.getBytes();

        // 产生签名
        byte[] sign = RSASignatureCoder.sign(data, privateKey);
        System.out.println("签名:\n" + Hex.encodeHexString(sign));

        // 验证签名
        boolean status = RSASignatureCoder.verify(data, publicKey, sign);
        System.out.println("状态:\n" + status);
        assertTrue(status);

    }

}
