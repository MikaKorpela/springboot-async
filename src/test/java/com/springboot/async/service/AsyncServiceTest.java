package com.springboot.async.service;

import com.pikecape.springboot.async.service.AsyncService;
import com.pikecape.springboot.async.service.SyncService;
import java.time.LocalTime;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Slf4j
@EnableAsync
public class AsyncServiceTest {
  @Autowired
  private SyncService syncService;
  @Autowired
  private AsyncService asyncService;

  @TestConfiguration
  static class ContextConfiguration {
    @Bean
    public SyncService syncService(AsyncService asyncService) {
      return new SyncService(asyncService);
    }

    @Bean
    public AsyncService asyncService() {
      return new AsyncService();
    }
  }

  @Test
  void testFoo() {
    log.info("Test started at {}", LocalTime.now());
    syncService.syncMethod();
    log.info("Test stopped at {}", LocalTime.now());
  }
}
