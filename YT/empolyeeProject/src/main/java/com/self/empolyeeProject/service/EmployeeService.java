package com.self.empolyeeProject.service;

import com.self.empolyeeProject.dto.EmployeeDTO;
import com.self.empolyeeProject.entity.Employee;
import com.self.empolyeeProject.repo.EmployeeRepo;
import com.self.empolyeeProject.util.VarList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;


    public String saveEmployee(EmployeeDTO employeeDTO) {

        if (employeeRepo.existsById(employeeDTO.getEmpID())) {
            return VarList.RSP_DUPLICATED;
        } else {
            employeeRepo.save(modelMapper.map(employeeDTO, Employee.class));
            return VarList.RSP_SUCCESS;
        }
    }

    public String updateEmployee(EmployeeDTO employeeDTO) {

        if (employeeRepo.existsById(employeeDTO.getEmpID())) {
            employeeRepo.save(modelMapper.map(employeeDTO, Employee.class));
            return VarList.RSP_SUCCESS;
        }else {
            return VarList.RSP_NO_DATA_FOUND;
        }
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepo.findAll();
        return modelMapper.map(employees, new TypeToken<ArrayList<EmployeeDTO>>() {}.getType());
    }

}
