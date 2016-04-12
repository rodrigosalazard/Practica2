/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Controlador.RegistroDaoHibernate;
import DAO.Registro;
import javax.faces.bean.ManagedBean;


/**
 *
 * @author Rodrigo
 */
@ManagedBean

public class MBRegistro {
    private String nombre;
    private String correo;
    private String nombreusuario;
    private String contraseña;
    
    private String msn;
    /**
     * Creates a new instance of MBRegistro
     */
    
    public void guarda() {
        Registro tmp = new Registro();
        try {
            tmp.setNombre(getNombre());
            tmp.setCorreo(getCorreo());
            tmp.setNombreusuario(getNombreusuario());
            tmp.setPassword(getContraseña());
            
            RegistroDaoHibernate registroDAO = new RegistroDaoHibernate();
            registroDAO.save(tmp);
            
            setMsn("El usuario se guardo exitosamente");
        } catch (Exception e) {

            System.out.println(" upss! Ocurrio un error.  " + e);
        }
    }

    public MBRegistro() {
        
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the nombreusuario
     */
    public String getNombreusuario() {
        return nombreusuario;
    }

    /**
     * @param nombreusuario the nombreusuario to set
     */
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the msn
     */
    public String getMsn() {
        return msn;
    }

    /**
     * @param msn the msn to set
     */
    public void setMsn(String msn) {
        this.msn = msn;
    }
    
}
