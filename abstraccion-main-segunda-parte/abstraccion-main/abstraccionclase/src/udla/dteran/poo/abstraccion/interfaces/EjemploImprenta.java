package udla.dteran.poo.abstraccion.interfaces;

import udla.dteran.poo.abstraccion.interfaces.modelo.Curriculo;
import udla.dteran.poo.abstraccion.interfaces.modelo.Hoja;
import udla.dteran.poo.abstraccion.interfaces.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {
     Curriculo cv = new Curriculo("juan galan", "software", "ect....");
     cv.experiencia ("Java");
     cv.experiencia ("Oracle");

     Informe informe = new Informe("autor", "revisor", "contentido");
     imprimir(cv);
     imprimir(informe);
    }

    public static void imprimir (Hoja imprime){
        System.out.println(imprime.imprimir());
    }
}
