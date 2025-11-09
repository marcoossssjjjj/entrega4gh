package Ejercicios;

import java.util.List;
import java.util.ArrayList;

//Tablas Hash
public class HashListas {
	private List<String>[] slots;
	private int n=0;
	public HashListas(int nSlots) {
		slots=new List[nSlots];
		for (int i=0; i< nSlots; i++) 
			slots[i] = new ArrayList<String>(0);
		}
	private int getId(String clave) {
		return Math.abs(clave.hashCode()) % slots.length;
	}
	public void put(String clave) {
		int id = getId(clave);
		put(slots[id],clave);
	}
	
	private void put(List<String> list, String clave) {
		for (String palabra:list) {
			if(palabra.compareTo(clave)==0) {
				return;
			}
			list.add(clave);
			n++;
		}
	}
	
	public boolean get(String clave) {
		int id = getId(clave);
		return get(slots[id], clave);
	}
	
	private boolean get(List<String> list, String clave) {
		for (String palabra:list) {
			if(palabra.compareTo(clave)==0) {
				return true;
			}
	}
	return false;
	}
}

