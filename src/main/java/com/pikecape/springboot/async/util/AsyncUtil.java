package com.pikecape.springboot.async.util;

import java.util.concurrent.TimeUnit;

public class AsyncUtil {
  private AsyncUtil() {}

  public static void sleep(int seconds) {
    try {
      TimeUnit.SECONDS.sleep(seconds);
    } catch (Exception exception) {
      throw new RuntimeException(exception.getMessage());
    }
  }
}
