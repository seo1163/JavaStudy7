package com.iu.s1.people;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleImport {
	
	private Scanner sc;

	public PeopleImport() {
		sc = new Scanner(System.in);
	}

	//이름을 입력받아서 같은 이름이 있는 PeopleDTO를 찾아서 리턴
	public PeopleDTO searchPeople(List<PeopleDTO>ar) {
		System.out.println("이름을 입력");
		String name = sc.next();
		
		PeopleDTO peopleDTO=null;
		
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				peopleDTO = ar.get(i);
				break;
			}
		}
		
		return peopleDTO;
				
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
	
	
	public PeopleDTO removePeople(List<PeopleDTO>ar) {
		PeopleDTO peopleDTO = null;
		System.out.println("삭제할 이름을 입력해주세요");
		String name = sc.next();
		
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getName().equals(name)) {
				peopleDTO = ar.remove(i);
				break;
			}
		}
		
	}
	
}
