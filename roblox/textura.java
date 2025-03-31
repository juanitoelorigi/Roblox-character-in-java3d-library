/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roblox;

import com.sun.j3d.utils.image.TextureLoader;
import java.awt.Container;
import java.io.File;
import javax.media.j3d.Appearance;
import javax.media.j3d.Texture;

/**
 *
 * @author juani
 */
public class textura {
    public Appearance crearTexturas(String nomarch){
        File file = new File("");
        String ruta = file.getAbsolutePath()+"\\src\\img\\";
        TextureLoader loader = new TextureLoader((ruta+nomarch), new Container());
        Texture texture = loader.getTexture();
        Appearance app = new Appearance();
        app.setTexture(texture);
        return app;
    }
}
