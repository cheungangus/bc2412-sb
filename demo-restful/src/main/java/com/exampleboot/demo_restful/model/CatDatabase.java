package com.exampleboot.demo_restful.model;

import java.util.Optional;

public class CatDatabase {
    public static final Cat[] HOME = new Cat[5];

    public static boolean put(Cat cat){
        for( int i = 0 ; i < HOME.length; i++){
            if(HOME[i] == null ){
                HOME[i] = cat;
                return true;
            }
        }
        return false;
    }

    //find
    public static Optional<Cat> find(Long catId){
        for(Cat cat : HOME){
            if (cat.getId() == catId)
                return Optional.of(cat);
        } 
            return Optional.empty();
    }

    //delete
    public static Boolean delete(Long catId){
        for(int i = 0; i < HOME.length; i++){
            if(HOME[i].getId() == catId){
                HOME[i] = null;
                return true;
            }
        }
                return false;
    }

    // update
    public static Boolean update(Long catId, Cat cat){
        for(int i = 0; i < HOME.length; i++){
            if(HOME[i].getId() == catId){
                HOME[i] = cat;
                return true;
            }
        }
                return false;
    }

    //patch
    //1. Don't Create cat, we should find the cat object, call setName()
    //2. other values of this cat object remian unchanged.
    public static Boolean patchName(Long catId, String catName){
        for (Cat cat :HOME){
            if(cat.getId() == catId)
            cat.setName(catName);
            return true;
        }
        return false;
    }
}
