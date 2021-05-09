/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author W10
 */
public class Truck {
    public int cadence;
    public int gear;
    public int speed;

    public Truck(int startCadence, int startGear, int startSpeed) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }

   public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void applybrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }
    
}
