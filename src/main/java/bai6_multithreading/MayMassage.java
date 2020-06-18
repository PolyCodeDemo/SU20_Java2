/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_multithreading;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiennh
 */
public class MayMassage implements Runnable{
    @Override
    public synchronized void run() {
        System.out.println("Xin mời nhập tên:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Xin mời " + name + " nạp tiền & ngồi vào máy!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MayMassage.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Hết tiền! Vui lòng nạp thêm hoặc nhường chỗ cho người khác!");
    }
    
}
