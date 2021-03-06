/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gen_project.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

/**
 *
 * @author yann-
 */
@Entity
@Table(name="Dictionnaire")
@NamedQueries({
    @NamedQuery(name="Dictionnaire.findBySplice", 
        query="SELECT d FROM Dictionnaire d where d.word LIKE CONCAT('%',:splice,'%')") ,
    @NamedQuery(name="Dictionnaire.findOneWord", 
        query="SELECT d FROM Dictionnaire d where d.word = :input")
})
public class Dictionnaire implements Serializable {  
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //mot du dictionnaire
    @Column(name="mot")
    private String word;
    
    //valeur attribuée au mot
    /*@Column(name="valeur")
    private int value;*/
    
    
    // Dessous getter et setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getWord(){
        return word;
    }
    
    public void setWord(String word){
        this.word = word;
    }
    
   /* public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }*/

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.entity.Dictionnaire[ id=" + id + " ]";
    }
    
}
