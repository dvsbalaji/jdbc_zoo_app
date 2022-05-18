package com.ty.zoo.driver ;

import com.ty.zoo.dto.Visitor;
import com.ty.zoo.service.VisitorService;

public class VisiterDriver {

	public static void main(String[] args) {
		
	
//		Visitor visitor = new Visitor() ;
//		visitor.setId(1);
//		visitor.setName("chetan");
//		visitor.setEmail("chet@mail.com");
//		visitor.setPhone("999998888");
//		visitor.setGender("male");
//		visitor.setAge(23);
//		
//		VisitorService vsService = new VisitorService() ;
//		int res = vsService.saveVisitor(visitor) ;
//		
//		if(res != 0)
//		{
//			System.out.println("data added");
//		}
//		else
//		{
//			System.out.println("something went wrong");
//		}
		
		VisitorService service = new VisitorService() ;
		Visitor visitor = service.getVisitorById(1) ;
		System.out.println("visitor id : "+ visitor.getId());
		System.out.println("visitor name : "+visitor.getName());
		System.out.println("visitor email : "+visitor.getEmail());
		System.out.println("visitor phone : "+visitor.getPhone());
		
	}
}
