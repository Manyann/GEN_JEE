/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gen_project;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import com.mycompany.gen_project.model.DataAccess;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author yann-    
 */
@ManagedBean(name ="Dictionnaire")
@SessionScoped
public class DictionnaireBean {
    @ManagedProperty(value="#{word}")
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
