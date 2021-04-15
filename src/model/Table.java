/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author luuhuy
 */
public class Table implements Serializable{
    private int id;
    private int numberTable;
    private String type;
    private String des;
    private int idres;

    public Table() {
    }

    public Table(int numberTable, String type, String des) {
        this.numberTable = numberTable;
        this.type = type;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberTable() {
        return numberTable;
    }

    public void setNumberTable(int numberTable) {
        this.numberTable = numberTable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getIdres() {
        return idres;
    }

    public void setIdres(int idres) {
        this.idres = idres;
    }
    
    
}
