/**
 * 2009-5-7
 */
package com.example.demo.signature;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.junit.Before;
import org.junit.Test;

import java.security.Key;

import static org.junit.Assert.assertTrue;

/**
 * DSA数字签名测试
 *
 * @author gaozhuo
 * @date 2017/5/4
 */
public class DSASignatureCoderTest {

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
        Key[] key = DSASignatureCoder.initKey();

        //获取公钥的二进制形式
        publicKey = key[0].getEncoded();

        //获取私钥的二进制形式
        privateKey = key[1].getEncoded();

        System.err.println("公钥: \n" + Base64.encodeBase64String(publicKey));
        System.err.println("私钥： \n" + Base64.encodeBase64String(privateKey));
    }

    /**
     * 校验签名
     *
     * @throws Exception
     */
    @Test
    public void test() throws Exception {

        String inputStr = "DSA数字签名";
        byte[] data = inputStr.getBytes();

        // 产生签名
        byte[] sign = DSASignatureCoder.sign(data, privateKey);
        System.err.println("签名:\r" + Hex.encodeHexString(sign));

        // 验证签名
        boolean status = DSASignatureCoder.verify(data, publicKey, sign);
        System.err.println("状态:\r" + status);
        assertTrue(status);

    }

}
