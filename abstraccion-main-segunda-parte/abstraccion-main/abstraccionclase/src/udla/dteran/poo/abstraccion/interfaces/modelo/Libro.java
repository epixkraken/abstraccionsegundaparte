package udla.dteran.poo.abstraccion.interfaces.modelo;

//implements interface
//abstract clas eabstracta

import java.util.ArrayList;
import java.util.List;

public class Libro  {

    private List<Hoja> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero){
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }


    public String imprimir (){
        return "";
    }

}
