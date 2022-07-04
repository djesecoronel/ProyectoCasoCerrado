/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Modelo.Caso;
import java.util.List;

/**
 *
 * @author DAVID
 */
public abstract class ListaCaso implements ICaso {
    
    private ICaso registroCaso;

    public ListaCaso() {
        this.registroCaso = new ArrayListCaso();
    }
    
    
    @Override
    public void insertarCaso(Caso c) {
        
        this.registroCaso.insertarCaso(c);
        
    }

    @Override
    public List<Caso> leerCaso() {
        
        return this.registroCaso.leerCaso();
        
    }

    @Override
    public Caso buscarCaso(Caso c) {
        
        return this.registroCaso.buscarCaso(c);
        
    }

    @Override
    public Caso eliminarCaso(Caso c) {
        
        return this.registroCaso.eliminarCaso(c);
        
    }
    
}
