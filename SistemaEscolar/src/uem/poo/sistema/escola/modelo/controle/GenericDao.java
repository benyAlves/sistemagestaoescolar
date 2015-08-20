/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo.controle;


import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import uem.poo.sistema.escola.modelo.util.HibernateUtil;

/**
 *
 * @author maluleque
 * @param <T> representa uma entidade qualquer
 */
public class GenericDao<T extends Serializable> {

    private final Session session;
    private final Class<T> persistentClass;
    private static GenericDao instancia;

    public GenericDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    
    public static GenericDao getInstancia(){
        if(instancia==null){
            instancia = new GenericDao();
        }
     return instancia;
    }

    public Session getSession() {
        return session;
    }

    protected void save(T entity) {
        try {
            getSession().getTransaction().begin();
            getSession().save(entity);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
        } finally {
            getSession().close();
        }
    }

    protected void update(T entity) {
        try {
            getSession().getTransaction().begin();
            getSession().update(entity);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
        } finally {
            close();
        }
    }

    protected void apagar(T entity) {
        try {
            getSession().getTransaction().begin();
            getSession().delete(entity);
            getSession().getTransaction().commit();
        } catch (Throwable t) {
            getSession().getTransaction().rollback();
        } finally {
            close();
        }
    }

    public List<T> encontraTodos()  {
        return getSession().createCriteria(persistentClass).list();
    }

    public T procuraPorNome(String nome) {
        return (T) getSession().createCriteria(persistentClass)
                .add(Restrictions.eq("nome", nome).ignoreCase()).uniqueResult();
    }

    public T procuraPorId(long id) {
        return (T) getSession().createCriteria(persistentClass)
                .add(Restrictions.eq("id", id)).uniqueResult();
    }
    
    private void close() {
        if (getSession() != null && getSession().isOpen()) {
            getSession().close();
        }
    }
}
