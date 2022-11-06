import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddIndices;

public class OddIndices_Test {
    /*
    AAA
    Arrange
    Act
    Assert
    Test Data:
    Input = {-45, 590, 234, 985, 12, 68}
    Expected Result =  {590, 985, 68}
    */

    @Test
    public void oddIndices_HappyPath() {
        //Arrange
        int[] arr = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[]{590, 985, 68};
        //Act
        int[] ectualResult = new OddIndices().OddIndices(arr);
        //Assert
        Assert.assertEquals(ectualResult, expectedResult);


    }
}





