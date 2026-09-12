package _3_FactoryDesignPattern;

public abstract class DocumentProcessor {

    private final String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract DocumentType supportsType();

    public abstract void processDocument();

}
