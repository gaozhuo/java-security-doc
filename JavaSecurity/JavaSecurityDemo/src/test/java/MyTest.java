import org.junit.Test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * Created by gaozhuo on 2017/4/23.
 */
public class MyTest {

    @Test
    public final void myTest() throws Exception{
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        SecretKey secretKey = keyGenerator.generateKey();
        System.out.println(secretKey.toString());

    }

}
