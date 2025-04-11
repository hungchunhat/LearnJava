package Hust.Inheritance.Ex1;

public class Test {
    public static void main(String[] args) {
        Book[] book = new Book[10];
        book[0] = new Book("Giết con chim nhại","Hưng Thái",156);
        book[1] = new Book("Giết con chim nhại1","Hưng Thái1",157);
        book[2] = new Book("Giết con chim nhại2","Hưng Thái2",159);
        book[3] = new Book("Giết con chim nhại3","Hưng Thái3",168);
        for(int i = 0;i < Book.getNumberOfBook(); i++) {
            System.out.println(book[i].getName() + " có " + book[i].getNumberOfPages() + " trang");
        }
        System.out.println("Hiện có "+ Book.getNumberOfBook() + " quyển sách");
    }
}
