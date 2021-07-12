/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class CopyFile {

    public static void main(String[] args) {
        File dirFrom = new File("E:\\ThucTap\\Cường SVTN 2019.docx");
        File dirTo = new File("E:\\test\\5.txt");

        try {
            Files.copy(dirFrom.toPath(), dirTo.toPath());
            List<String> strList = new ArrayList<String>();
            strList.add("A");
            strList.add("Aa");
            strList.add("Aaa");
            FileWriter writer = new FileWriter(dirTo, true);
            BufferedWriter bw = new BufferedWriter(writer);
            for (String str : strList) {
                bw.write(str);
                bw.newLine();
            }

            bw.close();

            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(ex.toString());
        }
    }

    public static void copyFile(File from, File to) throws IOException {

    }
}
