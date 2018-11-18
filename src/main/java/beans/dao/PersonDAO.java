package beans.dao;

import java.util.List;

import beans.model.Person;

 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
}
