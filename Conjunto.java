package Ejercicios;

import java.util.ArrayList;
import java.util.List;

//Tablas Hash
public class Conjunto {
	private List<Object> [] tabla;
	public Conjunto(int size) {
		tabla=new List[size];
		for (int i=0; i<tabla.length;i++)
			tabla[i]=new ArrayList<Object>();
	}
	private int hash(Object x) {
		return Math.abs(x.hashCode())%tabla.length;
	}
	public void add(Object x) {
		int h = hash(x); //O(1)
		if(!tabla[h].contains(x)) //O(n)
			tabla[h].add(x); //O(1)
	}
	public boolean contains(Object x) {
		int h = hash(x); //O(1)
		return tabla[h].contains(x); //O(n)
	}
	public void remove(Object x) {
		int h = hash(x); //O(1)
			tabla[h].remove(x); //O(n)
	}
}
