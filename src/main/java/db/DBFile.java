package db;

import models.File;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

import java.util.List;

public class DBFile {

    private static Session session;
    private static Transaction transaction;


//    METHODS

    public static List<File> orderBySize(){
        session = HibernateUtil.getSessionFactory().openSession();
        List<File> files = null;
        try {
            Criteria cr = session.createCriteria(File.class);
            cr.addOrder(Order.desc("size"));
            files = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return files;
    }


    public static Double getAverageSize(){
        session = HibernateUtil.getSessionFactory().openSession();
        Double average = null;
        try {
            transaction = session.beginTransaction();
            Criteria cr = session.createCriteria(File.class);
            cr.setProjection(Projections.avg("size"));
            average = (Double)cr.uniqueResult();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return average;
    }
}








