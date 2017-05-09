import org.junit.Test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;

/**
 * @author gaozhuo
 * @date
 */
public class MyTest {

    @Test
    public final void testProvider() throws Exception {

        for (Provider provider : Security.getProviders()) {

            System.out.println("Provider: " + provider.getName());

            for (Provider.Service service : provider.getServices()) {
                System.out.println("Type: " + service.getType() + " Algorithm: " + service.getAlgorithm());
            }
            System.out.println("\n");
        }


    }

    @Test
    public final void testKey() throws Exception {

        //生成秘钥
        String password = "testkey";

        KeyGenerator kg = KeyGenerator.getInstance("AES");

        //SecureRandom用来生成安全随机数序列，password.getBytes()是种子，只要种子相同，序列就一样，所以生成的秘钥就一样。
        kg.init(128, new SecureRandom(password.getBytes()));

        SecretKey key = kg.generateKey();

        System.out.println(key.getEncoded());

    }

}
