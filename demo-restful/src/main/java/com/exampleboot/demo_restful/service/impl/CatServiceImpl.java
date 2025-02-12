package com.exampleboot.demo_restful.service.impl;

import org.springframework.stereotype.Service;

import com.exampleboot.demo_restful.model.Cat;
import com.exampleboot.demo_restful.model.CatDatabase;
import com.exampleboot.demo_restful.service.CatService;

// Person.class -> weight/height -> bmi()

@Service
public class CatServiceImpl implements CatService {
  // stateless object, can be a bean
  @Override
  public boolean put(Cat cat) {
    for (int i = 0; i < CatDatabase.HOME.length; i++) {
      if (CatDatabase.HOME[i] == null) {
        CatDatabase.HOME[i] = cat;
        return true;
      }
    }
    return false;
  }
}