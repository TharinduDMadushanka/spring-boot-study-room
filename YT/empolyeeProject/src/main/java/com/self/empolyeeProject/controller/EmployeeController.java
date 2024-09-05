package com.self.empolyeeProject.controller;

import com.self.empolyeeProject.dto.EmployeeDTO;
import com.self.empolyeeProject.dto.ResponseDTO;
import com.self.empolyeeProject.entity.Employee;
import com.self.empolyeeProject.service.EmployeeService;
import com.self.empolyeeProject.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/emp")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ResponseDTO responseDTO;

    @PostMapping("/saveEmp")
    public ResponseEntity saveEmployee(@RequestBody EmployeeDTO employeeDTO) {

        try {

            String resp = employeeService.saveEmployee(employeeDTO);
            if (resp.equals("00")) {
                responseDTO.setCode(VarList.RSP_SUCCESS);
                responseDTO.setMessage("Success");
                responseDTO.setContent(employeeDTO);

                return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

            } else if (resp.equals("06")) {

                responseDTO.setCode(VarList.RSP_DUPLICATED);
                responseDTO.setMessage("Employee Registered");
                responseDTO.setContent(employeeDTO);

                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            } else {

                responseDTO.setCode(VarList.RSP_FAIL);
                responseDTO.setMessage("Error");
                responseDTO.setContent(null);

                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            }

        } catch (Exception e) {

            responseDTO.setCode(VarList.RSP_FAIL);
            responseDTO.setMessage(e.getMessage());
            responseDTO.setContent(null);

            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    @PutMapping("/updateEmp")
    public ResponseEntity updateEmployee(@RequestBody EmployeeDTO employeeDTO) {

        try {

            String resp = employeeService.updateEmployee(employeeDTO);
            if (resp.equals("00")) {
                responseDTO.setCode(VarList.RSP_SUCCESS);
                responseDTO.setMessage("Success");
                responseDTO.setContent(employeeDTO);

                return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

            }else if (resp.equals("01")){

                responseDTO.setCode(VarList.RSP_NO_DATA_FOUND);
                responseDTO.setMessage("Not a registered employee");
                responseDTO.setContent(employeeDTO);

                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            }else {

                responseDTO.setCode(VarList.RSP_FAIL);
                responseDTO.setMessage("Error");
                responseDTO.setContent(null);

                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            }

        }catch (Exception e) {

            responseDTO.setCode(VarList.RSP_FAIL);
            responseDTO.setMessage(e.getMessage());
            responseDTO.setContent(null);

            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @GetMapping("/getAllEmp")
    public ResponseEntity getAllEmployee() {

        try {

            List<EmployeeDTO> allEmployees = employeeService.getAllEmployees();

            responseDTO.setCode(VarList.RSP_SUCCESS);
            responseDTO.setMessage("Success");
            responseDTO.setContent(allEmployees);

            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

        }catch (Exception e) {
            responseDTO.setCode(VarList.RSP_FAIL);
            responseDTO.setMessage(e.getMessage());
            responseDTO.setContent(null);

            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
