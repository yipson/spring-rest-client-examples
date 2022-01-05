package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domine.User;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetUsers() throws Exception {
        List<User> users = apiService.getUsers(3);

        assertEquals(3, users.size());
    }

}