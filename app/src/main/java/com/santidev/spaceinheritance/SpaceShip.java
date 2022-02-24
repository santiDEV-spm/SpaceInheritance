package com.santidev.spaceinheritance;

import android.util.Log;

public abstract class SpaceShip {

    //variables clase
    private static int numShips;
    private int shieldStrength;
    public String shipName;

    //constructor
    public SpaceShip(int shieldStrength){
        Log.i("Location","SpaceShip constructor");
        SpaceShip.numShips++;
        setShieldStrength(shieldStrength);
    }

    //getters y setters
    public int getShieldStrength() {
        return shieldStrength;
    }

    private void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public static int getNumShips(){
        return  SpaceShip.numShips;
    }

    //Metodos adicionales
    public void hitDetected(){
        this.shieldStrength -= 25;
        Log.i("Incoming", "Booom!!");
        if (this.shieldStrength <= 0){
            destroyShip();
        }
    }
    private void destroyShip(){
        SpaceShip.numShips--;
        Log.i("Destoy", "La nave" + this.shipName + " ha sido destruida");
    }

    public abstract void fireWeapon();
}

