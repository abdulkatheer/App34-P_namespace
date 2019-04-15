package org.katheer.test;

import org.katheer.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        p-namespace is used to reduce the no of property tags in App Context, thus
            it reduces the amount of XML code.
        We can use both p-namespace and property tag for different variables, but
            we can't use it for the same variable. If we do, we'll get a parsing exception.
        To use p-namespace, xmlns:p="http://www.springframework.org/schema/p", this should
            be added to the XSD.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org/katheer/resource/applicationContext.xml");

        Employee emp1 = (Employee) context.getBean("emp1");
        emp1.showEmployeeDetails();

        Employee emp2 = (Employee) context.getBean("emp2");
        emp2.showEmployeeDetails();
    }
}
