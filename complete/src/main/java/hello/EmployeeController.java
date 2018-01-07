package hello;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Employee employee){
        repository.save(employee);
    }

    @RequestMapping(value="/{id}")
    public Employee read(@PathVariable String id){
        return repository.findOne(id);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        repository.delete(id);

    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void put(@RequestBody Employee employee) {
        repository.save(employee);

    }

    @RequestMapping("")
    public List<Employee> all(@RequestParam(value="lastname",required = false)Optional<String> lastname){
      if (!lastname.isPresent()){
          return repository.findAll();
      }else{
          return repository.findByLastName(lastname.get());
      }

    }
}

