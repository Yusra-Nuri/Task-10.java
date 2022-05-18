package com.company.main;
import java.io.*;

public class Task4 {
    String UserName;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String url="Intruders_List.txt";

                  public void ReadData() throws IOException {
                  System.out.println("Please write your first name and last name: ");
                  UserName = br.readLine();
                  }
                  public void WriteDataToFile() throws IOException {
                      System.out.println("saves data to the file.. ");
                      try (FileWriter fw = new FileWriter(url)) {
                          fw.write("/n" + url );
                      } catch (IOException ex) {
                          System.out.println("Data write error");
                      }
                  }
                  void ReadFromFile() {
                      try (BufferedReader br = new BufferedReader(new FileReader(url))) {
                          System.out.println("Reads data from a file");
                          while ((url = br.readLine()) != null) {
                              System.out.println(url);
                          }
                      } catch (IOException ex) {
                          System.out.println("Data loading error");
                      }
                  }
              }
 class Main {
    public static void main(String[] args) throws IOException {
        Task4 Tf = new Task4();
        Tf.WriteDataToFile();
        Tf.ReadData();
        Tf.ReadFromFile();
    }
}
