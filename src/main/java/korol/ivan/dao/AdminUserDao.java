package korol.ivan.dao;

import korol.ivan.models.AdminModel;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public interface AdminUserDao {

    boolean add (AdminModel adminModel);

    boolean delete(Long id);

    boolean delete(AdminModel adminModel);

    boolean update(AdminModel adminModel);

    AdminModel findByUsernameAndPassword(String username, String password);

}
