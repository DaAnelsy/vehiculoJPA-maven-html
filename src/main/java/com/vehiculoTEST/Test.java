/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehiculoTEST;

import ccom.vehiculoDAO.VehiculoDAO;
import com.vehiculo.entity.Vehiculo;
import com.vehiculoREPOSITORY.Ivehiculo;

/**
 *
 * @author da_an
 */
public class Test {
    public static void main(String[] args){
        try{
            Ivehiculo vehiculoDAO = new VehiculoDAO();
           /* Vehiculo v = new Vehiculo();
            
            v.setPlaca("DAI120");
            v.setModelo("audi TT RS");
            v.setColor("azul");
            v.setPuertas(2);
            v.setCilindro(4);
            v.setTipocombustible("gasolina");
            //vehiculoDAO.save(v); guardar 
            vehiculoDAO.edit(v);
            */
     for(Vehiculo v : vehiculoDAO.vehiculo()){
               System.err.println("Vehiculos: " + v.toString() );
           }

        /*if(vehiculoDAO.findById("") == null){
            System.out.println("no existe consulta");
        }*/
        } catch(Exception e){
            System.err.println("Error de  Guardado "+ e.getMessage());
        }
        
    }
}
