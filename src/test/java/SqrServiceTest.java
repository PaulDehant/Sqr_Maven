import org.testng.annotations.Test;
import ru.netology.sqr.SqrService;

public class SqrServiceTest {

    @Test
    public void searchValue() {
        SqrService service = new SqrService();
        int result = service.calcSearchValue(100, 300);
        System.out.println("Количество совпадений равно" + result);
    }
}
