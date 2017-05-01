/**
 * 2009-9-3
 */
package com.example.demo.md;

import org.bouncycastle.util.encoders.Hex;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * SHA消息摘要测试
 *
 * @author gaozhuo
 * @date 2017/5/1
 */
public class SHACoderTest {


    @Test
    public final void testEncodeSHA() throws Exception {
        String str = "SHA1消息摘要";

        // 获得摘要信息
        byte[] md = SHACoder.encodeSHA(str.getBytes());

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);
    }


    @Test
    public final void testEncodeSHA256() throws Exception {
        String str = "SHA256消息摘要";

        // 获得摘要信息
        byte[] md = SHACoder.encodeSHA256(str.getBytes());

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);
    }


    @Test
    public final void testEncodeSHA384() throws Exception {
        String str = "SHA384消息摘要";

        // 获得摘要信息
        byte[] md = SHACoder.encodeSHA384(str.getBytes());

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);
    }

    @Test
    public final void testEncodeSHA512() throws Exception {
        String str = "SHA512消息摘要";

       // 获得摘要信息
        byte[] md = SHACoder.encodeSHA512(str.getBytes());

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);
    }

    @Test
    public final void testEncodeSHA224() throws Exception {
        String str = "SHA224消息摘要";

        // 获得摘要信息
        byte[] md = SHACoder.encodeSHA224(str.getBytes());

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);
    }
}
