package korol.ivan.dao;

import korol.ivan.helper.JdbcHelper;
import korol.ivan.models.AdminModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * @author Ivan Korol on 5/11/2018
 */
public class AdminUserDaoImplTest {
    protected AdminUserDaoImpl adminUserDao;
    protected AdminModel adminModel;
    protected AdminModel fullAdminModel;
    protected AdminModel updateAdminModel;
    @Before
    public void setUp() throws Exception {
        adminModel = new AdminModel("teat_1", "test");
        fullAdminModel = new AdminModel("test", "test", "questions", "answer");
        updateAdminModel = new AdminModel((long) 1, "test_update", "pass_update", "question_update", "answer_update");
        adminUserDao = new AdminUserDaoImpl();
        JdbcHelper.getConnection();
    }

    @After
    public void tearDown() throws Exception {
        JdbcHelper.closeConnection();
    }

    @Test
    public void addNameAndPass() {
        assertTrue(adminUserDao.add(adminModel));
    }

    @Test
    public void addFullAdminModel() {
        assertTrue(adminUserDao.add(fullAdminModel));
    }

    @Test
    public void delete() {
        assertTrue(adminUserDao.delete((long) 1));
    }

    @Test
    public void update() {
        assertTrue(adminUserDao.update(updateAdminModel));
    }

    @Test
    public void findByUsernameAndPassword() {
        assertNotNull(adminUserDao.findByUsernameAndPassword("test1", "test"));
    }
}