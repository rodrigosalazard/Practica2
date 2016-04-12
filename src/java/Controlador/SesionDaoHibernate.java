package Controlador;

import DAO.Sesion;
import java.util.List;

/**
 *
 * @author 
 */
public class SesionDaoHibernate extends AbstractDao {

    public SesionDaoHibernate() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     *
     * @param usuario
     */
    public void save(Sesion sesion) throws DataAccessLayerException {
        super.save(sesion);
    }

    /**
     * Updates a new Usuario into the database.
     *
     * @param usuario
     */
    public void update(Sesion sesion) throws DataAccessLayerException {
        super.update(sesion);
    }

    /**
     * Delete a detached Usuario from the database.
     *
     * @param usuario
     */
    public void delete(Sesion sesion) throws DataAccessLayerException {
        super.delete(sesion);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Sesion find(Long id) throws DataAccessLayerException {
        return (Sesion) super.find(Sesion.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Sesion.class);
    }
}
