/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.DAO.impl;

import co.com.poli.AppInventario.DAO.IProductoDao;
import co.com.poli.AppInventario.Model.Producto;
import co.com.poli.AppInventario.data.ProductosData;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laura
 */
@Repository
public class ProductoDaoImpl implements IProductoDao{
    
     @Override
    public List<Producto> obtenerProductos() {
        return ProductosData.getProductos();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        Producto producto = null;
        for (Producto aux : obtenerProductos()) {
            if (aux.getCodigo().equals(codigo)) {
                producto = aux;
                break;
            }
        }
        return producto;
    }

    @Override
    public boolean crearProducto(Producto producto) {
        List<Producto> listado = obtenerProductos();
        boolean creado = false;
        if (listado.add(producto)) {
            ProductosData.setProductos(listado);
            creado = true;
        }
        return creado;

    }

    @Override
    public boolean eliminarProducto(String codigo) {
        Producto producto = new Producto();
        producto.setCodigo(codigo);
        List<Producto> listado = obtenerProductos();
        boolean eliminado = false;
        if (listado.remove(producto)) {
            ProductosData.setProductos(listado);
            eliminado = true;
        }
        return eliminado;
    }

    @Override
    public boolean modificarProducto(Producto producto) {
        List<Producto> listado = obtenerProductos();
        boolean modificado = false;
        if (listado.set(listado.indexOf(producto), producto) != null) {
            ProductosData.setProductos(listado);
            modificado = true;
        }
        return modificado;
    }

}
