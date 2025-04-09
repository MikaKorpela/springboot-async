package com.pikecape.springboot.async.controller;

import com.pikecape.springboot.async.model.Duck;
import com.pikecape.springboot.async.service.DuckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ducks")
@RequiredArgsConstructor
public class DuckController {
  private final DuckService duckService;

  @GetMapping("/{uid}")
  @ResponseStatus(HttpStatus.OK)
  public Duck getDuck(@PathVariable String uid) {
    return duckService.getDuck(uid);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.ACCEPTED)
  public void createDuck(Duck duck) {
    duckService.createDuck(duck);
  }
}
