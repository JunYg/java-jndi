package club.junefory.jndi.rmi.server;

import club.junefory.jndi.rmi.server.remote.RmiServiceImpl;

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
public class RmiServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("rmiMethod", new RmiServiceImpl());
            Thread.currentThread().join();
        } catch (RemoteException | AlreadyBoundException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
