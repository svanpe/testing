package test.persons;

import javax.ejb.Local;

/**
 * TODO Document this class.
 * 
 * @author 7518379 [YourFullNameHere]
 */
@Local
public interface PersonRepository {

    public abstract PersonEntity savePerson(PersonEntity entity);

    public abstract PersonEntity retrievePerson(Long id);

}