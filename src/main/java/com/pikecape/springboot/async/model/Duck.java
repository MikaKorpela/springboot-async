package com.pikecape.springboot.async.model;

import lombok.Builder;
import lombok.Value;

@Builder(toBuilder = true)
@Value
public class Duck {
  String uid;
  String name;
}
