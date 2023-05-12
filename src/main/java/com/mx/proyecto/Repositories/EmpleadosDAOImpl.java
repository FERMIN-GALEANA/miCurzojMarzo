package com.mx.proyecto.Repositories;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mx.proyecto.entities.Empleados;


@SuppressWarnings("serial")
@Repository
public class EmpleadosDAOImpl extends GenericDAO<Empleados, Long> implements EmpleadosDAO {
	/**
	//4.- Servicio para consultar todos los usuarios de sexo Masculino
	@Override
	@Transactional
	public Empleados obtenerEmpleado(String sexo) {
		System.out.println("impl prueba"+sexo);
		final Session session = sessionFactory.getCurrentSession();
		final Criteria criteria = session.createCriteria(Empleados.class);// sonsulta con hibernate -> select * from EMPLEADOS
		
		criteria.add(Restrictions.eq("curp prueba",sexo));// -> WHERE curp = 'CURP'  condicion
		System.out.println(" n "+ criteria+"....");
		return (Empleados) criteria.uniqueResult();//retorno de las consulta y condicion+++	}
	}**/
	//5
	/**@Override
	@Transactional
	public Empleados obtenerEmpleadoFemeninoEdad(String sexo, int edad) {
		System.out.println("impl prueba"+sexo);
		final Session session = sessionFactory.getCurrentSession();
		final Criteria criteria = session.createCriteria(Empleados.class);// sonsulta con hibernate -> select * from EMPLEADOS
		
		criteria.add(Restrictions.eq("curp prueba",sexo));// -> WHERE curp = 'CURP'  condicion
		System.out.println(" n "+ criteria+"....");
		return (Empleados) criteria.uniqueResult();//retorno de las consulta y condicion+++	}

		
	}
**/
	@Override
	@Transactional
	public Empleados buscarPorCur(String curp) {
		System.out.println("curp"+curp);
		final Session session = sessionFactory.getCurrentSession();
		final Criteria criteria = session.createCriteria(Empleados.class);// sonsulta con hibernate -> select * from EMPLEADOS
		
		criteria.add(Restrictions.eq("curp",curp));// -> WHERE curp = 'CURP'  condicion
		System.out.println(" porbando DAOImpl "+ criteria+"....");
		return (Empleados) criteria.uniqueResult();//retorno de las consulta y condicion+++	}
		
}
	



	@Override
	@Transactional
	public Empleados buacarId(long idEmpleado) {
		System.out.println("# 69 idEmpleado buscar por id"+idEmpleado);
		final Session session = sessionFactory.getCurrentSession();
		final Criteria criteria = session.createCriteria(Empleados.class);// sonsulta con hibernate -> select * from EMPLEADOS
		
		criteria.add(Restrictions.eq("idEmpleado",idEmpleado));// -> WHERE curp = 'CURP'  condicion
		System.out.println("  daoImplement"+ criteria+"....");
		return (Empleados) criteria.uniqueResult();//retorno de las consulta y condicion+++	}

	}




	@Override
	public Empleados eliminarEmpleadoNoActivo(Empleados activo) {
		// TODO Auto-generated method stub
		return null;
	}

	


	
}
