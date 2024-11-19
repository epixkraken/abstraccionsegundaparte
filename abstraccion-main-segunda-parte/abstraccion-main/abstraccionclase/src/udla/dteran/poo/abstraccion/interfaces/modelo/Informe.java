package udla.dteran.poo.abstraccion.interfaces.modelo;

public class Informe extends Hoja{

    private String autor;
    private String revisor;

    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor
                + "Revisado por: " + this.revisor +
                "\n" + this.contenido;
    }
}

//7 si es clase abstracta y recibi por no menos un parametro
// necesito escribir ese constructor ern la suepr ckase