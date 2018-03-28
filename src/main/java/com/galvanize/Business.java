package com.galvanize;

import java.util.ArrayList;
import java.util.List;

import com.galvanize.Address;

public class Business implements Addressable {

  private final String name;
  private final ArrayList<Address> addresses;

  public Business(String name) {
    this.name = name;
    this.addresses = new ArrayList<Address>();
  }

  public String getName() {
    return this.name;
  }

  public List<Address> getAddresses() {
    return this.addresses;
  }

  public void addAddress(Address address) {
    this.addresses.add(address);
  }

}
