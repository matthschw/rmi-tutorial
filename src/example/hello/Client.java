package example.hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Set;

public class Client {

  private Client() {
  }

  public static void main(String[] args) {

    String host = (args.length < 1) ? null : args[0];

    try {

      Registry registry = LocateRegistry.getRegistry(5099);

      Hello stub = (Hello) registry.lookup("Hello");

      String response = stub.sayHello();

      System.out.println("response: " + response);

      Hello2 obj = stub.get();
      
      obj.setString("xyz");
      
      System.out.println(obj.getString());
      

      /*
      Set<String> strings = obj.getStrings();
      
      System.out.println("len: " + strings.size());
      */

    } catch (Exception e) {
      System.err.println("Client exception: " + e.toString());
      e.printStackTrace();
    }
  }
}