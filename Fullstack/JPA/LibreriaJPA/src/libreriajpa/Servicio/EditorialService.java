/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.Servicio;

import java.util.Scanner;
import javax.persistence.EntityManager;
import libreriajpa.DAO.DAOEditorial;

/**
 *
 * @author Facundo
 */
public class EditorialService {
    Scanner leer = new Scanner(System.in);
    
    private DAOEditorial daoEditorial;

    public EditorialService(EntityManager entityManager) {
        this.daoEditorial = new DAOEditorial(entityManager);
    }
    
}
