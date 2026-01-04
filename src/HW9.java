public class HW9 {
    public static void section1(){
        Animal myAnimal = new Animal();
        myAnimal.name = "Бобик";
        myAnimal.type = "пёс";
        myAnimal.Info();

    }

    public static void section2(){
        Library myLibrary = new Library();
        myLibrary.addBook("Мертвые души");
        myLibrary.addBook("Незнайка на Луне");
        myLibrary.addBook("Муму");
        myLibrary.listBooks();
        myLibrary.findBook("Муму");

    }

    public static void section3(){
        Library1 myLibrary = new Library1();
        myLibrary.addBook("Мертвые души","Гоголь");
        myLibrary.addBook("Незнайка на Луне", "Носов");
        myLibrary.addBook("Муму", "Тургенев");
        myLibrary.listBooks();
        myLibrary.findBook("Муму");
    }
}

class Animal{
    String name;
    String type;

    void Info(){
        System.out.println("Это " + type + " по имени " + name);
    }
}

class Library{
    private String[] Books = new String[10];
    void addBook(String newBook){
        for (int i = 0; i < Books.length; i++){
            if(Books[i] == null){
                Books[i] = newBook;
                break;
            }
        }
    }

    void listBooks(){
        for(int i = 0; i < Books.length; i++){
            System.out.println("Книга: " + i + " название: " + Books[i]);
        }
    }

    void findBook(String find){
        for (int i = 0; i < Books.length; i++){
            if(Books[i] == find){
                System.out.println("Книга " + Books[i] + " найдена");
                return;
            }
        }

        System.out.println("Книга " + find + " не найдена");
    }
}

class Book{
    String title;
    String author;
}

class Library1{
    private Book[] Books = new Book[10];

    void addBook(String newBookTitle, String newBookAuthor){
        for (int i = 0; i < Books.length; i++){
            if(Books[i] == null){
                Books[i] = new Book();
                Books[i].title = newBookTitle;
                Books[i].author = newBookAuthor;
                break;
            }
        }
    }

    void listBooks(){
        for(int i = 0; i < Books.length; i++){
            if(Books[i] != null){
                System.out.println("Книга: " + i + " название: " + Books[i].title + " автор: " + Books[i].author);
            }
        }
    }

    void findBook(String find){
        for (int i = 0; i < Books.length; i++){
            if (Books[i] != null){
                if(Books[i].title == find){
                    System.out.println("Книга " + Books[i].title + " найдена. Автор: " + Books[i].author);
                    return;
                }
            }
        }
        System.out.println("Книга " + find + " не найдена");
    }
}



