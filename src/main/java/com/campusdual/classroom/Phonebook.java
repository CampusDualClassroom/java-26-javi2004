package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    HashMap<String, Contact> mapa = new HashMap<>();
    public void addContact( Contact contacto){
        mapa.put(contacto.code,contacto);
    }

    public void deleteContact(String code){
        mapa.remove(code);
    }
    public void showPhonebook(){
        for (Map.Entry<String,Contact> valor: mapa.entrySet()){
            System.out.println("Clave: " + valor.getKey() + ", Valor: " + valor.getValue());
        }
    }
    public HashMap<String, Contact> getData() {
        return mapa;
    }

}
