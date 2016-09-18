package com;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 * @author Rillis Vernucio
 */
public class Notify {
    public static void notificar(String title, String msg, int time){
        Notification n = new Notification();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        n.setBounds(d.width-220, d.height, 220, 149);
        n.setVisible(true);
        n.title.setText(title);
        n.text.setText(msg);
            new Thread(){
                public void run(){
                   try{
                   int i = d.height;
                   int b = d.height-190;
                   while(i>b){
                       n.setBounds(d.width-220, i, 220, 149);
                       Thread.sleep(1);
                       i= i-2;
                   }
                   Thread.sleep(time);
                   i = d.height;
                   b = d.height-190;
                   while(b<i){
                       n.setBounds(d.width-220, b, 220, 149);
                       Thread.sleep(1);
                       b= b+2;
                   }
                   n.dispose();
                   }catch(Exception e){}
                }
            }.start();
    }
}
