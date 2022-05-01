package example.hello;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Hello {

  private static final long serialVersionUID = 8060568012165640714L;

  protected Server() throws RemoteException {
    super();
  }

  public String sayHello() {
    return "Hello, world!";
  }

  public static void main(String args[]) {

    System.setProperty("java.rmi.server.hostname", "127.0.0.1");
    System.out.println(System.getProperty("java.rmi.server.hostname"));

    try {
      Server obj = new Server();

      // Bind the remote object's stub in the registry
      // Registry registry = LocateRegistry.getRegistry(5099);
      // registry.bind("Hello", obj);

      Naming.rebind("rmi://127.0.0.1:5099/Hello", new Server());

      System.err.println("Server ready");
    } catch (Exception e) {
      System.err.println("Server exception: " + e.toString());
      e.printStackTrace();
    }
  }
}