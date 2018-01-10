/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdb;

import fr.el_fartouni.database.utils.DatabaseTools;
import fr.el_fartouni.swingDB.frame.LoginFrame;

/**
 *
 * @author DAMAR ALI El-Fartouni
 */
public class SwingDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Création d'une instance de la fenetre de login
        LoginFrame app = new LoginFrame();
        
        //Affichage de la fenetre
        app.setVisible(true);
        //Centrage de la fenetre sur l'écran
        app.setLocationRelativeTo(null);
        
    }
    
}
