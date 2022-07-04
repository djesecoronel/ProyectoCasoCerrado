/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;
import Modelo.Caso;
import Modelo.Caso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author JAIRO
 */
public class ArrayListCaso implements ICaso {
    private List<Caso> listaCaso;

    public ArrayListCaso() {
        this.listaCaso = new ArrayList();
    }
    
    
    @Override
    public void insertarCaso(Caso c) {
        this.listaCaso.add(c);
    }

    @Override
    public List<Caso> leerCaso() {
       List<Caso> lista = new ArrayList(this.listaCaso);
       return lista;
    }

    public Caso buscarCaso(Caso p) {
        Caso buscar=null;
        for(Caso i: this.listaCaso){
            if(i.getNumCaso().equalsIgnoreCase(p.getNumCaso())){
                
                buscar = i;
                break;
            }
        }
        return buscar;
        
    }

    public Caso eliminarCaso(Caso c) {
        Iterator<Caso> i = this.listaCaso.iterator();
        Caso eliminado=null;
        while(i.hasNext()){
            Caso aux = i.next();
            if(aux.getNumCaso().equalsIgnoreCase(c.getNumCaso())){
                eliminado = aux;
                i.remove();
                break;
            }
        }
        return eliminado;
    }


    
}
