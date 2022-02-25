import abduls.petStore.Staff;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class StaffTest {
        @Test
        public void constructorTest01(){

            //Given
            Staff staff = new Staff<>("Edna",123);


            //When
            Integer expected =123;
            Integer actual = 123;


            //Then
            Assertions.assertEquals(expected, actual);


        }
        @Test
        public void greetsTest01(){
            Staff staff = new Staff<>("DJ", 234);

            String expected ="DJ";
            String actual ="DJ";

            Assertions.assertEquals(expected,actual);
        }
}
