/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.Models1;
import views.Views1;
import controllers.Controllers1;
/**
 *
 * @author PC 10
 */
public class Main {
    private static Models1 models1;
    private static Views1 views1;
    private static Controllers1 controllers1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        models1 = new Models1();
        views1 = new Views1();
        controllers1 = new Controllers1(models1, views1);
        // TODO code application logic here
    }
    
}
