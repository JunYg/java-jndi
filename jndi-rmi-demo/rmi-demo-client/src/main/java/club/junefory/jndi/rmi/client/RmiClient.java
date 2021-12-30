package club.junefory.jndi.rmi.client;

import club.junefory.jndi.rmi.server.remote.RmiService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Hashtable;

/**
 * @author Jarvis
 * @version 1.0
 * @description: TODO
 * @date 2021/12/30 9:18
 */
public class RmiClient {
    public static void main(String[] args) {
        try {
            Hashtable objectObjectHashtable = new Hashtable();
            objectObjectHashtable.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");
            objectObjectHashtable.put(Context.PROVIDER_URL, "rmi://localhost:1099");
            Context initialContext = new InitialContext(objectObjectHashtable);

            RmiService rmiMethod = (RmiService)initialContext.lookup("rmiMethod");
            String call_rmi = rmiMethod.rmiMethod("call rmi");
            System.out.println(call_rmi);
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
