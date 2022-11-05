import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEven;

import java.util.Arrays;

public class OddEvenTest {
    /*
        Test Data:
        -345 →  “Odd”
        0 →  “Even”
        222222 →  “Even”

     */

    @Test
    public void negativeNumber_HappyPath() {
        //AAA
        //Arrange
        int number = 222222;

        String expectedResult = "Even";

        //Act
        String actualResult = new OddEven().oddEven(Integer.parseInt(String.valueOf(number)));

        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }


}
