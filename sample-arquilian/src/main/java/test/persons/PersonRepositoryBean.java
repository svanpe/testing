/*
 * Copyright 2003-2009 LCM-ANMC, Inc. All rights reserved.
 * This source code is the property of LCM-ANMC, Direction
 * Informatique and cannot be copied or distributed without
 * the formal permission of LCM-ANMC.
 */
package test.persons;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * TODO Document this class.
 * 
 * @author 7518379 [YourFullNameHere]
 */

@Stateless
public class PersonRepositoryBean implements PersonRepository {

    @PersistenceContext(unitName = "sample")
    private EntityManager em;
    
    /**
     * {@inheritDoc}
     */
    @Override
    public PersonEntity savePerson(PersonEntity entity){
        
        if(entity.getId()==null){
            em.persist(entity);
            return entity;
        }
        
        return em.merge(entity);
        
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public PersonEntity retrievePerson(Long id){
        return em.find(PersonEntity.class, id);
    }
}
