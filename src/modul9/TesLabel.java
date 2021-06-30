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
public class TesLabel extends Frame{
    public static void main(String args[]) {
        TesLabel apl = new TesLabel();
    }
    
    public TesLabel() {
        super("Tes Label");
        setSize(300, 100);
        
        Label t1 = new Label("Halo", Label.LEFT);
        Label t2 = new Label("Hai", Label.CENTER);
        Label t3 = new Label("Hello", Label.RIGHT);
        
        Panel panelLabel = new Panel();
        panelLabel.setLayout(new GridLayout(3,1));
        panelLabel.add(t1);
        panelLabel.add(t2);
        panelLabel.add(t3);
        add("North", panelLabel);
        
        show();
    }
}
