import model.Animal;
import model.Company;
import model.Group;
import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springmvc01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person.toString());

        person.eat();
        person.walk();
        person.talk();

        Group group = context.getBean(Group.class);
        System.out.println(group);
        System.out.println("Group对象AOP代理后的实际类型：" + group.getClass());
        System.out.println("Group对象AOP代理后的实际类型是否是Group子类：" + (group instanceof Group));

        Company company = context.getBean(Company.class);
        company.setPerson(person);
        company.state();

    }
}
