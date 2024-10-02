package com.campusdual.classroom;

import java.text.Normalizer;

public class Contact implements ICallActions{
    public String name;
    public String surnames;
    public String phone;
    public String code;
    public Contact(String name, String surname, String phone) {
        this.name = name;
        this.surnames = surname;
        this.phone = phone;
        this.code = generarCodigo();
    }
    public String getCode() {
        return code;
    }
    public String getPhone() {
        return phone;
    }
    public String getSurnames() {
        return surnames;
    }
    public String getName() {
        return name;
    }
    public String generarCodigo(){
        StringBuilder codigo = new StringBuilder();
        String letraNombre = String.valueOf(this.name.toLowerCase().charAt(0));
        codigo.append(letraNombre);
        String apellido = this.surnames.toLowerCase();
        String[] apellidos = apellido.split(" ");
        System.out.println(apellido);
        if(apellidos.length == 1){
            codigo.append(apellidos[0]);
        }else{
           codigo.append(apellidos[0].charAt(0));
           for (int i = 1; i < apellidos.length; i++) {
                codigo.append(apellidos[i]);
           }
        }

        return limpiarTexto(codigo.toString());
    }
    public String limpiarTexto(String texto){
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }

    @Override
    public void showContactDetails() {
        System.out.println("Name: " + name);
        System.out.println("Surnames: " + surnames);
        System.out.println("Phone: " + phone);
        System.out.println("Code: " + code);
    }
    @Override
    public void callMyNumber() {
        System.out.println("Calling " + name + " " + surnames + " at " + phone);
    }

    @Override
    public void callOtherNumber(String number) {
        System.out.println("Calling " + name + " " + surnames + " at " + number);
    }
}
