package com.iu.s1.people;

import java.util.List;
import java.util.Scanner;

public class PeopleView {
	//한사람의 정보를 출력하는 메서드를 생성
	//정보가 있으면 출력, 없으면 정보가 없다는 메세지를 출력

	private Scanner sc;
	
	public void remove(PeopleDTO peopleDTO) {
		
	}
	
	public void search(PeopleDTO peopleDTO) {

		System.out.println("이름 : " + peopleDTO.getName());
		System.out.println("별명 : " + peopleDTO.getNick());
		System.out.println("이메일 : " + peopleDTO.getEmail());
		System.out.println("전번 : " + peopleDTO.getPhone());
		System.out.println("생일 : " + peopleDTO.getBirth());
			
	}
	
	public void view(List<PeopleDTO> ar) {
		
		for (int i=0;i<ar.size();i++) {
			PeopleDTO peopleDTO = ar.get(i);
			System.out.println("이름 : " +peopleDTO.getName());
			System.out.println("별명 : " +peopleDTO.getNick());
			System.out.println("이메일 : " + peopleDTO.getEmail());
			System.out.println("전번 : " + peopleDTO.getPhone());
			System.out.println("생일 : " + peopleDTO.getBirth());
			
			
		}
	}
	
	
}
