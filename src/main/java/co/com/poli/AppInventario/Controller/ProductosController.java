/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.Controller;

import co.com.poli.AppInventario.Business.IProductoBusiness;
import co.com.poli.AppInventario.Model.Producto;
import co.com.poli.AppInventario.Path.ProductosPath;
import java.nio.file.Path;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Laura
 */
@RestController
@RequestMapping(value = "/")
public class ProductosController {
    
    @Autowired
    IProductoBusiness productosBusiness;
    
    @GetMapping(value = ProductosPath.PRODUCTOS)
    public List<Producto> getProductos(HttpServletResponse res) {
        return productosBusiness.obtenerProductos();
    }
    
}
