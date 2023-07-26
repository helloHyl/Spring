package network.hylnetwork;

import network.hylnetwork.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
//          传统的开发方式，手动创建对象
        Student student = new Student();
        System.out.println(student);

//          IOC容器自动创建对象，开发者只需要取出对象即可
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student1 = (Student) applicationContext.getBean("student");
        System.out.println(student1);

    }
}
