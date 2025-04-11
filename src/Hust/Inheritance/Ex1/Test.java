package Hust.Inheritance.Ex1;

public class Test {
    public static void main(String[] args) {
        Book[] book = new Book[10];
        book[0] = new Book("Giết con chim nhại","Hưng Thái",156);
        book[1] = new Book("Giết con chim nhại1","Hưng Thái1",157);
        book[2] = new Book("Giết con chim nhại2","Hưng Thái2",159);
        book[3] = new Book("Giết con chim nhại3","Hưng Thái3",168);
        int count = 0;
        for(Book book1 : book) {
            if(book1 == null){
                break;
            }
            count++;
            System.out.println(book1.getName() + " có " + book1.getNumberOfPages() + " trang");
        }
        System.out.println("Hiện có "+ count + " quyển sách");
    }
}
