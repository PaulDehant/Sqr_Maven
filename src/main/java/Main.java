import ru.netology.sqr.SqrService;

public class Main {

    public static void main(String[] args) {
        SqrService service = new SqrService();
        service.calcSearchValue(350, 697);
        System.out.println(service.calcSearchValue(350, 697));
    }
}