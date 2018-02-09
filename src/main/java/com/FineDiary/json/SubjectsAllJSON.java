package com.FineDiary.json;

import com.FineDiary.entity.SubjectsAll;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class SubjectsAllJSON {

    public List<SubjectsAll> writeValue() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        SubjectsAll obj = new SubjectsAll();
        String jsonInString = mapper.writeValueAsString(obj);
        return (List<SubjectsAll>) obj;
    }
    public List<SubjectsAll> readValue() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{'id' : 'subject'}";
        SubjectsAll obj = new SubjectsAll();
         obj = mapper.readValue(jsonInString, SubjectsAll.class);
         return (List<SubjectsAll>) obj;
    }

}


