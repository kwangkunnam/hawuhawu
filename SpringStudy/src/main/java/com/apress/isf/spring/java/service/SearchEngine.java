package com.apress.isf.spring.java.service;

import com.apress.isf.spring.java.model.Document;
import com.apress.isf.spring.java.model.MyType;

import java.util.List;

/**
 * Created by gnan on 8/21/16.
 */
public interface SearchEngine {
    public List<Document> findByType(MyType documentType);
    public List<Document> listAll();
}
