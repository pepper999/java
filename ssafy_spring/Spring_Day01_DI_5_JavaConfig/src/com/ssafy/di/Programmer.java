package com.ssafy.di;

public class Programmer {
	private Computer computer;

	public Programmer() {
		// TODO Auto-generated constructor stub
	}

	public Programmer(Computer computer) {
		this.computer = computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public void coding() {
		System.out.println(computer.getInfo() + "으로 개발을 한다.");
	}
}
