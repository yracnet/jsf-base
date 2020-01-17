/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.yracnet.app;

import dev.yracnet.app.model.TmpApp;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author yracnet
 */
@Stateless
@LocalBean
public class TmpAppLogic {

    @PersistenceContext(unitName = "app-store")
    private EntityManager em;

    public String name() {
        return "x";
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < 10; i++) {
            TmpApp tmpApp = new TmpApp();
            tmpApp.setId(new Long(i));
            tmpApp.setName("Name-" + i);
            tmpApp.setDesc("Desc-" + i);
            em.persist(tmpApp);
        }

    }

    public TmpApp getTmpApp(Long id) {
        return em.find(TmpApp.class, id);
    }

    public List<TmpApp> getTmpAppList() {
        return em.createQuery("SELECT o FROM TmpApp o").getResultList();
    }
}
