public class BookStore{

    private String fieldClass1;
    private String fieldClass2;

    public BookStore() {

    }

    public BookStore(String var1, String var2) {
        this.fieldClass1 = var1;
        this.fieldClass2 = var2;
    }


    public void setVar1Var2(String var1, String var2) {
        fieldClass1 = var1;
        fieldClass2 = var2;
    }

    public String getVar1Var2() {
        return fieldClass2;
    }

    public String returnCoolString() {
        return (this.fieldClass1 + " " + this.fieldClass2);

    }

}
