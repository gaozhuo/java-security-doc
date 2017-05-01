/**
 * 2008-6-11
 */
package com.example.demo.encrypt;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * DES加密解密测试
 *
 * @author gaozhuo
 * @date 2017/4/30
 */
public class DESCoderTest {

    /**
     * 测试
     *
     * @throws Exception
     */
    @Test
    public final void test() throws Exception {
        String inputStr = "hello world";
        byte[] inputData = inputStr.getBytes();
        System.out.println("原文:\t" + inputStr);

        // 初始化密钥
        byte[] key = DESCoder.initKey();
        System.out.println("密钥:\t" + Base64.encodeBase64String(key));

        // 加密
        inputData = DESCoder.encrypt(inputData, key);
        System.out.println("加密后:\t" + Base64.encodeBase64String(inputData));

        // 解密
        byte[] outputData = DESCoder.decrypt(inputData, key);

        String outputStr = new String(outputData);
        System.out.println("解密后:\t" + outputStr);

        // 校验
        assertEquals(inputStr, outputStr);
    }
}
