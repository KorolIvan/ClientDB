package korol.ivan.dao;

import korol.ivan.models.AdminModel;

import java.sql.PreparedStatement;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class AdminUserDaoImpl implements AdminUserDao{
    //todo compleat methodth for work with db
    private static final String INSERT_TO_DATABASE = "INSERT INTO admins (username, password) value (?, ?)";

    @Override
    public boolean add(AdminModel adminModel) {
//        int id = 0;
//        try {
//            //PreparedStatement preparedStatement =
//        }catch (){
//
//        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean delete(AdminModel adminModel) {
        return false;
    }

    @Override
    public boolean update(AdminModel adminModel) {
        return false;
    }

    @Override
    public AdminModel findByUsernameAndPassword(String username, String password) {
        return null;
    }
}
