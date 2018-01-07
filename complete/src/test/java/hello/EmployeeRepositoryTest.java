package hello;
import static org.assertj.core.api.Assertions.*;

import java.util.Date;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {
    @Autowired
    EmployeeRepository repository;
    Employee david,jason,ayesha;

    @Before
    public void setUp(){
        repository.deleteAll();
        david=repository.save(new Employee("david","smith","g","david@gmail.com","7035551212","indirect",new Date(),
                "oak st","1234","leesburg","va","20176",true));
        jason=repository.save(new Employee("jason","jones","g","jason@gmail.com","7035551212","indirect",new Date(),
                "birch st","1234","fairfax","va","20176",true));
        ayesha=repository.save(new Employee("ayesha","khan","g","ayesha@gmail.com","7035551212","indirect",new Date(),
                "weepingwillow st","1234","reston","va","20176",true));
        ayesha=repository.save(new Employee("ayesha","khan","g","ayesha@gmail.com","7035551212","indirect",new Date(),
                "weepingwillow st","1234","reston","va","20176",true));


    }
    @Test
    public void findBylastName(){
        List<Employee> result=repository.findByLastName("smith");
        assertThat(result).hasSize(1).extracting("firstName").contains("david");


    }

}
