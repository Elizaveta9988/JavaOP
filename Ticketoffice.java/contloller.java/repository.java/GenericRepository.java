package Ticketoffice.java.contloller.java.repository.java;

public interface GenericRepository<T, ID>{

    void delete(ID id);

    void update(T item);

    void add(T item);

    T getById(ID id) throws Exception;

    List<T> getAll();
}
    

