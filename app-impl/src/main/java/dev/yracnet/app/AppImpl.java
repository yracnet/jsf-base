/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.yracnet.app;

import dev.yracnet.app.TmpAppLogic;
import dev.yracnet.app.AppServ;
import dev.yracnet.app.data.Data;
import dev.yracnet.app.model.TmpApp;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author yracnet
 */
@Stateless
@Local(AppServ.class)
public class AppImpl implements AppServ {

    @Inject
    private TmpAppLogic appLogic;

    @Override
    public String name() {
        return appLogic.name();
    }

    @Override
    public Data getData(Long id) {
        TmpApp tmpApp = appLogic.getTmpApp(id);
        return AppMapper.mapperToData(tmpApp);
    }

    @Override
    public List<Data> getList() {
        return appLogic.getTmpAppList().stream().map(AppMapper::mapperToData).collect(Collectors.toList());
    }

}
