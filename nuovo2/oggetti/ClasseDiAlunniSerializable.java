/*
 * Vector di alunni
 * 
 */

package oggetti;
import java.util.Vector;
import oggetti.AlunnoSerializable;

import java.io.Serializable;
import java.io.*;

public class ClasseDiAlunniSerializable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 351043790835095619L;
	
	
	private Vector<AlunnoSerializable> alunni;
	
	
	/**
	 * 
	 */
	public ClasseDiAlunniSerializable() {
		alunni = new Vector<AlunnoSerializable>(20, 5);
	}

	public int quantiSono()
	{
		return alunni.size();
	}
	
	public void aggiungiAlunno()
	{
		AlunnoSerializable al = new AlunnoSerializable();
		al.inserisci();
		alunni.add(al);
		
		//ClasseDiAlunniSerializable classe = new ClasseDiAlunniSerializable();
		try {
			FileOutputStream fo = new FileOutputStream("objectclasse.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			
			// scrittura su file
			// si salva tutto con una sola istruzione
			oos.writeObject(alunni);
			
			System.out.println("Scrittura:"+alunni);
			oos.flush();
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void visualizza() {
		try {
			FileInputStream fi = new FileInputStream("objectclasse.dat");
			ObjectInputStream ois = new ObjectInputStream(fi);

			// lettura dal file
			Object ob = ois.readObject();

			// casting
			Vector classe = (Vector) ob;

			System.out.println("Lettura: " + classe);

			ois.close();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public AlunnoSerializable togliAlunno(int pos)
	{
		AlunnoSerializable al = alunni.remove(pos);
		return al;
	}

	@Override
	public String toString() {
		return "ClasseDiAlunni [alunni=" + alunni + "]";
	}
	
	
	
}
