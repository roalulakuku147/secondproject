import org.junit.Assert;
import org.junit.Test;

public class CalculatorDTest {
    @Test
    public void thedivisionshouldbecorrect() {
        double result = CalculatorD.dividemethod(15.75,5.25);
        Assert.assertEquals(3, result, 0);

    }


}
