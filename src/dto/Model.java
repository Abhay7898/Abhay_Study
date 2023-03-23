package dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Model {
	// create pojo/DTO class
	// add all the variable type and geeter/setter
	// interfacae : print // listPrint// setprint// haspamprint//arryPrint
	// operation class
	// set all the type inside pojo..
	// call all the repsective method to print the value
	private int sid;
	private char ch;
	private float f;
	private String name;
	private String name1[];
	private List<String> list=new ArrayList<>();
	//private List<String> list = new ArrayList<>();
	private Set<String> set=new HashSet<>();
	private HashMap<String ,String> map = new HashMap<>();
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getName1() {
		return name1;
	}
	public void setName1(String[] name1) {
		this.name1 = name1;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public HashMap<String, String> getMap() {
		return map;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}


}