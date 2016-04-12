/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import Controlador.RegistroDaoHibernate;
import Controlador.SesionDaoHibernate;
import DAO.Registro;
import DAO.Sesion;
import java.awt.event.ActionEvent;
import static java.util.Collections.list;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import javax.servlet.http.HttpServletRequest;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;



/**
 *
 * @author Rodrigo
 */
@ManagedBean
public class MBSesion {
    private String nombreusuario;
    private String correo;
    private String contraseña;
    private String msn;
    private final HttpServletRequest httpServletRequest;
    private final FacesContext faceContext;
    private FacesMessage faceMessage;
    
    public MBSesion(){
        faceContext = FacesContext.getCurrentInstance();
        httpServletRequest = (HttpServletRequest)faceContext.getExternalContext().getRequest();
    }
    
    public void inicioSesion(){
  Registro registro = new Registro();
  List<Registro> listRegistro;
  RegistroDaoHibernate regitroDao = new RegistroDaoHibernate();
  listRegistro= regitroDao.findAll();

  List<Sesion> listSesion;
  SesionDaoHibernate sesionDao = new SesionDaoHibernate();
  listSesion= sesionDao.findAll();
        for (Sesion sesion : listSesion) {
            if(sesion.getNombreusuario().equals(this.nombreusuario) && sesion.getPassword().equals(this.contraseña)){
                
                setMsn("Hola" + this.nombreusuario);
                break;
            }else{
                setMsn("Nombre de usuario o contraseña incorrecta");
                        }
        }
}
        
        
        
        //RequestContext context  = RequestContext.getCurrentInstance();
        //FacesMessage msg = null;
        //boolean loggedIn = false;
        //Sesion temp = new Sesion();
        //temp.setPassword(getContraseña());
        
        
        
//        SesionDaoHibernate sesionDao = new SesionDaoHibernate();
        //sesionDao.find();
        
        //if(correo != null  && correo.equals(getCorreo()) && contraseña != null && contraseña.equals(getContraseña()) ){
          //  httpServletRequest.getSession().setAttribute(temp.getNombreusuario(), nombreusuario);
//            faceMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Acceso Correcto",null);
  //          return "acceso";
            //loggedIn = true;
            //msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Bienvenido", correo);
    //    }else {
      //      faceMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Correo o Contraseña incorrecta", null);
//            faceContext.addMessage(null, faceMessage);
//            return "No acceso";
            //loggedIn = false;
            //msg = new FacesMessage(FacesMessage.SEVERITY_WARN,"Correo o contraseña incorrecta", "Error de autentificación");
            
  //      }
        
        //FacesContext.getCurrentInstance().addMessage(null, msg);
        
        
        //Sesion sesion = new Sesion();
        //SesionDaoHibernate sesionDao = new SesionDaoHibernate();
        
        
        
    
    
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
