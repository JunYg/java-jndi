package club.junefory.jndi.rmi.server.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Jarvis
 * @version 1.0
 * @description: TODO
 * @date 2021/12/30 9:25
 */
public interface RmiService extends Remote {

    String rmiMethod(String rmiParam) throws RemoteException;

}
