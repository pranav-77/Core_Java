package com.pranav.JSON;

import com.google.gson.Gson;

public class JsonDemo {
    public static void main(String[] args) {
        JsonObj obj=new JsonObj("Pranav",67,98);
        Gson gson = new Gson();
        String serialisation = gson.toJson(obj);
        System.out.println(serialisation);

        JsonObj deSerialisation = gson.fromJson(serialisation, JsonObj.class);
        System.out.println(deSerialisation);
    }
}
