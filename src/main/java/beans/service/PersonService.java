package beans.service;

import java.util.List;

import beans.model.Person;


 
public interface PersonService {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
     
}
