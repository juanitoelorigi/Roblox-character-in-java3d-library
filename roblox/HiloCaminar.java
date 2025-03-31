/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roblox;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juani
 */
public class HiloCaminar extends Thread {
    private crearEscenaGrafica escena;
    private volatile boolean running = true;

    public HiloCaminar(crearEscenaGrafica es) {
        this.escena = es;
    }

    // Método para detener el hilo
    public void stopWalking() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            escena.caminar();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                running = false;
            }
        }
    }
}