package example.hello;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.Set;

public class Dataobject extends UnicastRemoteObject implements Hello2 {

  /**
   * 
   */
  private static final long serialVersionUID = 4649740783426221184L;

  private BigDecimal value;

  private Set<String> strings;

  private String string = "sdsd";

  public Dataobject() throws RemoteException {
    this.value = new BigDecimal("1.5");
    this.strings = new HashSet<String>();
    this.strings.add("a");
    this.strings.add("b");
  }

  /**
   * @return the value
   */
  public BigDecimal getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * @return the strings
   */
  public Set<String> getStrings() {
    return strings;
  }

  /**
   * @param strings the strings to set
   */
  public void setStrings(Set<String> strings) {
    this.strings = strings;
  }

  @Override
  public String getString() {

    return this.string;
  }

  @Override
  public void setString(String value) {
    this.string = value;
  }
}