/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul9;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author ASUS
 */
public class TesFrame3 extends Frame {
    public static void main (String args[]) {
        TesFrame3 apl = new TesFrame3();
    }
    
    public TesFrame3() {
        super("Tes Frame");
        setSize(300,100);
        
        addWindowListener(new TesFrame3.PenangananKejadian());
        
        show();
    }
    
    class PenangananKejadian extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
