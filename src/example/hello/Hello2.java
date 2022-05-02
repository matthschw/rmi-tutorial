package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello2 extends Remote {

  String getString() throws RemoteException;

  void setString(String value) throws RemoteException;

  /*
   * 
   * public BigDecimal getValue();
   * 
   * public void setValue(BigDecimal value);
   * 
   * 
   * public Set<String> getStrings();
   * 
   * public void setStrings(Set<String> strings);
   * 
   */
}
