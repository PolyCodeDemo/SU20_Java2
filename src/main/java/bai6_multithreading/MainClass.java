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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MayBanHangTuDong may = new MayBanHangTuDong();
        Thread thai = new Thread(may);
        Thread tue = new Thread(may);
        thai.start();
        tue.start();
    }
    
}
