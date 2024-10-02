package com.campusdual.classroom;


public class Exercise26 {
    public static void main(String[] args) {
        Contact contact = new Contact("Fernando Miguel","Juan de los Santos Requejo León", "654321321");
        contact.generarCodigo();
        System.out.println(contact.code);


    }
}
