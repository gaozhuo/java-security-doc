/**
 * 2009-9-11
 */
package com.example.demo.md;

import org.bouncycastle.util.encoders.Hex;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * MAC消息摘要测试
 *
 * @author gaozhuo
 * @date 2017/5/1
 */
public class MACCoderTest {

    /**
     * 测试HmacMD5
     *
     * @throws Exception
     */
    @Test
    public final void testEncodeHmacMD5() throws Exception {
        String str = "HmacMD5消息摘要";

        // 初始化密钥
        byte[] key = MACCoder.initHmacMD5Key();

        // 获得摘要信息
        byte[] md = MACCoder.encodeHmacMD5(str.getBytes(), key);

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);

    }

    /**
     * 测试HmacSHA1
     *
     * @throws Exception
     */
    @Test
    public final void testEncodeHmacSHA() throws Exception {
        String str = "HmacSHA1消息摘要";

        // 初始化密钥
        byte[] key = MACCoder.initHmacSHAKey();

        // 获得摘要信息
        byte[] md = MACCoder.encodeHmacSHA(str.getBytes(), key);

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);


    }

    /**
     * 测试HmacSHA256
     *
     * @throws Exception
     */
    @Test
    public final void testEncodeHmacSHA256() throws Exception {
        String str = "HmacSHA256消息摘要";

        // 初始化密钥
        byte[] key = MACCoder.initHmacSHA256Key();

        // 获得摘要信息
        byte[] md = MACCoder.encodeHmacSHA256(str.getBytes(), key);

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);

    }

    /**
     * 测试HmacSHA384
     *
     * @throws Exception
     */
    @Test
    public final void testEncodeHmacSHA384() throws Exception {
        String str = "HmacSHA384消息摘要";

        // 初始化密钥
        byte[] key = MACCoder.initHmacSHA384Key();

        // 获得摘要信息
        byte[] md = MACCoder.encodeHmacSHA384(str.getBytes(), key);

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);

    }

    /**
     * 测试HmacSHA512
     *
     * @throws Exception
     */
    @Test
    public final void testEncodeHmacSHA512() throws Exception {
        String str = "HmacSHA512消息摘要";

        // 初始化密钥
        byte[] key = MACCoder.initHmacSHA512Key();

        // 获得摘要信息
        byte[] md = MACCoder.encodeHmacSHA512(str.getBytes(), key);

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);

    }

}
