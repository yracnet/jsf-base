/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.yracnet.app;

import dev.yracnet.app.model.TmpApp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wyujra
 */
public class TmpAppValidate {

    static List<String> validateCreate(TmpApp td) {
        List<String> result = new ArrayList<>();
        if (td == null) {
            result.add("TmpData is NULL");
        } else {
            validateContent(td, result);
        }
        return result;
    }

    static List<String> validateUpdate(TmpApp td) {
        List<String> result = new ArrayList<>();
        if (td == null) {
            result.add("TmpData is NULL");
        } else {
            if (td.getId() == null) {
                result.add("id is NULL");
            }
            validateContent(td, result);
        }
        return result;
    }

    private static void validateContent(TmpApp td, List<String> result) {
        if (td.getName() == null) {
            result.add("Name is NULL");
        }
        if (td.getDesc() == null) {
            result.add("Descripcion is NULL");
        }
    }

}
