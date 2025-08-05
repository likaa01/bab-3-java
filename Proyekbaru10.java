package proyekbaru10;

import javax.swing.JOptionPane;

public class Proyekbaru10 {

    public static void main(String[] args) {
        try {
            // Input nilai a
           /* String aInput = JOptionPane.showInputDialog("Masukkan nilai untuk variabel a:");
            // Input nilai b
            String bInput = JOptionPane.showInputDialog("Masukkan nilai untuk variabel b:");

            // Konversi string ke integer
            int a = Integer.parseInt(aInput);
            int b = Integer.parseInt(bInput);

            // Hitung hasil perkalian
            int hasil = a * b;

            // Tampilkan hasil ke console
            System.out.println("Hasil: " + hasil);

            // Tampilkan hasil juga ke dalam JOptionPane
            JOptionPane.showMessageDialog(null, "Hasil dari " + a + " x " + b + " = " + hasil);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
