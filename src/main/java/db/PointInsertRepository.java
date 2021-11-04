package db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;

public class PointInsertRepository implements Serializable {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("InsertRepo");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    public boolean insertPoint(PointEntity point) {
        entityManager.getTransaction().begin();
        entityManager.createNativeQuery("INSERT INTO points (x, y, r, time, result) VALUES (?,?,?,?,?)")
                .setParameter(1, point.getX())
                .setParameter(2, point.getY())
                .setParameter(3, point.getR())
                .setParameter(4, point.getTime())
                .setParameter(5, point.getResult())
                .executeUpdate();
        entityManager.getTransaction().commit();
        return true;
    }
}
