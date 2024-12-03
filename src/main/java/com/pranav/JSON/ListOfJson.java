package com.pranav.JSON;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class ListOfJson {
    public static void main(String[] args) {
        List<JsonObj> objList = Arrays.asList(
                new JsonObj("Alan", 1, 100),
                new JsonObj("Akash", 2, 87),
                new JsonObj("abi", 3, 67));
        Gson gson = new Gson();
        String serialisation = gson.toJson(objList);
        System.out.println(serialisation);

        Type listType = new TypeToken<List<JsonObj>>(){}.getType();
        List<JsonObj> deserializedList = gson.fromJson(serialisation, listType);
        System.out.println(deserializedList);
    }
}
