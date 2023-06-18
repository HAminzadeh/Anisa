import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("1111111111111111111");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Person person = ctx.getBean(Person.class);
        System.out.println(person.toString());

    }
}
