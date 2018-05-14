package korol.ivan.dao;

import korol.ivan.helper.JdbcHelper;
import korol.ivan.models.AdminModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class AdminUserDaoImpl implements AdminUserDao{
    //todo compleat methodth for work with db
    private static final String INSERT_TO_DATABASE_1 = "INSERT INTO Admin (name, pass) values (?, ?)";
    private static final String INSERT_TO_DATABASE_2 = "INSERT INTO Admin (name, pass, question, answer) values (?, ?, ?, ?)";
    private static final String FIND_BY_LOGIN_AND_PASSWORD = "select * from Admin where name = ? and pass = ?";
    private static final String DELETE_BY_ID = "DELETE FROM Admin WHERE id = ?";
    private static final String UPDATE_TO_DATABASE = "UPDATE Admin SET name = ?, pass = ?, question = ?, answer = ? WHERE id = ?";


    private static final String FIELD_ID = "id";
    private static final String FIELD_USERNAME = "name";
    private static final String FIELD_PASSWORD = "pass";

    @Override
    public boolean add(AdminModel adminModel) {
        try{
            PreparedStatement statement = null;
            if(adminModel.getQuestions() != null && adminModel.getAnswer() != null) {
                statement = JdbcHelper.getPreparedStatement(INSERT_TO_DATABASE_2);
                statement.setString(1, adminModel.getName());
                statement.setString(2, adminModel.getPass());
                statement.setString(3, adminModel.getQuestions());
                statement.setString(4, adminModel.getAnswer());
                return true;
            } else if (adminModel.getQuestions() == null && adminModel.getAnswer() == null){
                statement = JdbcHelper.getPreparedStatement(INSERT_TO_DATABASE_1);
                statement.setString(1, adminModel.getName());
                statement.setString(2, adminModel.getPass());
                return true;
            }

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        try {
            PreparedStatement statement = JdbcHelper.getPreparedStatement(DELETE_BY_ID);
            statement.setLong(1, id);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(AdminModel adminModel) {
        return delete(adminModel.getId());
    }

    @Override
    public boolean update(AdminModel adminModel) {
        try {
            PreparedStatement statement = JdbcHelper.getPreparedStatement(UPDATE_TO_DATABASE);
            statement.setString(1, adminModel.getName());
            statement.setString(2, adminModel.getPass());
            statement.setString(3, adminModel.getQuestions());
            statement.setString(4, adminModel.getAnswer());
            statement.setLong(5, adminModel.getId());
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public AdminModel findByUsernameAndPassword(String username, String password) {
        AdminModel adminModel = null;
        try {
            PreparedStatement statement = JdbcHelper.getPreparedStatement(FIND_BY_LOGIN_AND_PASSWORD);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                adminModel = new AdminModel();
                adminModel.setId(resultSet.getLong(FIELD_ID));
                adminModel.setName(resultSet.getString(FIELD_USERNAME));
                adminModel.setPass(resultSet.getString(FIELD_PASSWORD));
                return adminModel;
            }

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
