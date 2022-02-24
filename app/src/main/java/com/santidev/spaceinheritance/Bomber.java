package com.santidev.spaceinheritance;

import android.util.Log;

public class Bomber extends SpaceShip {

    public Bomber() {
        super(100);
    }

    @Override
    public void fireWeapon() {
        Log.i("Fire weapon", "Lanzando bombas");
    }
}
