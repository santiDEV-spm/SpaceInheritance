package com.santidev.spaceinheritance;

import android.util.Log;

public class Bomber extends SpaceShip {

    public Bomber() {
        super(100);
        Log.i("Location","Bomber constructor");
    }

    @Override
    public void fireWeapon() {
        Log.i("Fire weapon", "Lanzando bombas");
    }
}
