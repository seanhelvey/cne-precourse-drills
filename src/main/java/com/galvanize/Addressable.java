package com.galvanize;

import java.util.List;

import com.galvanize.Address;

public interface Addressable {

  public List<Address> getAddresses();
  public void addAddress(Address address);

}
