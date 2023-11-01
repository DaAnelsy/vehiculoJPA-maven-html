/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehiculoREPOSITORY;

import com.vehiculo.entity.Vehiculo;
import java.util.List;

/**
 *
 * @author da_an
 */
public interface Ivehiculo {
    Vehiculo save(Vehiculo v);
    Vehiculo edit(Vehiculo v);
    List<Vehiculo> vehiculo();
    Vehiculo findById(String placa);
}
