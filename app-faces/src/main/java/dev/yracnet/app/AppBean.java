/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.yracnet.app;

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

}
