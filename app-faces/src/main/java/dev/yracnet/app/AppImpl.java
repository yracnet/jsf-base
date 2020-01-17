/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.yracnet.app;

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
    private AppLogic appLogic;

    @Override
    public String name() {
        return appLogic.name();
    }

}
