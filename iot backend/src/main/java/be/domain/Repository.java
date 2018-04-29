package be.domain;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class Repository {
    @PersistenceContext
    private EntityManager entitymanager;

    public void storeTempData(TempData tempData) {
        entitymanager.persist(tempData);
    }

    public List<TempData> getAllTempData() {
        return entitymanager
                .createQuery("select t from TempData t", TempData.class)
                .getResultList();
    }


}
