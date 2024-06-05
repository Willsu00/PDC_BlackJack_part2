/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc_blackjack_part2;

/**
 *
 * @author willi
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class File_IO {
    private static final String Directory ="./logins/";
    private static Set<Integer> uniqueID = new HashSet<>();
    
    public static void writeToFile(String username, String password) throws IOException{
        if(username_exist(username)){
            throw new IllegalArgumentException("Username already exists");
        }
        
        int uniqueID = generateUniqueID();
        String filename = Directory + username + uniqueID + ".txt";
        
        PrintWriter writer = new PrintWriter(filename);
        writer.println("username: " + username);
        writer.println("password: " + password);
        writer.println("user ID: " + uniqueID);
        writer.close();
        
    }
    
    private static boolean username_exist(String username) throws IOException{
        File dir = new File(Directory);
        File[] files = dir.listFiles((d,name) -> name.endsWith(".txt"));
        
        for (File file : files){
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                if (line.contains("username: " + username)){
                    reader.close();
                    return true;
                }
            }
            reader.close();
        }
        return false;
    }
    
    private static int generateUniqueID(){
        Random rand = new Random();
        int number = rand.nextInt(9000) + 1000;
        while (uniqueID.contains(number)){
            number = rand.nextInt(9000) + 1000;
        }
        uniqueID.add(number);
        return number;
    }
}
