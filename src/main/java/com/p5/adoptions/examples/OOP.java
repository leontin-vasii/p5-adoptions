package com.p5.adoptions.examples;

import com.p5.adoptions.model.Animal;
import com.p5.adoptions.model.Cat;

public class OOP {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal2 = new Animal("Misha" , "www.misha.com");
        Animal animal3 = new Animal()
                .setName("Misha")
                .setPhotoUrl("photo");
        //animal.speak();

        //Polymorphism
        Cat cat = new Cat("Misha" , "photo");
        Animal catAnimal = new Cat("Kara", "photo");

        cat.speak();
        catAnimal.speak();


    }
}
