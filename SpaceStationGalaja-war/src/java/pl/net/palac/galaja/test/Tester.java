/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.net.palac.galaja.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import pl.net.palac.galaja.entity.Ship;

/**
 *
 * @author Jakub
 */
public class Tester {
    
    @PersistenceContext(unitName = "SpaceStationGalaja-ejbPU")
    static EntityManager em = Persistence.createEntityManagerFactory("SpaceStationGalaja-ejbPU").createEntityManager();
    
    public static void main(String[] args){
        Ship s = new Ship();
        s.setId(1);
        s.setName("Nemo");
        s.setSerialNumber("XX-11-NEMO");
        s.setCapacity(1000);
        s.setType(1);
        em.persist(s);
    }
}
