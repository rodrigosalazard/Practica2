package Controlador;

import DAO.Registro;
import java.util.List;

/**
 *
 * @author 
 */
public class RegistroDaoHibernate extends AbstractDao {

    public RegistroDaoHibernate() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     *
     * @param usuario
     */
    public void save(Registro registro) throws DataAccessLayerException {
        super.save(registro);
    }

    /**
     * Updates a new Usuario into the database.
     *
     * @param usuario
     */
    public void update(Registro registro) throws DataAccessLayerException {
        super.update(registro);
    }

    /**
     * Delete a detached Usuario from the database.
     *
     * @param usuario
     */
    public void delete(Registro registro) throws DataAccessLayerException {
        super.delete(registro);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Registro find(Long id) throws DataAccessLayerException {
        return (Registro) super.find(Registro.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Registro.class);
    }
}
