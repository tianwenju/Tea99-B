package com.delta.smt;

import com.delta.commonlibs.utils.GsonTools;
import com.delta.smt.entity.MaterTest;

/**
 * @description :
 * @autHor :  V.Wenju.Tian
 * @date : 2017/1/9 14:25
 */


public class test {
    public static void main(String[] args) {
// String url="http://localhost:8081/SMM/NewMaterialStorage/bindMaterialAndLabel?body=%22{\\%22label\\%22:\\%22T-002\\%22,\\%22material_num\\%22:\\% 2500005010\\%22}%22";

        ///String test="http://localhost:8081/SMM/NewMaterialStorage/bindMaterialAndLabel?body=\"{\\\"label\\\":\\\"T-002\\\",\\\"material_num\\\":\\% 2500005010\\\"}\"";


        String url="http://localhost:8081/SMM/NewMaterialStorage/bindMaterialAndLabel?body=%22{\\%22label\\%22:\\%22T-002\\%22,\\%22material_num\\%22:\\% 2500005010\\%22}%22";

        String test="http://localhost:8081/SMM/NewMaterialStorage/bindMaterialAndLabel?body=\"{\\\"label\\\":\\\"T-002\\\",\\\"material_num\\\":\\% 2500005010\\\"}\"";

        MaterTest materTest =new MaterTest();
        materTest.setLabel("T-002");
        materTest.setMaterial_num("12341");
        String gsonString = GsonTools.createGsonString(materTest);

        String s ="{\"label\":\"T-002\",\"material_num\":\"12341\"}";
        String ss="\"{\\\"label\\\":\\\"T-002\\\",\\\"material_num\\\":\\\"12341\\\"}\"";
        String replace = gsonString.replace("\"", "\\\"");
        System.out.println(replace);

    }
}
