package com.santidev.spaceinheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fighter fighter = new Fighter();
        Bomber bomber = new Bomber();

        //No se puede instanciar una clase que es abstracta..
        //SpaceShip spaceShip = new SpaceShip();

        fighter.shipName = "Ned Stark";
        bomber.shipName = "Lara Croft";

        Log.i("Fighter", "La vida de " + fighter.shipName + " es de "+ fighter.getShieldStrength());
        Log.i("Bomber", "La vida de " + bomber.shipName + " es de "+ bomber.getShieldStrength());

        fighter.fireWeapon();
        fighter.fireWeapon();

        bomber.hitDetected();
        bomber.hitDetected();
        bomber.hitDetected();
        fighter.hitDetected();
        bomber.hitDetected();

        Log.i("Fighter", "La vida de " + fighter.shipName + " es de "+ fighter.getShieldStrength());
        Log.i("Bomber", "La vida de " + bomber.shipName + " es de "+ bomber.getShieldStrength());

    }
}