import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException {

        try (URLClassLoader classLoader1 = new URLClassLoader(new URL[]{new URL("file:C:/Users/Admin/Desktop/asos/")})) {
            Class<?> class1 = classLoader1.loadClass("Super");
            Method m1 = class1.getDeclaredMethod("runSomething" );
            m1.setAccessible(true);
            System.out.println(m1.invoke(null));
        } catch (IOException | NoSuchMethodException e) {
            System.out.println(e.getMessage());
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        
        try (URLClassLoader classLoader1 = new URLClassLoader(new URL[]{new URL("file:C:/Users/Admin/Desktop/unix/")})) {
            Class<?> class2 = classLoader1.loadClass("Super");
            Method m1 = class2.getDeclaredMethod("runSomething" );
            m1.setAccessible(true);
            System.out.println(m1.invoke(null));
        } catch (IOException | NoSuchMethodException e) {
            System.out.println(e.getMessage());
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}