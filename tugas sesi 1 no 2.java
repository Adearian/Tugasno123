package joptionpane;

import javax.swing.JOptionPane;
public class joptionpane {
    public static void main(String[] args) {
        String nama ="";
        nama = JOptionPane.showInputDialog("Anda Sedang Belajar Apa ?");
        String pesan = ( "belajar " + nama + " sangat mudah");
        JOptionPane.showMessageDialog(null, pesan);        
    }
}