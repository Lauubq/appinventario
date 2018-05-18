package co.com.poli.AppInventario.DAO;

import co.com.poli.AppInventario.Model.Producto;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface IProductoDao {
    
    List<Producto> obtenerProductos();

    Producto obtenerProducto(String codigo);

    boolean crearProducto(Producto producto);

    boolean eliminarProducto(String codigo);

    boolean modificarProducto(Producto producto);
    
}
