package model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Company extends Animal {

    /**
     * by type
     */
    @Autowired
    private Group group = new Group();

    /**
     * by name
     */
    @Resource(name = "person")
    private Person person;

    public void state() {
        System.out.println("规模：" + group.getPersonList().size());
        System.out.println("person: " + person.toString());
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
