/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.yracnet.app;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author yracnet
 */
@Stateless
@LocalBean
public class AppLogic{

    public String name() {
        return "x";
    }
    
}
