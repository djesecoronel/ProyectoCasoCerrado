/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Listas;
import Modelo.Caso;
import java.util.List;

public interface ICaso {
    
        void insertarCaso(Caso c);
    List<Caso> leerCaso();
    Caso buscarCaso(Caso c);
    Caso eliminarCaso(Caso c);
    
}
