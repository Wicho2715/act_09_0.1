/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.Models1;
import views.Views1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author PC 10
 */
public class Controllers1 implements ActionListener{
    private final Models1 models1;
    private final Views1 views1;
    
    public Controllers1(Models1 models1, Views1 views1){
        this.models1 = models1;
        this.views1 = views1;
        views1.JB_Save.addActionListener(this);
        initView();
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==views1.JB_Save){
            models1.setPath("C:\\Users\\PC 10\\Documents\\NetBeansProjects\\base.csv");
            models1.setTxt(models1.getText(views1.JTF_Name.getText(),views1.JTF_Email.getText()));
            models1.readFile(models1.getPath(), models1.getTxt());
            JOptionPane.showMessageDialog(views1, "Se ha guardado el registro");
            views1.JTF_Name.setText(null);
            views1.JTF_Email.setText(null);
        }
    }

    private void initView() {
     views1.setTitle("Agenda");
     views1.setResizable(false);
     views1.setLocationRelativeTo(null);
     views1.setVisible(true);
    }    
}
