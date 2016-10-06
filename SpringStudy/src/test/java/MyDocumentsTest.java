import com.apress.isf.spring.java.model.Document;
import com.apress.isf.spring.java.model.MyType;
import com.apress.isf.spring.java.service.MySearchEngine;
import com.apress.isf.spring.java.service.SearchEngine;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by gnan on 8/21/16.
 */
public class MyDocumentsTest {
    private SearchEngine engine=new MySearchEngine();

    @Test
    public void testFindByType(){
        MyType documentType=new MyType();
        documentType.setName("WEB");
        documentType.setDesc("Web Link");
        documentType.setExtention(".url");

        List<Document> documents =engine.findByType(documentType);
        assertNotNull(documents);
        assertTrue(documents.size()==4);
        assertEquals(documentType.getName(),documents.get(0).getType().getName());
        assertEquals(documentType.getDesc(),documents.get(0).getType().getDesc());
        assertEquals(documentType.getExtention(),documents.get(0).getType().getExtention());
    }

    @Test
    public void testAll(){
        List<Document> documents=engine.listAll();
        assertNotNull(documents);
        assertTrue(documents.size()==4);
    }
}
