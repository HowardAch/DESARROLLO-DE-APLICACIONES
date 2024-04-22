/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csemana03_coronel;
import javax.swing.JFrame;
/**
 *
 * @author HOWARD
 */
public class main03 {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new CEjemplo03());
        frame.pack();
        frame.setVisible(true);
    }
}
