/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricadeinstrumentos;

import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Sucursal> sucursales;
    
    public Fabrica(){
        this.sucursales = new ArrayList<>();
    }
    
    public void listarInstrumentos(){
        for(Sucursal sucursal : sucursales){
            System.out.println(sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
    }
    public void agregarSucursal(Sucursal suc){
        this.sucursales.add(suc);
    }
}
