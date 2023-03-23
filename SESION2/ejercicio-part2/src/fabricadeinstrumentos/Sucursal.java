/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricadeinstrumentos;

import java.util.ArrayList;

public class Sucursal {
    private ArrayList<Instrumento> instrumentos;
    private String nombre;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarInstrumento(Instrumento ins){
        this.instrumentos.add(ins);
    }
    
    public void listarInstrumentos(){
        for(Instrumento instrumento : instrumentos){
            System.out.println(instrumento);
        }
    }
}
