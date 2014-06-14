/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.net.palac.galaja.ejb;

import java.util.List;
import javax.ejb.Local;
import pl.net.palac.galaja.entity.Ship;

/**
 *
 * @author Jakub
 */
@Local
public interface ShipFacadeLocal {

    void create(Ship ship);

    void edit(Ship ship);

    void remove(Ship ship);

    Ship find(Object id);

    List<Ship> findAll();

    List<Ship> findRange(int[] range);

    int count();
    
}
