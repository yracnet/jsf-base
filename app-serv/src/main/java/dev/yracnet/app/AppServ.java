/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.yracnet.app;

import dev.yracnet.app.data.Data;
import java.util.List;

/**
 *
 * @author yracnet
 */
public interface AppServ {

    String name();

    Data getData(Long id);

    List<Data> getList();
}
