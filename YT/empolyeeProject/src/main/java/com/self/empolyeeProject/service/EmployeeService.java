package com.self.empolyeeProject.service;

import com.self.empolyeeProject.dto.EmployeeDTO;
import com.self.empolyeeProject.entity.Employee;
import com.self.empolyeeProject.repo.EmployeeRepo;
import com.self.empolyeeProject.util.VarList;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
