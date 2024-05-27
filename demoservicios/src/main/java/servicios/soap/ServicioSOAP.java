package servicios.soap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
//import servicios.dominio.Estudiante;
import servicios.dominio.Nota;
import servicios.dominio.Producto;

@WebService
@Stateless
@LocalBean
public class ServicioSOAP {

    public ServicioSOAP() {
    	
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
    
    @WebMethod
    public String consultarNotas() {
        List<Nota> lst = new ArrayList<Nota>();
        for (int i = 1; i <= 5; i++) {
            Nota nota = new Nota();	
            nota.setCurso("Curso " + i);
            nota.setNota(13 + i);
            lst.add(nota);
        }
        // Serializar la lista de notas a una cadena
        StringBuilder result = new StringBuilder();
        for (Nota nota : lst) {
            result.append("Curso: ").append(nota.getCurso())
                  .append(", Nota: ").append(nota.getNota()).append("\n");
        }
        return result.toString();
    }
}