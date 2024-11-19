package udla.dteran.poo.abstraccion.interfaces.modelo;

//papa clase
//clase abstracta
// protected manera de acceder a un atributo sin necesitar metodos
// una clase abstracta puede tener o no metodos abstractos
// no puedo crear un metodo abstracto en una clase no abstracta


abstract public class Hoja {
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    //metodo abstracto dentro de la clase absracta
    abstract public String imprimir();
}
