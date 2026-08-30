public class TestProxy {
    public static void main(String[] args) {

        Document doc = new ProxyDocument ("Тест.pdf", true);
        doc.display();
        doc.display();
        Document secret = new ProxyDocument ("Секрет.pdf", false);
        secret.display();
    }
}