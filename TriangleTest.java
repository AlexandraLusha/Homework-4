import hw4.TriangleHelper;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {
    @Test
    public void positiveTriangleSquareCalculate() {

        Assert.assertEquals(TriangleHelper.square(3, 4, 5), 6);
    }

    @Test
    public void negativeTriangleSquareCalculate() {

        Assert.expectThrows(IllegalArgumentException.class, () -> TriangleHelper.square(0, 4, 5));
    }
}