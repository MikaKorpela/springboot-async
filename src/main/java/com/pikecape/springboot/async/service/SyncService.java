package com.pikecape.springboot.async.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SyncService {
  private final AsyncService asyncService;

  public void syncMethod() {
    asyncService.asyncMethod();
  }
}
