package com.apress.isf.spring.java.service;

import com.apress.isf.spring.java.model.Document;
import com.apress.isf.spring.java.model.MyType;
import com.apress.isf.spring.java.service.SearchEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gnan on 8/21/16.
 */
public class MySearchEngine implements SearchEngine {
    @Override
    public List<Document> findByType(MyType documentType) {
        List<Document> result=new ArrayList<Document>();
        for(Document document : storage()){
            if(document.getType().getName().equals(documentType.getName())){
                result.add(document);
            }
        }
        return result;
    }

    @Override
    public List<Document> listAll() {
        return storage();
    }
    private List<Document> storage(){
        List<Document> result=new ArrayList<Document>();

        MyType type = new MyType();
        type.setName("PDF");
        type.setDesc("Portable Document Format");
        type.setExtention(".pdf");

        Document document = new Document();
        document.setName("Book Template");
        document.setType(type);
        document.setLocation("/Users/felipeg/Documents/Random/Book Template.pdf");

        result.add(document);

        document = new Document();
        document.setName("Sample Contract");
        document.setType(type);
        document.setLocation(
                "/Users/felipeg/Documents/Contracts/Sample Contract.pdf");

        result.add(document);

        type = new MyType();
        type.setName("NOTE");
        type.setDesc("Text Notes");
        type.setExtention(".txt");

        document = new Document();
        document.setName("Clustering with RabbitMQ");
        document.setType(type);
        document.setLocation(
                "/Users/felipeg/Documents/Random/Clustering with RabbitMQ.txt");

        result.add(document);

        type = new MyType();
        type.setName("WEB");
        type.setDesc("Web Link");
        type.setExtention(".url");

        document = new Document();
        document.setName("Pro Spring Security Book");
        document.setType(type);
        document.setLocation("http://www.apress.com/9781430248187");

        result.add(document);

        return result;
    }

}
