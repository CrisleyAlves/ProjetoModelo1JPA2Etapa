package br.edu.ifsul.testes;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.ifsul.edu.modelo.Especialidade;
import javax.persistence.EntityManager;

/**
 *
 * @author crisley
 */
public class TestePersistirEspecialidade {

    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        
        Especialidade e = new Especialidade();
        e.setNome("testando :(");
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        
        
    }
    
}
