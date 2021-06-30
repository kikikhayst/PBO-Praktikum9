/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul9;

import java.awt.*;

/**
 *
 * @author ASUS
 */
public class TesButton extends Frame{
    public static void main(String args[]) {
        TesButton apl = new TesButton();
    }
    
    public TesButton() {
        super("Tes Button");
        setSize(300, 100);
        
        Panel panelTombol = new Panel();
        panelTombol.add(new Button("Perbesar"));
        panelTombol.add(new Button("Selesai"));
        add("South", panelTombol);
        
        show();
    }
}
