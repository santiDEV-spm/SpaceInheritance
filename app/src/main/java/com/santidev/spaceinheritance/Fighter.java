package com.santidev.spaceinheritance;

import android.util.Log;

public class Fighter extends SpaceShip{

    public Fighter() {
        super(500);
    }

    @Override
    public void fireWeapon() {
        Log.i("Fire weapon", "Disparando lasers");
    }
}
