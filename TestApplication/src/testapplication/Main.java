package testapplication;

import com.jogamp.common.deployment.NativeBundle;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 *
 * @author mbien
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServiceLoader<NativeBundle> loader = ServiceLoader.load(NativeBundle.class);

        for (Iterator<NativeBundle> it = loader.iterator(); it.hasNext();) {
            NativeBundle nativeBundle = it.next();
            System.out.println("found a bundle: "+nativeBundle);
            System.out.println(nativeBundle.getArch());
            System.out.println(nativeBundle.getOs());
            System.out.println(nativeBundle.getLocation());
            System.out.println(nativeBundle.getPath());
        }

    }

}
