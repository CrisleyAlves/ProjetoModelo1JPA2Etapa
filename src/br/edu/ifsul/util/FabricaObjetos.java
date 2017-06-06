
package br.edu.ifsul.util;

import br.ifsul.edu.modelo.Disciplina;
import br.ifsul.edu.modelo.Especialidade;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
public class FabricaObjetos {

    public static List<Especialidade> carregaEspecialidade(){
        List<Especialidade> lista = new ArrayList<>();
        
        Especialidade e = new Especialidade();
        e.setId(999);
        e.setNome("Especialidade A");
        
        Especialidade e2 = new Especialidade();
        e2.setId(999);
        e2.setNome("Especialidade A");
        
        lista.add(e);
        lista.add(e2);
        return lista;
    }
    
    
    
    
}
