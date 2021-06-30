// Penanganan Kejadian

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
public class TesButton2 extends Frame {

    int tinggi = 100;
    int lebar = 300;

    public static void main(String args[]) {
        TesButton2 apl = new TesButton2();
    }

    public TesButton2() {
        super("Tes Button");
        setSize(lebar, tinggi);

        Panel panelTombol = new Panel();
        panelTombol.add(new Button("Perbesar"));
        panelTombol.add(new Button("Selesai"));
        add("South", panelTombol);

        show();
    }

    public boolean handleEvent(Event kejadian) {
        switch (kejadian.id) {
            case Event.WINDOW_DESTROY:
                System.exit(0);
                return true;
            case Event.ACTION_EVENT:
                if (kejadian.target instanceof Button) {
                    if ("Perbesar".equals(kejadian.arg)) {
                        lebar += 20;
                        tinggi += 10;
                        setSize(lebar, tinggi);
                    } else {
                        if ("Selesai".equals(kejadian.arg)) {
                            System.exit(0);
                            return true;
                        }
                    }
                }
        }

        return false;
    }
}
