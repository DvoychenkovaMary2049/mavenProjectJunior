package lesson9;

public class Main {
    public static void main(String[] args) {

        Journal journal1 =new Journal("Elle Girl", 2021, "Elle Girl", 62,24);
        Journal journal2 = new Journal("Думай", 2020, "DUMA", 24, 32);
        Journal journal3 = new Journal("Холодное сердце", 2021, "FROZEN", 9, 52);

        Book book1 = new Book("Роулинг Д.", 529, "Гарри Поттер и узник Азкабана", 2020,"Махаон");
        Book book2 = new Book("Гофман Эрнст Теодор Амадей", 104, "Щелкунчик и мышиный король", 2019, "Проф-Пресс");
        Book book3 = new Book("Сапковский Анджей", 1344, "Ведьмак", 2020, "АСТ" );

        PrintPubl [] printPubl= new PrintPubl[6];
        printPubl [0] = journal1;
        printPubl [1] = book1;
        printPubl [2] = journal2;
        printPubl [3] = book2;
        printPubl [4] = journal3;
        printPubl [5] = book3;
        printFatBook(printPubl);

    }
    public static void printFatPubl(PrintPubl[] PrintPubl){
        PrintPubl theFatPubl = PrintPubl[0];
        for (PrintPubl publ: PrintPubl){
            if (publ.getPages() > theFatPubl.getPages()){
                theFatPubl = publ;
            }
        }
        System.out.println(theFatPubl);
    }
    public static void printFatBook(PrintPubl[] PrintPubl){
        PrintPubl theFatPubl = null;
        for (PrintPubl publ: PrintPubl){
            if (publ instanceof Book){
                if (theFatPubl == null){
                    theFatPubl = publ;
                }  else{
                    if (publ.getPages() > theFatPubl.getPages()){
                        theFatPubl = publ;
                    }
                }
            }
        }
        System.out.println(theFatPubl);
    }
}
