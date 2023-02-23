/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.Entities;

/**
 *
 * @author octanet
 */
public class Categorie_oeuvre {
    private int Id_cat_oeuv ;
private String Nom_cat_oeuv , description_cat_oeuv ;

    public Categorie_oeuvre() {
    }

    public Categorie_oeuvre(String Nom_cat_oeuv, String description_cat_oeuv) {
        this.Nom_cat_oeuv = Nom_cat_oeuv;
        this.description_cat_oeuv = description_cat_oeuv;
    }

    public int getId_cat_oeuv() {
        return Id_cat_oeuv;
    }

    public void setId_cat_oeuv(int Id_cat_oeuv) {
        this.Id_cat_oeuv = Id_cat_oeuv;
    }

    public String getNom_cat_oeuv() {
        return Nom_cat_oeuv;
    }

    public void setNom_cat_oeuv(String Nom_cat_oeuv) {
        this.Nom_cat_oeuv = Nom_cat_oeuv;
    }

    public String getDescription_cat_oeuv() {
        return description_cat_oeuv;
    }

    public void setDescription_cat_oeuv(String description_cat_oeuv) {
        this.description_cat_oeuv = description_cat_oeuv;
    }

    @Override
    public String toString() {
        return "Categorie_oeuvre{" + "Id_cat_oeuv=" + Id_cat_oeuv + ", Nom_cat_oeuv=" + Nom_cat_oeuv + ", description_cat_oeuv=" + description_cat_oeuv + '}';
    }

    
    
    
}
