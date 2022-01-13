package com.iu.s1.people;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleData {
	
	public void select() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int count;
		PeopleImport pi = new PeopleImport();
		
		ArrayList<PeopleDTO> ar = new ArrayList<>();
		
		while (check = true) {
			System.out.println("1. 전체 명단 출력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 명단 추가");
			System.out.println("4. 명단 삭제");
			System.out.println("5. 종    료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("1. 전체 명단 출력");
				PeopleDTO peopleDTO = pi.addPeople();
				ar.add(peopleDTO);
			} else if (select == 2) {
				System.out.println("2. 정보 검색");
			} else if (select == 3) {
				System.out.println("3. 명단 추가");
				PeopleDTO peopleDTO = pi.addPeople();
				ar.add(peopleDTO);
				System.out.println(ar);
			} else if (select == 4) {
				System.out.println("4. 명단 삭제");
			} else {
				System.out.println("5. 종 료");
				break;
			}
		}
	}

}
