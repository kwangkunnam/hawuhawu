package domain.myDocument;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gnan on 10/6/16.
 */
public class SearchEngineService implements SearchEngine {
    public DocumentDAO getDocumentDAO() {
        return documentDAO;
    }

    public void setDocumentDAO(DocumentDAO documentDAO) {
        this.documentDAO = documentDAO;
    }

    private DocumentDAO documentDAO;


    @Override
    public List<Document> findByType(Type documentType) {
        List<Document> result=new ArrayList<Document>();
        for(Document document :listAll()){
            if(document.getType().getName().equals(documentType.getName())){
                result.add(document);
            }
        }
        return result;
    }

    @Override
    public List<Document> listAll() {
        return Arrays.asList(documentDAO.getAll());
    }
}
