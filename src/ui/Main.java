package ui;

import java.util.Scanner;

import model.ContactBook;

public class Main {
	//private ContactBook cb2; //relacion unitaria
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		ContactBook cb = new ContactBook(); //relacion de dependencia
		System.out.println("Bienvenido al Contact Book");
		
		System.out.println("[1]. añadir contactos");
		System.out.println("[2]. buscar contactos" );
		System.out.println("[3]. remover contactos");
		System.out.println("[4]. salir");
		
		
		cb.add("jaime", "jaime@gmail.com", "123");
		cb.add("carlos", "ruben@gmail.com", "234");
		cb.add("juan", "j@gmail.com", "423");
		cb.add("felipe", "f@gmail.com", "754");
		cb.add("alex", "alex@gmail.com@", "976");
		
		System.out.println(cb.getContacts());
		String op = sc.nextLine();
		
		switch(op) {
		
			case "1":
				System.out.println("ingrese el nombre");
				String name= sc.nextLine();
				System.out.println("ingrese el email");
				String email= sc.nextLine();
				System.out.println("ingrese el phone");
				String phone= sc.nextLine();
				
				if(cb.add(name, email, phone)) {
					System.out.println("se ha registrado");
				}else {
					System.out.println("No se ha registrado");
				}
			break;
			case "2":
				System.out.println("Ingrese el correo del contacto a buscar");
				String email2 = sc.nextLine();
				System.out.println("el contacto es: "+cb.search(email2));
			break;
			case "3":
				System.out.println("Ingrese el correo del contacto a eliminar");
				String email3= sc.nextLine();
				System.out.println("El contacto eliminado es: "+cb.remove(email3));
				System.out.println(cb.getContacts());
			break;
			case "4":
				System.exit(0);
			break;
			default:
				System.out.println("Ingrese la opcion correctamente");
			break;
		}
		
		sc.close();
	}

}
