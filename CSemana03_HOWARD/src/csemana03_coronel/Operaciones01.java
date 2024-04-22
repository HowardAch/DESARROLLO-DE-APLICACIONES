/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csemana03_coronel;

import java.util.ArrayList;
import java.util.Collections;

public class Operaciones01 {

    private ArrayList<Double> datos = new ArrayList<>();
    
    public void agregarDato(Double dato) {
        datos.add(dato);
    }
    
    public void quitarDato(Double dato) {
        datos.remove(dato);
    }
    
    public void limpiarDatos() {
        datos.clear();
    }
    
    public ArrayList<Double> ordenarDatos() {
        Collections.sort(datos);
        return datos;
    }
    
    public double calcularMedia() {
        if (datos.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Double dato : datos) {
            suma += dato;
        }
        return suma / datos.size();
    }
    
    public double calcularMediana() {
        if (datos.isEmpty()) {
            return 0;
        }
        Collections.sort(datos);
        int size = datos.size();
        if (size % 2 == 0) {
            return (datos.get((size / 2) - 1) + datos.get(size / 2)) / 2;
        } else {
            return datos.get(size / 2);
        }
    }
    
    public double calcularModa() {
        if (datos.isEmpty()) {
            return 0;
        }
        double moda = datos.get(0);
        int maxCount = 0;
        for (int i = 0; i < datos.size(); i++) {
            double temp = datos.get(i);
            int count = 1;
            for (int j = 1; j < datos.size(); j++) {
                if (datos.get(j) == temp) {
                    count++;
                }
            }
            if (count > maxCount) {
                moda = temp;
                maxCount = count;
            }
        }
        return moda;
    }
    
    public double calcularVarianza() {
        if (datos.isEmpty()) {
            return 0;
        }
        double media = calcularMedia();
        double temp = 0;
        for (double a : datos) {
            temp += (a - media) * (a - media);
        }
        return temp / datos.size();
    }
    
    public double calcularDesviacionEstandar() {
        return Math.sqrt(calcularVarianza());
    }
}
