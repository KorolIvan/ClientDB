package korol.ivan.dao;

import korol.ivan.model.Client;

import java.util.List;

/**
 * @author by Ivan Korol on 6/20/2017.
 */
public interface ClientsModelDao {

    boolean add(Client client);

    boolean delete(Client client);

    boolean delete(int id);

    List<Client> findAll();

    List<Client> findByFIO(String fio);

}
