/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccom.vehiculoDAO;

import com.vehiculo.entity.Vehiculo;
import com.vehiculoDB.ConexionJPA;
import com.vehiculoREPOSITORY.Ivehiculo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author da_an
 */
public class VehiculoDAO implements Ivehiculo {
    private EntityManager em = null;
    
    @Override
    public Vehiculo save(Vehiculo v) {
        em = ConexionJPA.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(v);
            em.getTransaction().commit();
            System.out.println("GUARDADO");
        } finally{
          ConexionJPA.desconexion(em);
        }
        return v;
    }

    @Override
    public Vehiculo edit(Vehiculo v) {
        em = ConexionJPA.createEntityManager();
        try {
            Vehiculo v1 = em.find(Vehiculo.class, v.getPlaca());
            em.getTransaction().begin();
            if(em.contains(v1)){
                em.merge(v);
                em.getTransaction().commit();
                System.out.println("EDITADO");
            }else {
                System.out.println("NO EXISTE");  
            }    
        } finally{
          ConexionJPA.desconexion(em);
        }
        return v;
    }

    @Override
    public List<Vehiculo> vehiculo() {
        em = ConexionJPA.createEntityManager();
        List<Vehiculo> listVehiculo = null;
        try{
            Query query = em.createNamedQuery("Vehiculo.findAll");
            listVehiculo = query.getResultList();
        } finally{
          ConexionJPA.desconexion(em);
        }return listVehiculo; 
    }

    @Override
    public Vehiculo findById(String placa) {
        em = ConexionJPA.createEntityManager();
        try{
            return em.find(Vehiculo.class, placa);
        } finally{
          ConexionJPA.desconexion(em);
        }
    }
    
}
