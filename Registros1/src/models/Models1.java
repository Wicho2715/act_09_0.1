/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.io.*;
/**
 *
 * @author PC 10
 */
public class Models1 {
    private String Path;
    private String Txt;

    public String getPath() {
        System.out.println("getPath");
        return Path;
    }

    public void setPath(String Path) {
        System.out.println("setPath");
        this.Path = Path;
    }

    public String getTxt() {
        System.out.println("getTxt");
        return Txt;
    }

    public void setTxt(String Txt) {
        System.out.println("setTxt");
        this.Txt = Txt;
    }
     public String getText(String name, String email){
        String txt=name+";"+email+"\n";
        System.out.println(txt);
        return txt;
    }
     public void readFile(String path, String txt){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, true);
            try(PrintWriter printWriter = new PrintWriter(fileWriter)){
                System.out.println("--------");
                System.out.println(txt);
                printWriter.println(txt);
                printWriter.close();
            }        
        }catch(IOException err){
            System.err.println("error "+err.getMessage());
        }
    }
}
