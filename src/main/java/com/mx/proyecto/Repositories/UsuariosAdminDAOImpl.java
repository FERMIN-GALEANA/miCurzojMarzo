package com.mx.proyecto.Repositories;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mx.proyecto.entities.UsuariosAdmin;



@Repository 
public class UsuariosAdminDAOImpl implements UsuariosAdminDAO {

	@Autowired
	private SessionFactory sessionFactory;
		
	public UsuariosAdminDAOImpl(){//constructor vacio
	}
	
		public UsuariosAdminDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		}

		
		//consulta con Hibernate 
		@SuppressWarnings("unchecked")// quitar las lineas  de advertencia
		@Override
		@Transactional()// Es lo equivalente a un commit en oracle (confirmar los cambios) usarlos en delete, insert y update
		public List<UsuariosAdmin> obtenerUsuario() {
			final Session session=sessionFactory.getCurrentSession(); 
			final Criteria criteria =session.createCriteria(UsuariosAdmin.class); //SELECT * FROM ESQUEMA.TABLA
			return (List<UsuariosAdmin>) criteria.list();
		}
		
		@Override   
		@Transactional()// Es lo equivalente a un commit en oracle (confirmar los cambios) usarlos en delete, insert y update
		public Integer insertaUsuario(UsuariosAdmin datosAInsertar) {	
		sessionFactory.getCurrentSession().save(datosAInsertar);
			//save=guardado
			//saveOrUpdate(;)si no existe registro en la tabla se guarda(se actualiza)
			//sessionFactory.getCurrentSession().saveOrUpdate(datosAInsertar);
			return 1;
		}

		@Override
		@Transactional()// Es lo equivalente a un commit en oracle (confirmar los cambios) usarlos en delete, insert y update
		//ELIMINAR REGISTRO
		public Integer eliminarRegistro(Long idUser) {
	    UsuariosAdmin ideEntity =new UsuariosAdmin();
		ideEntity.setIdUser(idUser);
		sessionFactory.getCurrentSession().delete(ideEntity);
		//  reglas para hivernete = session e identidad
		return 1;
		}

		
		@Override
		@Transactional()
		public Integer actualizarUsuario(UsuariosAdmin datos) {
			sessionFactory.getCurrentSession().update(datos);
			return 1;
		}
	
	
	
	/**IMPORTANTE
	 *  PARA LAS CONSULTAS EN HIBERNATA IMPORTANTE 2 COSAS
	 * 1: LA SESSION ACTUAL -->final Session session=sessionFactory.getCurrentSession(); 
	 * 2: usar  la entity(Entidad--> (es la tabla de DB)->			final Criteria criteria =session.createCriteria(UsuariosAdmin.class);

	 */
	
}
