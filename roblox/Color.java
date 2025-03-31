/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roblox;

import javax.media.j3d.Appearance;
import javax.media.j3d.ColoringAttributes;
import javax.vecmath.Color3f;

/**
 *
 * @author juani
 */
public class Color {
    Appearance appColor;
    
    public Appearance setColor(int a, int b, int c){
        appColor = new Appearance();
        Color3f color = new Color3f(a/255f, b/255f, c/255f);
        ColoringAttributes atributosColor = new ColoringAttributes(color, ColoringAttributes.SHADE_FLAT);
        appColor.setColoringAttributes(atributosColor);
        return appColor;
    }
}
