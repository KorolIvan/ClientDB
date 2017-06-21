package korol.ivan.dao;

import korol.ivan.model.Client;

import java.util.List;

/**
 * @author by Ivan Korol on 6/21/2017.
 */
public class ClientsModelDaoImpl implements ClientsModelDao {

    @Override
    public boolean add(Client client) {
        return false;
    }

    @Override
    public boolean delete(Client client) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public List<Client> findByFIO(String fio) {
        return null;
    }
}
