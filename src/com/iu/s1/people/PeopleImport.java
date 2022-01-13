package com.iu.s1.people;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleImport {
	
	private Scanner sc;

	public PeopleImport() {
		sc = new Scanner(System.in);
	}

	public PeopleDTO addPeople() {
		PeopleDTO peopleDTO = new PeopleDTO();
		System.out.println("이름 입력");
		peopleDTO.setName(sc.next());
		System.out.println("별명 입력");
		peopleDTO.setNick(sc.next());
		System.out.println("이메일 입력");
		peopleDTO.setEmail(sc.next());
		System.out.println("전화번호 입력");
		peopleDTO.setPhone(sc.next());
		System.out.println("생일 입력");
		peopleDTO.setBirth(sc.next());
		return peopleDTO;
	}
	
	
	
	
}
