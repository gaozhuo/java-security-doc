import org.junit.Test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * @author gaozhuo
 * @date
 */
public class MyTest {

    @Test
    public final void myTest() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        SecretKey secretKey = keyGenerator.generateKey();
        System.out.println(secretKey.toString());

    }

}
