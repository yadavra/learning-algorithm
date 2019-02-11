package com.usa.senate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.usa.senate.Senator.MemberType;

public class SenateBuilder {

	private SenateBuilder(){}
	public static USSenate buildSenate(List<String> senators , String vicePresident) {
		if (senators == null || senators.isEmpty()) {
			return null;
		}
		USSenate usSenate = new USSenate();
		List<Senator> senatorList = new ArrayList<Senator>();
		for (String name : senators) {
			if(name.equalsIgnoreCase(vicePresident)){
				Senator sentator = createRepresentative(name);
				sentator.setMemberType(MemberType.VICE_PRESIDENT);
				senatorList.add(sentator);
				usSenate.setVicePresident(sentator);
			}
			senatorList.add(createRepresentative(name));
		}
		usSenate.setSenators(senatorList);
		return usSenate ; 
		 
	}

	private static Senator createRepresentative(String name)  {
		Senator member = new Senator();
		member.setMemberType(MemberType.Senate);
		member.setName(name);
		member.setMemberId(UUID.nameUUIDFromBytes(name.getBytes()).toString());
		return member;
	}
}
