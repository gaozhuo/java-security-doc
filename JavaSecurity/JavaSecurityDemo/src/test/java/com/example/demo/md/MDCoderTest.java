/**
 * 2009-9-3
 */
package com.example.demo.md;

import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.encoders.HexEncoder;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * MD消息摘要测试
 *
 * @author gaozhuo
 * @date 2017/5/1
 */
public class MDCoderTest {


    @Test
    public final void testEncodeMD2() throws Exception {
        String str = "MD2消息摘要";

        // 获得摘要信息
        byte[] md = MDCoder.encodeMD2(str.getBytes());

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);

    }


    @Test
    public final void testEncodeMD5() throws Exception {
        String str = "MD5消息摘要";

        // 获得摘要信息
        byte[] md = MDCoder.encodeMD5(str.getBytes());

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);
    }

    @Test
    public void encodeMD4() throws Exception {
        String str = "MD4消息摘要";

        // 获得摘要信息
        byte[] md = MDCoder.encodeMD4(str.getBytes());

        //转化为十六进制字符输出
        System.out.println(Hex.toHexString(md));

        System.out.println("length=" + md.length * 8);
    }

}
