package model;

import java.util.ArrayList;
import java.util.List;

public class Group {

    List<Person> personList = new ArrayList<>();

    public void groupList() {
        System.out.println(personList.toString());
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
