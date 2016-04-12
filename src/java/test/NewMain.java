/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Controlador.RegistroDaoHibernate;
import Controlador.SesionDaoHibernate;
import DAO.Registro;
import DAO.Sesion;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        RegistroDaoHibernate registroDao = new RegistroDaoHibernate();
        SesionDaoHibernate sesionDao = new SesionDaoHibernate();
        
        Registro registro = new Registro();
        Sesion sesion = new Sesion();
        
        registro.setCorreo("salazar4@gmail.com");
        registro.setNombre("rodrigo4");
        registro.setNombreusuario("rodrigo9876");
        registro.setPassword("9876");
        registroDao.save(registro);
        
        System.out.println("Todo salio bien con el insert");
        
        sesion.setNombreusuario("rodrigo4");
        sesion.setPassword("9876444");
        sesion.setRegistro(registro);
        sesionDao.save(sesion);
        
        System.out.println("Todo salio bien con el segundo insert");
        /**    SesionDaoHibernate sesionDAO = new SesionDaoHibernate();
        Sesion sesion = new Sesion();
        sesion.setNombreusuario("pacoperez");
        sesion.setPassword("1234");
        sesionDAO.save(sesion);
        System.out.println("Todo salio bien en el insert");
        **/
        
        /**RegistroDaoHibernate RegistroDAO = new RegistroDaoHibernate();
        List<Registro> lista = RegistroDAO.findAll();
        for (Registro user : lista) {
            System.out.println(user.toString());
            System.out.println("Todo salio bien en el insert");
        }
        * */
        
    }
    
}
