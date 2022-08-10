package com.softwareinstitute.nur.animals;

import java.lang.reflect.Modifier;
import java.util.List;
import java.lang.Class.*;
import java.util.Random;

public abstract class Animal extends java.lang.Object {
    //Sonar Check
    private int age;
    private Animal parent;
    private boolean alive;
    private Coords position;
    private boolean gender;
    private float mass;
    private float fullness;
    private float fillingRatio;
    private Food[] diet;


    abstract void breath();
    // abstract Animal breed(Animal partner);

    public Animal breed(Animal partner){
        Class anim = partner.getClass();
        boolean sameAnimal = partner.getClass() == this.getClass();
        if(!sameAnimal) throw new Error("Not the same kind of animal!");
        Animal child = null;
        try{
            child = partner.getClass().getDeclaredConstructor().newInstance();
        }
        catch (Exception e){
            return null;
        }
        finally {
            return child;
        }
    }

    void eat(Food food){

    }

    public Animal(Coords position, boolean gender){
        this.position = position;
        this.gender = gender;
    }

    public Animal(Coords position){
        this(position, true);
        Random random = new Random();
        boolean randBool = random.nextBoolean();

    }

    public Animal(){
        this(new Coords(0f, 0f, 0f));
    }

    public boolean isAlive() {
        return alive;
    }

    //region setters and getters
    public Food[] getDiet() {
        return diet;
    }

    public float getFillingRatio() {
        return fillingRatio;
    }

    public Coords getPosition() {
        return position;
    }

    public boolean isGender() {
        return gender;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getFullness() {
        return fullness;
    }

    public void setFullness(float fullness) {
        this.fullness = fullness;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getParent() {
        return parent;
    }

    public void setParent(Animal parent) {
        this.parent = parent;
    }

    //endregion

    public void die(){
        alive = false;
    }

    Coords moveTo(Coords position){
        this.position = position;
        return this.position;
    }

    Coords moveBy(Coords movement){
        position = Coords.add(position, movement);
        return position;
    }

    void sleep(){
        System.out.println("Sleeping");
    }
    Poop poop(){
        return new Poop();
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        Animal animal = null;
        try{
            animal = (Animal) obj;
        }
        catch (Exception e){
            return false;
        }
        boolean bool1 = animal.age == age;
        return bool1;
    }
}