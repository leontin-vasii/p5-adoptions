package com.p5.adoptions.repository;

import com.p5.adoptions.model.Animal;
import com.p5.adoptions.model.Cat;
import com.p5.adoptions.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class AnimalStore {

    public static final List<Animal> available = new ArrayList<Animal>(){
        {
            add(new Dog("Costel" , "https://www.bbc.com/news/newsbeat-32346810"));
            add(new Dog ("Akita" , "https://www.petfinder.com/dog-breeds/akita/"));
            add(new Dog ("Bruno" , "https://www.pinterest.com/pin/778559854310548267/"));

            add(new Cat ("Dora" , "https://www.westparkanimalhospital.com/blog/maine-coon-cats/"));
            add(new Cat("Steven" , "https://www.aspcapetinsurance.com/resources/maine-coon-cat-facts/"));
            add(new Cat ("Gica" , "https://www.catster.com/cat-breeds/maine-coon"));
        }
    };
}
