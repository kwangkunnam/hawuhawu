package domain;

import domain.myDocument.Document;
import domain.myDocument.SearchEngine;
import domain.myDocument.Type;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by gnan on 10/6/16.
 */
public class MyDocumentTest {
    private ClassPathXmlApplicationContext context;
    private SearchEngine engine;
    private Type type;

    @Before
    public void setup(){
        context=new ClassPathXmlApplicationContext("/domain/mydocument-context.xml");
        engine=context.getBean(SearchEngine.class);
        type=context.getBean("webType",Type.class);
    }

    @Test
    public void testWithSpringFindByType(){
        List<Document> documents=engine.findByType(type);
        assertNotNull(documents);
        assertTrue(documents.size()==1);
        assertEquals(type.getName(),documents.get(0).getType().getName());
        assertEquals(type.getDesc(),documents.get(0).getType().getDesc());
        assertEquals(type.getExtention(),documents.get(0).getType().getExtention());
    }

    @Test
    public void testWithSpringListAll(){
        List<Document> documents =engine.listAll();
        assertNotNull(documents);
        assertTrue(documents.size()==4);
    }

}
