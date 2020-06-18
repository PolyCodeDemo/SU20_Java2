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
public class MayBanHangTuDong implements Runnable {
    public static int dangPhucVu = 0;

    @Override
    public synchronized void run() {
        try {
            if (MayBanHangTuDong.dangPhucVu == 1) {
                wait();
            }

            MayBanHangTuDong.dangPhucVu = 1;
            System.out.println("Vui lòng đưa tiền vào & chọn sản phảm!");
            Thread.sleep(3000);
            
            System.out.println("Lấy sản phẩm!");
            MayBanHangTuDong.dangPhucVu = 0;
            notify();
        } catch (InterruptedException ex) {
            Logger.getLogger(MayBanHangTuDong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
