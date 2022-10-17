import org.junit.jupiter.api.Test;
import ru.netology.sqr.SqrService;

public class SqrServiceTest {

    @Test
    public void searchValue() {
        SqrService service = new SqrService();
        int result = service.calcSearchValue(350, 697);
        System.out.println("Количество найденных значений, попадающие в диапозон = " + result);
    }
}
