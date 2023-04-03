package org.example;

public class Main {
    public static void main(String[] args) {
        Book[] books = new ProgrammingBook[10];
        books[0] = new ProgrammingBook(1, "Clean Code", 72.9, " Robert C. Martin", "English", "java");
        books[1] = new ProgrammingBook(2, "Coding Horror", 100, "Jeff Atwood", "English", "java");
        books[2] = new ProgrammingBook(3, "Introduction to Algorithms", 70, "Thomas H. Cormen", "English", "java");
        books[3] = new ProgrammingBook(4, " Structure and Interpretation of Computer Programs", 120.5, "Harold Abelson", "English", "java");
        books[4] = new ProgrammingBook(5, "Code Complete", 150, "Steve McConnell", "English", "java");
        books[5] = new FictionBook(6,"Adventures of Sherlock Holmes",200, "Conan Doyle", "Fiction 1");
        books[6] = new FictionBook(7,"Animal Farm",90, "George Orwell", "Fiction 2");
        books[7] = new FictionBook(8,"Crime and Punishment",150, "Fyodor Dostoevsky", "Fiction 2");
        books[8] = new FictionBook(9,"Fyodor Dostoevsky",100, "Bram Stoker", "Fiction 1");
        books[9] = new FictionBook(10,"Harry Potter and the Sorcerer's Stone",170.5, "J.K. Rowling", "Fiction 1");
        int countPrice = 0;
        int countCategory = 0;
        double sum = 0;

        for (Book book : books){
            sum += book.getPrice();
            if(book.getPrice() < 100){
                countPrice++;
            }
            if(book instanceof  FictionBook && ((FictionBook)book).getCategory() == "Fiction 1"){
                countCategory += 1;
            }
        }

        System.out.println("the total price of the books = " + sum);
        System.out.println("Some Fiction books have the category \"Fiction 1\": " + countCategory);
        System.out.println("the number of books with a price greater than 100: " + countPrice);


    }

}
