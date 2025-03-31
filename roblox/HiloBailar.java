/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roblox;


/**
 *
 * @author juani
*/

public class HiloBailar extends Thread {
    private crearEscenaGrafica escena;
    private volatile boolean running = true;

    public HiloBailar(crearEscenaGrafica es) {
        this.escena = es;
    }

    // Método para detener el hilo
    public void stopDancing() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            escena.BailarBachata();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                running = false;
            }
        }
    }
}