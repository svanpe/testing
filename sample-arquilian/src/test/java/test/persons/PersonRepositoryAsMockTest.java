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
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.jboss.shrinkwrap.resolver.api.maven.MavenResolverSystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;


/**
 * TODO Document this class.
 * 
 * @author svanpe
 */
@RunWith(Arquillian.class)
@CreateSchema("scripts/ddl.sql")
@Cleanup(phase = TestExecutionPhase.AFTER, strategy = CleanupStrategy.STRICT)
@Transactional
public class PersonRepositoryAsMockTest {

    @EJB
    private PersonRepository beanToTest; 
    
    @PersistenceContext(unitName="sample")
    private EntityManager em; 

    @Before
    public void setupMock() {
        PersonEntity entity = new PersonEntity();
        entity.setId(new Long(300L));
        beanToTest = Mockito.mock(PersonRepository.class);//real bean replaced by mocked one
        Mockito.when(beanToTest.savePerson((PersonEntity)Mockito.anyObject())).thenReturn(entity);
    }
    
    @Deployment
    public static WebArchive  createTestArchive() {
        
        MavenResolverSystem resolver = Maven.resolver();
        WebArchive  war = ShrinkWrap.create(WebArchive.class, "sample.war") // Create jar
                .addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml")
                .addPackage(PersonEntity.class.getPackage());
        
        war.addAsLibraries(resolver.loadPomFromFile("pom.xml").resolve("org.mockito:mockito-all:1.10.19").withTransitivity().asSingleFile());
        return war;
    }
    
    @Test
    public void testCreatePerson() throws Exception {
        
        PersonEntity person = new PersonEntity();
        person.setName("Smith");
        person.setSurname("Jules");
        person.setBirthDate(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        person = beanToTest.savePerson(person);
        
        Assert.assertEquals(300L, (long) person.getId()); 
    }
}
