package com.example.MessageMemo;	
	
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.MessageMemo.Customer;
import com.example.MessageMemo.EmployeeRepository;
import com.example.MessageMemo.Employee;


@Controller 	
public class MessageMemoController {	
	@Autowired	// This means to get the bean called CustomerRepository
	// Which is auto-generated by Spring, we will use it to handle the data
private CustomerRepository customerRepository;
	@Autowired
private EmployeeRepository employeeRepository;
	@RequestMapping("/msgmemo/inputForm")
    
		public String memo(Model model) {
			// M_CUSTOMERテーブルの全データを取得
			Iterable<Customer> customerList = customerRepository.findAll();
			
			// モデルに属性追加
			model.addAttribute("customerlist",customerList);
			
			Iterable<Employee> employeeList = employeeRepository.findAll();
			
			// モデルに属性追加
			model.addAttribute("employeelist",employeeList);
			return "memo";
		}
	
       	
	}	
	
	
	