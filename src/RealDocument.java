public class RealDocument implements Document {
    private String title;
    private String content;
    private boolean isLoaded = false;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Загрузка документа '" + title + "' с диска...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = "Содержимое документа: " + title;
        this.isLoaded = true;
        System.out.println("Документ загружен!");
    }

    @Override
    public void display() {
        if (!isLoaded) {
            loadFromDisk();
        }
        System.out.println("Отображение: " + content);
    }

    @Override
    public String getTitle() {
        return title;
    }
}



