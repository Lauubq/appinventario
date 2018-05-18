/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.data;

import co.com.poli.AppInventario.Model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laura
 */
public class ProductosData {
    
    public static List<Producto> productos;
    static {
        productos = new ArrayList<Producto>(){
            {
                add(new Producto("P1", "Morita", 1d));
                add(new Producto("P2", "Lauris", 2d));
                add(new Producto("P3", "El deibid", 3d));
                add(new Producto("P4", "El negro", 4d));
            }
        };
    }

    public static List<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(List<Producto> productos) {
        ProductosData.productos = productos;
    }
    
    
}
