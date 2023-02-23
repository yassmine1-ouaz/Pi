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
import pi.Entities.Categorie_oeuvre;
import pi.Utils.MyDB;
/**
 *
 * @author octanet
 */
public class ServiceCatOeuv implements IIService<Categorie_oeuvre> {

    
    
Connection cnx;
    Statement stm;

    public ServiceCatOeuv() {
        cnx = MyDB.getInstance().getCnx();

    }

    @Override
    public void add(Categorie_oeuvre cat) {
          try {
            String qry = "INSERT INTO `categorie_oeuvre`( `Nom_cat_oeuv`, `description_cat_oeuv`) VALUES ('" + cat.getNom_cat_oeuv() + "','" + cat.getDescription_cat_oeuv() + "')";
            stm = cnx.createStatement();
            System.out.println(" Category added Successfully !");
            stm.executeUpdate(qry);
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }}

    @Override
    public List<Categorie_oeuvre> afficher() {
       List<Categorie_oeuvre> categories = new ArrayList();
        try {
            String qry = "SELECT * FROM `Categorie_oeuvre`";
            stm = cnx.createStatement();

            ResultSet rs = stm.executeQuery(qry);

            while (rs.next()) {
                Categorie_oeuvre cat = new Categorie_oeuvre();
                cat.setId_cat_oeuv(rs.getInt("Id_cat_oeuv"));
                cat.setNom_cat_oeuv(rs.getString("Nom_cat_oeuv"));
                cat.setDescription_cat_oeuv(rs.getString("description_cat_oeuv"));
                
                //p.setStock(rs.getString("5"));

                categories.add(cat);
            }
            return categories;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return categories;
  
    }

    @Override
    public Boolean modifier(Categorie_oeuvre cat) {

     try {
         String qry = "UPDATE Categorie_oeuvre SET `Id_cat_oeuv`='" + cat.getId_cat_oeuv() + "' , `Nom_cat_oeuv`='" + cat.getNom_cat_oeuv() + "' , `Description_cat_oeuv`='" + cat.getDescription_cat_oeuv() + "' WHERE `Id_cat_oeuv`='" + cat.getId_cat_oeuv() + "'";
  
            stm = cnx.createStatement();
            System.out.println(" Category updated Successfully !");
            stm.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
         return false;
    }

    @Override
    public Boolean supprimer(Categorie_oeuvre cat) {
         try {
        String qry = "DELETE FROM oeuvre WHERE `Id_cat_oeuv`='" + cat.getId_cat_oeuv()+ "'";
        stm = cnx.createStatement();
        System.out.println("Category deleted Successfully !");
        stm.executeUpdate(qry);
        return true;
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        return false;
    }
    }
}
