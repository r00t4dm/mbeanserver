import javax.management.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;

public class MBeanExample {

    public static void main(String[] args) throws MalformedObjectNameException,
            NotCompliantMBeanException, InstanceAlreadyExistsException,
            MBeanRegistrationException, IOException {

        Hello mbean = new Hello();

        ObjectName objectName = new ObjectName("tesT:type=HelloMbean");
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        mBeanServer.registerMBean(mbean, objectName);

        System.out.println("adfasdfasdf");
        System.in.read();
    }
}
