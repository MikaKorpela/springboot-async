package com.pikecape.springboot.async.service;

import com.pikecape.springboot.async.model.Duck;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DuckService {

  public Duck getDuck(String uid) {
    return Duck.builder()
        .uid(uid)
        .name("Donald")
        .build();
  }

  @Async("taskExecutor")
  public void createDuck(Duck duck) {
    duck.toBuilder()
        .uid(UUID.randomUUID().toString())
        .build();
  }
}
