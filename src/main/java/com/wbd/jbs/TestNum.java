package com.wbd.jbs;

public class TestNum {

	public static void main(String[] args) {
		
		SimpleEnum se = SimpleEnum.FOUR;
		//System.out.println(se.ordinal());
		
		for(SimpleEnum e: SimpleEnum.values()) {
			
			System.out.println(e.ordinal());
		}

	}

}
