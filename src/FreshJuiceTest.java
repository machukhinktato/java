class FreshJuice {
    // пример перечисления
    // enum - Перечисления представляют набор логически связанных констант
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

public class FreshJuiceTest{

    public static void main(String args[]){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Размер: " + juice.size);
    }

}