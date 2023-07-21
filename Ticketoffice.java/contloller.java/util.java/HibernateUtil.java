package Ticketoffice.java.contloller.java.util.java;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {

        if (sessionFactory != null) {
            return sessionFactory;
        } else {
            try {
                Configuration configuration = new Configuration().configure("/hibernate/hibernate.cfg.xml");
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                configuration.addAnnotatedClass(Aircraft.class);
                configuration.addAnnotatedClass(AircraftSeatAmount.class);
                configuration.addAnnotatedClass(City.class);
                configuration.addAnnotatedClass(Route.class);
                configuration.addAnnotatedClass(Passenger.class);
                configuration.addAnnotatedClass(Flight.class);
                configuration.addAnnotatedClass(Ticket.class);
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Throwable ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
            return sessionFactory;
        }
    }
}

