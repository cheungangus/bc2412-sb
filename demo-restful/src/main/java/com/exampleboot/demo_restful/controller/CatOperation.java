package com.exampleboot.demo_restful.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.exampleboot.demo_restful.model.Cat;

public class CatOperation {
  private List<Cat> catList  = new ArrayList<>();

    @PostMapping(value = "/cat")
  public Cat createCat(@RequestBody Cat cat){
    catList.add(cat);
    return cat;
  }

  @GetMapping(value = "/cats")
  public List<Cat> getCats(){
    return catList;
  }

  @GetMapping(value = "/cat")
  public Cat getCat(@RequestParam Long id){
    return catList.stream().filter(cat -> cat.getId().equals(id)).findFirst().orElse(null);
  }

  @DeleteMapping(value = "/cat")
  public Boolean deleteCat(@RequestParam Long id){
    return catList.removeIf(cat -> cat.getId().equals(id));
  }

  @PutMapping(value = "/cat")
  public Boolean updateCat(@RequestParam Long id, @RequestBody Cat cat){
    for(int i = 0; i< catList.size(); i++){
      if(catList.get(i).getId().equals(id)){
        catList.set(i, cat);
        return true;
      }
    }
    return false;
  }


  @PatchMapping(value = "/cat/name/{name}")
  public Boolean patchCatName(@RequestParam Long id, @PathVariable String name){
    for( Cat cat : catList){
      if ( cat.getId().equals(id)){
        cat.setName(name);
        return true;
      }
    }
    return false;
  }
}
