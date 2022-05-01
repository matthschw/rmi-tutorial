package example.hello;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

  public static void main(String[] args) throws RemoteException, AlreadyBoundException {

    Server obj = new Server();
    Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
    
    Registry registry = LocateRegistry.getRegistry();
    registry.bind("Hello", stub);
  }

}
