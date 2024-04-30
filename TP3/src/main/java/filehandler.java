
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GHADA
 */
public class filehandler {
    private String filePath;
    private Integer fileSizeInkb;
    private Integer numberOfLines;
    private ArrayList<String> fileContent;

    public void filehandler(String filePath) {
        this.filePath = filePath;
        File f = new File(filePath);
         this.numberOfLines = f.length()
        // Check existance (if(f.exists))
        // exescute readFile
    }
    
    public void readfile() throws FileNotFoundException{
        // assign values to fileSize, numberOfLines and Filecontent
      File file = new File(this.filePath);
            Scanner scanner = new Scanner(file);

          int numberOfLines = 0;
            while (scanner.hasNextLine()) {
                numberOfLines++ ;
                scanner.nextLine();
            }
            this.numberOfLines=numberOfLines;

           System.out.println("Nombre de lignes dans le fichier : " + numberOfLines);
 
         while (scanner.hasNextLine()) {
                this.fileContent.add(scanner.nextLine());
            }

            scanner.close(); 

    }
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getFileSizeInkb() {
        return fileSizeInkb;
    }

    public void setFileSizeInkb(Integer fileSizeInkb) {
        this.fileSizeInkb = fileSizeInkb;
    }

    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }
    public ArrayList findLinesWithPatterns(String pattern ){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i< this.fileContent.size(); i++){
            this.fileContent.get(i).contains(pattern);// if true
            list.add(this.fileContent.get(i))
        }

      return (ArrayList) list;
    }

    
    

       
 
public boolean compareString1 (String str1 , String str2 ){
        return str1.equals(str2);
    }
public boolean compareString2 (String str1 , String str2 ){
  return str1.equalsIgnoreCase(str2);
}
public boolean compareString3 (String str1 , String str2 ){
return str1 == str2;
}
public void reverseString(int lineIndex) {
        if (lineIndex >= 0 && lineIndex < numberOfLines) {
            String line = fileContent.get(lineIndex);
            StringBuilder rev = new StringBuilder(line);
            rev.reverse();
            fileContent.set(lineIndex, rev.toString());
            
        } else {
            System.out.println("Indice de la ligne non inversée ");
        }
    }
 public void removeDuplicates(int lineIndex) {
        if (lineIndex >= 0 && lineIndex < numberOfLines) {
            String line = fileContent.get(lineIndex);
            StringBuilder clean = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char Char = line.charAt(i);
                if (clean.indexOf(String.valueOf(Char)) == -1) {
                    clean.append(Char);
                }
            }
            fileContent.set(lineIndex, clean.toString());
           
        } else {
            System.out.println("Indice invalide ");
        }
    }
        } 


}