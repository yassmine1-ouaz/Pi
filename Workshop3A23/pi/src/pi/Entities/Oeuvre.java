/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.Entities;

import javafx.scene.control.TableColumn;

/**
 *
 * @author octanet
 */
public class Oeuvre {
  private int Id ,Id_cat_oeuv , archive ;
  private String titre_oeuvre ,artiste ,  prix_oeuvre ;
  public Etat Etat;
    public Oeuvre() {
    }
    
    // CONSTRUCTEUR

    public Oeuvre( String titre_oeuvre, String artiste, String prix_oeuvre,int Id_cat_oeuv, Etat Etat ) {
        
        this.titre_oeuvre = titre_oeuvre;
        this.artiste = artiste;
        //this.famille = famille;
        this.prix_oeuvre = prix_oeuvre;
        this.Id_cat_oeuv = Id_cat_oeuv;
        this.Etat = Etat;
        //this.archive = archive;
        //  this.stock = stock;
    } 

    public Oeuvre(int Id) {
        this.Id = Id;
    }

      
    public int getId_cat_oeuv() {
        return Id_cat_oeuv;
    }

    public void setId_cat_oeuv(int Id_cat_oeuv) {
        this.Id_cat_oeuv = Id_cat_oeuv;
    }

    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitre_oeuvre() {
        return titre_oeuvre;
    }

    public void setTitre_oeuvre(String titre_oeuvre) {
        this.titre_oeuvre = titre_oeuvre;
    }

    public String getPrix_oeuvre() {
        return prix_oeuvre;
    }

    public void setPrix_oeuvre(String prix_oeuvre) {
        this.prix_oeuvre = prix_oeuvre;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

   /* public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }*/

    public Etat getEtat() {
        return Etat;
    }

    public void setEtat(Etat Etat) {
        this.Etat = Etat;
    }

    public int getArchive() {
        return archive;
    }

    public void setArchive(int archive) {
        this.archive = archive;
    }
    

    @Override
    public String toString() {
        return "Oeuvre{" + "Id=" + Id + ", titre_oeuvre=" + titre_oeuvre + ", artiste=" + artiste + ", prix_oeuvre=" + prix_oeuvre + ", Id_cat_oeuv=" + Id_cat_oeuv +", Etat=" + Etat + '}';
    }

    

    
}
