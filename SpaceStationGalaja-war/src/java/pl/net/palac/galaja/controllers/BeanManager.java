/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.net.palac.galaja.controllers;

import pl.net.palac.galaja.entity.Ship;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jakub
 */
public class BeanManager {
    
    @PersistenceContext(unitName = "SpaceStationGalaja-ejbPU")
    private EntityManager em;
    
    private ArrayList<Ship> ships;
//    private ArrayList<Dock> docks;
//    private ArrayList<Planet> planets;
//    private ArrayList<Station> stations;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

//    public ArrayList<Dock> getDocks() {
//        return docks;
//    }
//
//    public void setDocks(ArrayList<Dock> docks) {
//        this.docks = docks;
//    }
//
//    public ArrayList<Planet> getPlanets() {
//        return planets;
//    }
//
//    public void setPlanets(ArrayList<Planet> planets) {
//        this.planets = planets;
//    }
//
//    public ArrayList<Station> getStations() {
//        return stations;
//    }
//
//    public void setStations(ArrayList<Station> stations) {
//        this.stations = stations;
//    }

    /**
     * Creates a new instance of ManagedBean
     */
    public BeanManager() {
    }
    
    private void getTransaction(){
        em.getTransaction().begin();
    }
    
    
    // for addShip() uses
    private String name;
    private String serialNumber;
    private Integer capacity;
    private Integer type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    
    
    public void addShip(){
        Ship s = new Ship();
        s.setName(name);
        s.setCapacity(capacity);
        s.setSerialNumber(serialNumber);
        s.setType(type);
//        em.getTransaction().begin();
        em.persist(s);
//        em.getTransaction().commit();
    }
    
    
    
}
