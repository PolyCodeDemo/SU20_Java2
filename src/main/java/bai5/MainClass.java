/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiennh
 */
public class MainClass {
    public static void main(String[] args) {
        try {
            FileReader fReader = new FileReader("/Users/tiennh/Desktop/file_input.txt");
            BufferedReader buffer = new BufferedReader(fReader);
            String text;
            while((text = buffer.readLine()) != null) {
                System.out.println(text);
            }
            
            buffer.close();
            fReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File khong ton tai!");
        } catch (IOException ex) {
            System.out.println("File chua ky tu dac biet!");
        }
        
    }
    
}
