package com.mx.proyecto.Repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mx.proyecto.entities.CatRoles;



@Repository 
public class CatRolesDAOImpl implements CatRolesDAO {

	
	
	
	@Autowired
	private SessionFactory sessionFactory;
		
	public CatRolesDAOImpl(){//constructor vacio
	}
	
		public CatRolesDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		}

		//consulta con Hibernate 
		@SuppressWarnings("unchecked")// quitar las lineas  de advertencia
		@Override
		@Transactional()// Es lo equivalente a un commit en oracle (confirmar los cambios) usarlos en delete, insert y update
		public List<CatRoles> obtenerRol() {
			final Session session=sessionFactory.getCurrentSession(); 
			final Criteria criteria =session.createCriteria(CatRoles.class); //SELECT * FROM ESQUEMA.TABLA
			return (List<CatRoles>) criteria.list();
	}

	@Override
	@Transactional()// Es lo equivalente a un commit en oracle (confirmar los cambios) usarlos en delete, insert y update
	public Integer insertaRol(CatRoles datosAInsertar) {
		sessionFactory.getCurrentSession().save(datosAInsertar);
		//save=guardado
		//saveOrUpdate(;)si no existe registro en la tabla se guarda(se actualiza)
		//sessionFactory.getCurrentSession().saveOrUpdate(datosAInsertar);
		return 1;
	}

	@Override
	@Transactional()// Es lo equivalente a un commit en oracle (confirmar los cambios) usarlos en delete, insert y update
	public Integer eliminarRol(Long idRol) {
		CatRoles ideEntity =new CatRoles();
		ideEntity.setIdRol(idRol);
		sessionFactory.getCurrentSession().delete(ideEntity);
		//  reglas para hivernete = session e identidad
		return 1;
	}

	@Override
	@Transactional()
	public Integer actualizarRol(CatRoles rol) {
		sessionFactory.getCurrentSession().update(rol);
		return 1;
	}

}
