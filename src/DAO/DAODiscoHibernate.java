/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Hibernate.SingletonConection;
import Modelo.Disco;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author martin
 */
public class DAODiscoHibernate implements IDAODisco{

    @Override
    public List consultar() {
        Session session = SingletonConection.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Disco.class);
        List discos = criteria.list();
        session.getTransaction().commit();
        return discos;
    }

    @Override
    public void guardar(Disco disco) {
        Session session = SingletonConection.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(disco);
        session.getTransaction().commit();
        
    }
    
}
