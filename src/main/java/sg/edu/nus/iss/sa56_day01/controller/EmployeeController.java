package sg.edu.nus.iss.sa56_day01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.sa56_day01.model.Employee;
import sg.edu.nus.iss.sa56_day01.service.EmployeeService;

// RequestMapping
// GetMapping (Retrieve list/single objects)
// PostMapping (Create new object)
// PutMapping (Update an existing object)
// DeleteMapping (Delete a object from a list/db)

@Controller
@RequestMapping (path="/employees")
public class EmployeeController {
    
    @Autowired
    EmployeeService empSvc;

    // public EmployeeControler()
    // {
    //     empSvc = new EmployeeService();
    // }

    @GetMapping(value="/List")
    // @GetMapping()
    public @ResponseBody List<Employee> getAllEmployees() {
        return empSvc.getAllEmployees();
     }

     @GetMapping(value="/filteredlist")
     public @ResponseBody List<Employee> getEmployeesByLastName() {
        return empSvc.getEmployeesByLastName("Tan");
     }
}
