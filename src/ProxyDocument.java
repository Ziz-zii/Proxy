public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String title;
    private boolean accessGranted;

    public ProxyDocument(String title, boolean accessGranted) {
        this.title = title;
        this.accessGranted = accessGranted;
    }

    @Override
    public void display() {
        if (!accessGranted) {
            System.out.println("Доступ запрещен к документу '" + title + "'!");
            return;
        }

        if (realDocument == null) {
            realDocument = new RealDocument(title);
        }

        System.out.println("Лог: Просмотр документа '" + title + "'");

        realDocument.display();
    }

    @Override
    public String getTitle() {
        return title;
    }
}
