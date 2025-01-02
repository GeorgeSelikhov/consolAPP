package Menu;

public class UserInterface implements Button{
    @Override
    public String but(String str) {

        return str;
    }

    public void firstMenu(){
        System.out.println("1. Запись из консоли");
        System.out.println("2. Запись из файла");
        System.out.println("3. Зандомное заполнение");
        System.out.println("4. Выход");
    }

    public void collectMenu(){
        System.out.println("1. Автомобиль");
        System.out.println("2. Книга");
        System.out.println("3. Корнеплод");
    }
}

