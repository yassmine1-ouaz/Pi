/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.Services;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import pi.Entities.Oeuvre;
import pi.Utils.MyDB;
import pi.Entities.Etat;

/**
 *
 * @author Mohamed
 */
public class ServiceOeuvre implements IService<Oeuvre> {
    
    
Connection cnx;
    Statement stm;

    public ServiceOeuvre() {
        cnx = MyDB.getInstance().getCnx();

    }

    @Override
    public void add(Oeuvre o) {
        try {
            String qry = "INSERT INTO `oeuvre`( `titre_oeuvre`, `artiste`, `prix_oeuvre`,`Id_cat_oeuv`,`Etat`,`archive`) VALUES ('" + o.getTitre_oeuvre() + "','" + o.getArtiste() +  "','" + o.getPrix_oeuvre() + "','" + o.getId_cat_oeuv() +"','" + o.getEtat() + "','" + 0 + "')";
            stm = cnx.createStatement();
            System.out.println("Oeuvre added Successfully !");
            stm.executeUpdate(qry);
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }

    }
    
    
    @Override
    public List<Oeuvre> afficher() {
        
        List<Oeuvre> oeuvres = new ArrayList();
      
        try {
            String qry = "SELECT * FROM `oeuvre` WHERE archive=0";
             stm = cnx.createStatement();

            ResultSet rs = stm.executeQuery(qry);
          
            while (rs.next()) {
                Oeuvre o = new Oeuvre();
                o.setId(rs.getInt("id"));
                o.setTitre_oeuvre(rs.getString("titre_oeuvre"));
                o.setArtiste(rs.getString("artiste"));
                //o.setFamille(rs.getString("famille")); aappartient a quelle type d'oeuvre
                o.setPrix_oeuvre(rs.getString("Prix_oeuvre"));
                o.setId_cat_oeuv(rs.getInt("Id_cat_oeuv"));
                o.setEtat(Etat.valueOf(rs.getString("Etat")));
                //p.setStock(rs.getString("5"));

                oeuvres.add(o);
            }
            return oeuvres;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return oeuvres;

    }

    
    
    
    

    /*@Override
    public ObservableList<Oeuvre> afficher() {
      
       // List<Oeuvre> oeuvres = new ArrayList();
       ObservableList<Oeuvre> list = FXCollections.observableArrayList();
        try {
           // String qry = "SELECT * FROM `oeuvre` WHERE archive=0";
             //stm = cnx.createStatement();

           // ResultSet rs = stm.executeQuery(qry);
           PreparedStatement ps = (PreparedStatement) cnx.prepareStatement("SELECT * FROM `oeuvre` WHERE archive=0");
          ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Oeuvre o = new Oeuvre();
                o.setId(rs.getInt("id"));
                o.setTitre_oeuvre(rs.getString("titre_oeuvre"));
                o.setArtiste(rs.getString("artiste"));
                //o.setFamille(rs.getString("famille")); aappartient a quelle type d'oeuvre
                o.setPrix_oeuvre(rs.getString("Prix_oeuvre"));
                o.setId_cat_oeuv(rs.getInt("Id_cat_oeuv"));
                o.setEtat(Etat.valueOf(rs.getString("Etat")));
                //p.setStock(rs.getString("5"));
 
                list.add(o);
            }
            return list;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;

    }*/

    @Override
    public Boolean modifier(Oeuvre o) {
         try {
           
            //String qry = "UPDATE oeuvre SET nom_oeuvre ='rr', prix_oeuvre ='rr', stock ='oui' WHERE id ='30' ";
            //String qry = "UPDATE oeuvre SET id`='" + t.getId() + "',nom_oeuvre`='" + t.getNom_oeuvre() + "' ,`prix_oeuvre`='" + t.getPrix_oeuvre() + "' ,`stock`='" + t.getStock() + "' WHERE `id`='" + t.getId() + "'";
    
            String qry = "UPDATE oeuvre SET `id`='" + o.getId() + "', `titre_oeuvre`='" + o.getTitre_oeuvre() +"' , `artiste`='" + o.getArtiste() +"' , `prix_oeuvre`='" + o.getPrix_oeuvre() + "' , `Id_cat_oeuv`='" + o.getId_cat_oeuv() +"', `Etat`='" + o.getEtat()+  "' WHERE `id`='" + o.getId() + "'";
  
            stm = cnx.createStatement();
            System.out.println(" Oeuvre updated Successfully !");
            stm.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
         return false;
    }

    @Override
    public Boolean supprimer(Oeuvre o) {
          try {
        //String qry = "DELETE FROM oeuvre WHERE `id`='" + o.getId()+ "'";
        String qry = "UPDATE oeuvre SET archive= 1 WHERE `id`='" + o.getId()+ "'";
        
        stm = cnx.createStatement();
        //System.out.println("Oeuvre deleted Successfully !");
        stm.executeUpdate(qry);
        return true;
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        return false;
    }
       
    }


}
