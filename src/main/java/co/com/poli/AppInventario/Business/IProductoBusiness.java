/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.Business;

import co.com.poli.AppInventario.Model.Producto;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface IProductoBusiness {
    
    List<Producto> obtenerProductos();

    Producto obtenerProducto(String codigo);

    boolean crearProducto(Producto producto);

    boolean eliminarProducto(String codigo);

    boolean modificarProducto(Producto producto);
    
}
