package servicios.soap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import servicios.dominio.Producto;

@WebService
@Stateless
@LocalBean
public class ProductoServicioSOAP {

    public ProductoServicioSOAP() {
        // Constructor vacío
    }
    
    @WebMethod
    public String listaProductos() {
        Random ran = new Random();
        
        List<Producto> miLista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Producto prod = new Producto("Producto " + i, "Marca " + i, ran.nextInt(200) + 1, ran.nextInt(1000) + 1, "Tipo " + i);
            miLista.add(prod);
        }
        
        StringBuilder result = new StringBuilder();
        for (Producto producto : miLista) {
            result.append("Nombre: ").append(producto.getNombre())
                .append(", Marca: ").append(producto.getMarca())
                .append(", Precio: ").append(producto.getPrecio())
                .append(", Contenido: ").append(producto.getContenido())
                .append(", Tipo: ").append(producto.getTipo()).append("\n");
        }
        return result.toString();
    }
}

