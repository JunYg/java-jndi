package club.junefory.jndi.rmi.server.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Jarvis
 * @version 1.0
 * @description: TODO
 * @date 2021/12/30 9:26
 */
public class RmiServiceImpl extends UnicastRemoteObject implements RmiService {

    public RmiServiceImpl() throws RemoteException {
    }

    @Override
    public String rmiMethod(String rmiParam) throws RemoteException {
        return "rmiMethod: " + rmiParam;
    }
}
