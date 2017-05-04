import org.junit.Test;

import java.security.Provider;
import java.security.Security;

/**
 * @author gaozhuo
 * @date
 */
public class MyTest {

    @Test
    public final void myTest() throws Exception {

        for (Provider provider : Security.getProviders()) {

            System.out.println("Provider: " + provider.getName());

            for (Provider.Service service : provider.getServices()) {
                System.out.println("Type: " + service.getType());
                System.out.println("Algorithm: " + service.getAlgorithm());
            }
            System.out.println("\n");
        }


    }

}
