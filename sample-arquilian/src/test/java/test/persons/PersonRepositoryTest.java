/*
 * Copyright 2003-2009 LCM-ANMC, Inc. All rights reserved.
 * This source code is the property of LCM-ANMC, Direction
 * Informatique and cannot be copied or distributed without
 * the formal permission of LCM-ANMC.
 */
package test.persons;

import java.util.Calendar;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.persistence.Cleanup;
import org.jboss.arquillian.persistence.CleanupStrategy;
import org.jboss.arquillian.persistence.CreateSchema;
import org.jboss.arquillian.persistence.TestExecutionPhase;
import org.jboss.arquillian.persistence.Transactional;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * TODO Document this class.
 * 
 * @author svanpe
 */
@RunWith(Arquillian.class)
@CreateSchema("scripts/ddl.sql")
@Cleanup(phase = TestExecutionPhase.AFTER, strategy = CleanupStrategy.STRICT)
@Transactional
public class PersonRepositoryTest {

    @EJB
    private PersonRepository beanToTest; 
    
    @PersistenceContext(unitName="sample")
    private EntityManager em; 

    @Deployment
    public static JavaArchive createTestArchive() {
        return ShrinkWrap.create(JavaArchive.class, "sample.jar") // Create jar
                .addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml")
                .addPackage(PersonEntity.class.getPackage());
    }
    
    @Test
    public void testCreatePerson() throws Exception {
        
        PersonEntity person = new PersonEntity();
        person.setName("Smith");
        person.setSurname("Jules");
        person.setBirthDate(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        person = beanToTest.savePerson(person);
        
        Assert.assertNotNull(person.getId());
    }
}
