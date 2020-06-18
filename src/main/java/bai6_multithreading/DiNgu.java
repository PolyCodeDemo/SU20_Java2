/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiennh
 */
public class DiNgu implements Runnable {
    protected String name;

    public DiNgu(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " - Buồn ngủ nên đi ngủ ...");
            Thread.sleep(3000);
            System.out.println(this.name + " - Thức dậy!");
        } catch (InterruptedException ex) {
            Logger.getLogger(DiNgu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
