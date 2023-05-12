package com.mx.proyecto.Repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mx.proyecto.entities.CatEstados;


@Repository
public class CatEstadosDAOImpl  implements CatEstadosDAO{

	

	@Autowired
	private SessionFactory sessionFactory;
		
	public CatEstadosDAOImpl(){//constructor vacio
	}
	public CatEstadosDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		}

			//consulta con Hibernate 
			@SuppressWarnings("unchecked")// quitar las lineas  de advertencia
			@Override
			@Transactional()// Es lo equivalente a un commit en oracle (confirmar los cambios) usarlos en delete, insert y update	
			public List<CatEstados> obtenerEstados() {
			final Session session=sessionFactory.getCurrentSession(); 
		    final Criteria criteria =session.createCriteria(CatEstados.class); //SELECT * FROM ESQUEMA.TABLA
		return (List<CatEstados>) criteria.list();
		
	}
			
			
			
			@Override
			@Transactional()// Es lo equivalente a un commit en oracle (confirmar los cambios) usarlos en delete, insert y update
			public Integer insertaEstado(CatEstados estadoAInsertar) {
			sessionFactory.getCurrentSession().save(estadoAInsertar);
				//save=guardado
				//saveOrUpdate(;)si no existe registro en la tabla se guarda(se actualiza)
				//sessionFactory.getCurrentSession().saveOrUpdate(datosAInsertar);
				return 1;
			}
			@Override
			@Transactional()// Es lo equivalente a un commit en oracle (confirmar los cambios) usarlos en delete, insert y update
			//ELIMINAR REGISTRO
			public Integer eliminaEstado(Long idEstado) {
			CatEstados ideEntity =new CatEstados();
			ideEntity.setIdEstado(idEstado);
			sessionFactory.getCurrentSession().delete(ideEntity);
				//  reglas para hivernete = session e identidad
				return 1;
			}
			
			@Override
			@Transactional()
			public Integer actualizaEstado(CatEstados estado) {
				sessionFactory.getCurrentSession().update(estado);
				return 1;
			}
	

	

}
