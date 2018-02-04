public class Book extends BookStore{



    public Book() {
        setVar1Var2("set1", "set2");
        System.out.println(returnCoolString());
    }

    public void test() {
        returnCoolString();
    }

    public static void main(String[] args) {


        Book book = new Book();
        book.test();


        book.setVar1Var2("hella", "cool");
        System.out.println();

    }


}


