package com.juanfedevmaster;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.juanfedevmaster.model.Course;
import com.juanfedevmaster.model.Student;

public class HibernateUtil {
    private static final String CONNECTION_STRING = "jdbc:postgresql://localhost:5432/example-universitydb-v2?user=postgres&password=admin";

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        Configuration config = new Configuration();

        config.setProperty("hibernate.connection.url", CONNECTION_STRING);
        config.setProperty("hibernate.hbm2ddl.auto", "create-drop");
        config.setProperty("hibernate.show_sql", "true");
        config.setProperty("hibernate.format_sql", "true");

        config.addAnnotatedClass(Student.class);
        config.addAnnotatedClass(Course.class);

        return config.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
