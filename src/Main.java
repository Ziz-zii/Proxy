//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Document doc1 = new ProxyDocument("Важный_отчет.pdf", true);
    Document doc2 = new ProxyDocument("Секретный_план.doc", false);
    Document doc3 = new ProxyDocument("Презентация.pptx", true);

    System.out.println("1. Открываем важный отчет:");
    doc1.display();

    System.out.println("\n2. Открываем секретный план:");
    doc2.display();

    System.out.println("\n3. Открываем презентацию:");
    doc3.display();

    System.out.println("\n4. Повторно открываем важный отчет:");
    doc1.display();
}

