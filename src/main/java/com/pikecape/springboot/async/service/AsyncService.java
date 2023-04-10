package com.pikecape.springboot.async.service;

import com.pikecape.springboot.async.util.AsyncUtil;
import java.time.LocalTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncService {
  @Async("taskExecutor")
  public void asyncMethod() {
    log.info("Async started at {}", LocalTime.now());
    AsyncUtil.sleep(2);
    log.info("Async stopped at {}", LocalTime.now());
  }
}
