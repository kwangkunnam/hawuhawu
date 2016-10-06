package domain.myDocument;

import java.util.List;

/**
 * Created by gnan on 10/6/16.
 */
public interface SearchEngine {
    public List<Document> findByType(Type documentType);

    public List<Document> listAll();
}
