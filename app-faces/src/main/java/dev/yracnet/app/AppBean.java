/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.yracnet.app;

import dev.yracnet.app.data.Data;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author yracnet
 */
public class AppBean {

    @Inject
    private AppServ appServ;

    public String getName() {
        return appServ.name();
    }

    private List<Data> list;
    private Data data;
    private Long id;

    public List<Data> getList() {
        if (list == null) {
            list = appServ.getList();
        }
        return list;
    }

    public Data getData() {
        if (data == null && id != null) {
            data = appServ.getData(id);
        }
        return data;
    }

    public void dataRefresh_action() {
        list = null;
        data = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
