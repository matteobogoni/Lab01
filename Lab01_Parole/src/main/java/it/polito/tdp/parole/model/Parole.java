package it.polito.tdp.parole.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	List listaparole;
	
	public Parole() {
		this.listaparole = new LinkedList();
	}
	
	public void addParola(String p) {
		this.listaparole.add(p);
	}
	
	public List<String> getElenco() {
		List listaparoleordinate = new LinkedList(listaparole);
		Collections.sort(listaparoleordinate);
		
		return listaparoleordinate;
	}
	
	public void reset() {
		this.listaparole.clear();
	}

}
