package com.exampleboot.demo_restful.controller.impl;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exampleboot.demo_restful.model.Cat;
import com.exampleboot.demo_restful.model.CatDatabase;
import com.exampleboot.demo_restful.service.CatService;

import org.springframework.web.bind.annotation.RequestParam;

// ! restful api -> get / Post / delete / put / patch
// control single resource by get / Post / delete / put / patch
// Controller -> the ways to control cat resource
// insert, update, delete, select 
@RestController //  = @Controller +@ResponseBody
public class CatController {
  // controller -> service -> CatDatabase
  
  // dependency injection (Spring Core concept)
  // Autowired: Try to find an object which fits into catService. (before server start complete)
  // ! if fail, server start fail.
  @Autowired
  private CatService catService;

  // Constructor Injection
  @Autowired
  public CatController(CatService catService){
    this.catService = catService;
  }

    // insert 
    @PostMapping(value = "/cat")
    public Cat createCat(@RequestBody Cat cat){
        if (CatDatabase.put(cat))
            return cat;
        return null;
    }

    // Get All Cats
    @PostMapping(value = "/cats")
  public List<Cat> getCat() {
    return Arrays.asList (new Cat(1L, "tom", 1),
    new Cat(2L, "pom", 2),
    new Cat(3L, "john", 3),
    new Cat(4L, "sally", 4),
    new Cat(5L, "jimmy", 5));}

    @GetMapping(value = "/cats1")
    public List<Cat> getCats(){
      return List.of(CatDatabase.HOME);
    }

    // Get cat By id
    // http://localhost:8082/id=1
    // deserialization 
    @GetMapping(value = "/cat")
    public Cat geCat(@RequestParam Long id) {
      return CatDatabase.find(id).orElse(null);
    }
    

    // http://localhost:8082/id=1
    @DeleteMapping(value = "/cat")
    public Boolean deleteCat(@RequestParam Long id){
      return CatDatabase.delete(id);
    }

    // HashMap.put() -> if exists, override, otherwise, create new
    @PutMapping(value = "/cat")
    public Boolean updateCat(@RequestParam Long id, @RequestBody Cat cat){
      return CatDatabase.update(id, cat);
    }

    @PatchMapping(value = "/cat/name/{name}")
    public Boolean patchCatName(@RequestParam Long id,@PathVariable String name){
      return CatDatabase.patchName(id,name);
    }
    }
    
  
