package Ticketoffice.java.contloller.java.hibernate.java;

public class JavaHibernateTicketRepositoryImpl extends HibernateBaseRepository<Ticket> implements TicketRepository  {
    public JavaHibernateTicketRepositoryImpl(SessionFactory sessionFactory) {
        super.sessionFactory = sessionFactory;
    }

    @Override
    public void delete(Long id) {
        Session session = null;
        Transaction tx = null;
        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            Ticket ticket = session.get(Ticket.class, id);
            session.delete(ticket);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void update(Ticket item) {
        super.update(item);
    }

    @Override
    public void add(Ticket item) {
        super.add(item);
    }

    @Override
    public Ticket getById(Long id) throws Exception {
        Session session = null;
        Ticket ticket = null;
        try {
            session = sessionFactory.openSession();
            ticket = session.get(Ticket.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return ticket;
    }

    @Override
    public List<Ticket> getAll() {
        Session session = null;
        List<Ticket> tickets = new ArrayList<>();
        try {
            session = sessionFactory.openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Ticket> criteria = builder.createQuery(Ticket.class);
            criteria.from(Ticket.class);
            tickets = session.createQuery(criteria).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return tickets;
    }
}  

