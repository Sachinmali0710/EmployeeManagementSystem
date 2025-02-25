package com;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

public class Client {
	public static void main(String[] args) {
		
		HashMap<Integer, Employee> employee = new HashMap<Integer, Employee>();
		Scanner sc = new Scanner(System.in);
		
		int empId = 100;
		
		while(true)
		{
			System.out.println("\tEmployee Management System");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.Get Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Get All Employee");
			
			System.out.print("Choice Option:- ");
			int option = sc.nextInt();
			
			try {
				String empName = null;
				int empSal;
				String empAdd;
				String empMailId;
				switch (option) {
				case 1: 
					System.out.println("\t Inserting Employee Data");
					System.out.print("Employee Name:");
					empName = sc.next();
					System.out.print("Employee Salary:");
					empSal = sc.nextInt();
					System.out.print("Employee Address:");
					 empAdd = sc.next();
					System.out.print("Employee Mail Id:");
					empMailId = sc.next();
					
					if (empName.isEmpty() || empSal <= 0 || empAdd.isEmpty() || empMailId.isEmpty()) 
					{
						throw new InputMismatchException("Please enter valid data employee");
					}
					
					Employee emp = new Employee(empName, empSal, empAdd, empMailId);
					employee.put(++empId, emp);//load inside database
					
					System.out.println("\tEmployee inserted successfully. "+"Employee id:- "+empId);
					break;
				case 2: 
					System.out.println("\t Updating Employee Data");
					System.out.print("Enter Employee Id:- ");
					int eId = sc.nextInt();
					if (!employee.containsKey(eId)) {
						throw new EmployeeNotFoundException("Employee "+eId+" not found");
					}
					
						System.out.print("Employee Name:");
						String eName1 = sc.next();
						System.out.print("Employee Salary:");
						int eSal1 = sc.nextInt();
						System.out.print("Employee Address:");
						String eAdd1 = sc.next();
						System.out.print("Employee Mail Id:");
						String eMailId1 = sc.next();
						Employee emp2 = new Employee(eName1, eSal1, eAdd1, eMailId1);
						employee.put(eId, emp2);
		
					System.out.println("\tEmployee Updated successfully . "+"Employee id:- "+eId);
					break;	
				case 3:
					System.out.println("\tGet Employee data");
					System.out.print("Enter Employee id:");
					int eId2 = sc.nextInt();
					
					if(!employee.containsKey(eId2))
					{
						throw new EmployeeNotFoundException("Employee "+eId2+" not found");
					}
		 
					Employee empObj = employee.get(eId2);
					System.out.println(empObj);
					break;
				case 4:
					System.out.println("\tDelete Employee data");
					System.out.print("Enter Employee id:");
					int eId3 = sc.nextInt();
					
					if(!employee.containsKey(eId3))
					{
						throw new EmployeeNotFoundException("Employee "+eId3+" not found");
					}
					employee.remove(eId3);
					System.out.println("\tEmployee deleted successfully. \"+\"Employee id:- \""+eId3);
					break;
				case 5:
					Set<Entry<Integer, Employee>> result = employee.entrySet();
					if(result.isEmpty())
					{
						throw new EmployeeNotFoundException("No employee data found");
					}
					Iterator<Entry<Integer, Employee>> itr = result.iterator();
					while(itr.hasNext())
					{
						Entry<Integer, Employee> finalResult = itr.next();
						System.out.println(finalResult.getKey()+" "+finalResult.getValue());
					}
					break;
				default:
					System.out.println("\t Enter valid value");
					break;
				}
			}catch (Exception e) {
				System.out.println("Error messages :"+e.getMessage());
			}
		}
	}
}
