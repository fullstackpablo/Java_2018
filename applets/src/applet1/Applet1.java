/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fafa
 */

package applet1;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Applet1 extends Applet {
    public void init(){
        setBackground(Color.white);
    }
    public void paint(Graphics g){
        g.drawString("Primer applet", 10, 25);
    }
}
