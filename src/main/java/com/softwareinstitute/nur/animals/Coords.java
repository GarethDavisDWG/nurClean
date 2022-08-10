package com.softwareinstitute.nur.animals;

public class Coords {
    float x;
    float y;
    float z;



    public Coords(float x, float y, float z){
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //region Getters/setters
    public Coords(float x, float y){
        this(x, y, 0f);
    }

    public Coords(){
        this(0f, 0f);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    //endregion

    public static Coords add(Coords coords1, Coords coords2){
        Coords ret = new Coords(coords1.x + coords2.x, coords1.y + coords2.y, coords1.z + coords2.z);
        return ret;
    }

    public static Coords subtract(Coords coords1, Coords coords2){
        Coords ret = new Coords(coords1.x - coords2.x, coords1.y - coords2.y, coords1.z - coords2.z);
        return ret;
    }

}
