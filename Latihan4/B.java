/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author W10
 */
public class B extends A{
    private int b;

    public int getB() {
        return b;
    }

    public void setB(int nilai) {
        b = nilai;
    }
    @Override
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b : "+getB());
    }
}