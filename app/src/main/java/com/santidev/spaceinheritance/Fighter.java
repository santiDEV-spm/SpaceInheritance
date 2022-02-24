package com.santidev.spaceinheritance;

import android.util.Log;

public class Fighter extends SpaceShip{

    public Fighter() {
        super(500);
        Log.i("Location","Fighter constructor");
    }

    @Override
    public void fireWeapon() {
        Log.i("Fire weapon", "Disparando lasers");
    }
}
