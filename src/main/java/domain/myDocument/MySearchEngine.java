package domain.myDocument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gnan on 10/6/16.
 */
public class MySearchEngine implements SearchEngine {
    @Override
    public List<Document> findByType(Type documentType) {
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
        Type type=new Type();
        type.setName("PDF");
        type.setDesc("Portable Document Format");
        type.setDesc(".pdf");

        Document document=new Document();
        document.setName("Book Template");
        document.setType(type);
        document.setLocation("Location1");
        result.add(document);

        document=new Document();
        document.setName("Sample Contract");
        document.setType(type);
        document.setLocation("Location2");
        result.add(document);

        type=new Type();
        type.setName("NOTE");
        type.setDesc("Text Notes");
        type.setExtention(".txt");

        document=new Document();
        document.setName("Clustering with RabbiMQ");
        document.setType(type);
        document.setLocation("Location3");
        result.add(document);

        return result;
    }
}
