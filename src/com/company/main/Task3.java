package com.company.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args){
        int bajt;
        try(
                FileInputStream fis = new FileInputStream("Stranger.txt");
                FileOutputStream fos = new FileOutputStream("CopyStrangers.txt")){

            do {
                bajt = fis.read();
                if((char) bajt == ' ' ) bajt = '-';
                if(bajt != -1) fos.write(bajt);
            }
            while(bajt != -1);
        }
          catch (IOException ex){
            System.out.println("Error IO");
          }
    }
}
