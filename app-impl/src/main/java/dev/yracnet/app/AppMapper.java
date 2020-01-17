/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.yracnet.app;

import dev.yracnet.app.data.Data;
import dev.yracnet.app.model.TmpApp;

/**
 *
 * @author wyujra
 */
public class AppMapper {

    public static Data mapperToData(TmpApp tmpApp) {
        Data data = new Data();
        data.setId(tmpApp.getId());
        data.setName(tmpApp.getName());
        return data;
    }

    public static TmpApp mapperToTmpApp(Data data) {
        TmpApp tmpApp = new TmpApp();
        tmpApp.setId(data.getId());
        tmpApp.setName(data.getName());
        return tmpApp;
    }

}
