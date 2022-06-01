package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String text = "So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words, I don't just say\n" +
                "And nothing else matters";
        Song song = new Song("Nothing Else Matters","Metallica",text);
        try(FileWriter fileWriter = new FileWriter("mySong.txt")){
            fileWriter.write("Title: *"+song.getTitle()+"*");
            fileWriter.write("\nAuthor is: ~"+song.getAuthor()+"~");
            fileWriter.write("\nText:");
            fileWriter.write("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            fileWriter.write("\n"+song.getText());
            fileWriter.write("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }catch (IOException e){
            e.printStackTrace();
        }
        try(FileReader fileReader = new FileReader("mySong.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}