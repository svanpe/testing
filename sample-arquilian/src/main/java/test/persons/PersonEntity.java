
package test.persons;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * Person Entity.
 * 
 * @author svanpe
 */
@Entity
@Table(name = "PERSON")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSON_SEQ")
    @SequenceGenerator(name = "PERSON_SEQ", sequenceName = "PERSON_SEQ", initialValue = 500, allocationSize = 500)
    @Column(name = "PERSON_ID")
    Long id;
    
    @Column(name = "NAME")
    String name;
    
    @Column(name = "SURNAME")
    String surname;
    
    @Column(name = "BIRTHDATE")
    Date birthDate;
    
    /**
     * @return the id
     */
    public Long getId() {
        return this.id;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the surname
     */
    public String getSurname() {
        return this.surname;
    }
    
    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return this.birthDate;
    }
    
    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
