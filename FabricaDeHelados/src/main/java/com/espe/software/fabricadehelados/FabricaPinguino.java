/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.fabricadehelados;

/**
 *
 * @author labesp
 */
public class FabricaPinguino implements FabricaHelados{

    @Override
    public Paleta createPaleta() {
        return new PaletaPinguino();
    }

    @Override
    public MilkShake createMilkShake() {
        return new MilkShakePinguino();
    }
    
}
