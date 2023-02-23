/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.Services;

import java.util.List;
import pi.Entities.Categorie_oeuvre;

/**
 *
 * @author octanet
 * @param <Categorie_oeuvre>
 */
public interface IIService <Categorie_oeuvre> {
        public void add(Categorie_oeuvre cat );
         public List<Categorie_oeuvre> afficher();
        public Boolean modifier(Categorie_oeuvre cat);
           public Boolean supprimer(Categorie_oeuvre cat);

    
}
