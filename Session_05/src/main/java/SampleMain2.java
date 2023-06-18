import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("111111111111111111");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Person person = ctx.getBean(Person.class);
        System.out.println(person.toString());
    }
}
