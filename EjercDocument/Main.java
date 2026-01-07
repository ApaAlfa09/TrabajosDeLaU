public class Main {
    public static void main(String[] args) {
        TextDocumentCreator txtDocumentCreate = new TextDocumentCreator();
        SpreadsheetDocumentCreator spreadDocumentCreate = new SpreadsheetDocumentCreator(); 

        Document txtDocument =  txtDocumentCreate.creatDocument();
        Document spreadDocument = spreadDocumentCreate.creatDocument(); 

        txtDocument.open();
        txtDocument.close();
        txtDocument.save();
        txtDocument.revent();

        spreadDocument.open();
        spreadDocument.close();
        spreadDocument.save();
        spreadDocument.revent();
        

    }
}
