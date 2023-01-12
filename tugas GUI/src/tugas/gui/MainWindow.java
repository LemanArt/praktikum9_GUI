/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.gui;
import javax.swing.JFrame;
/**
 *
 * @author Leman
 */
public class MainWindow extends JFrame {

    public MainWindow(){
        this.setTitle("Jendela Utama");
        this.setSize(600,320);
    }
    
    public static void main(String[] args) {
        MainWindow mWindow = new MainWindow();
        mWindow.setVisible(true);
    }
    
}