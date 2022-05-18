package com.company.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        int bajt;

        try
        {
            fis = new FileInputStream("Stranger.txt");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Sorry! File not found");
            return;
        }
        try {
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.println((char) bajt);
            }
            while(bajt != -1);
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file");
        }
        finally{
            try{
                fis.close();
                System.out.println("Sorry");
            }
            catch(IOException ex)
            {
                System.out.println("Ooops there's error in file");
            }
        }
    }
}
