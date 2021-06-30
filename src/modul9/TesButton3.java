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
public class TesButton3 extends Frame {

    int tinggi = 100;
    int lebar = 300;

    public static void main(String args[]) {
        TesButton3 apl = new TesButton3();
    }

    public TesButton3() {
        super("Tes Button");
        setSize(lebar, tinggi);

        Button tombolPerbesar = new Button("Perbesar");
        Button tombolSelesai = new Button("Selesai");

        Panel panelTombol = new Panel();
        panelTombol.add(tombolPerbesar);
        panelTombol.add(tombolSelesai);
        add("South", panelTombol);

        tombolPerbesar.addActionListener(new TesButton3.penangananTombol());
        tombolSelesai.addActionListener(new TesButton3.penangananTombol());

        addWindowListener(new TesButton3.penangananKejadian());
        show();
    }

    class penangananKejadian extends WindowAdapter {

        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    class penangananTombol implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            if (s.equals("Perbesar")) {
                lebar += 20;
                tinggi += 10;
                setSize(lebar, tinggi);
            } else {
                if (s.equals("Selesai")) {
                    System.exit(0);
                }
            }
        }
    }
}
