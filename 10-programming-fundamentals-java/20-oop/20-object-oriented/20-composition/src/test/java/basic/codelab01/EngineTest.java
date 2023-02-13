package basic.codelab01;

import com.switchfully.Field;
import org.junit.jupiter.api.Test;

import static com.switchfully.ReflectionTestUtil.onClass;

public class EngineTest {

    @Test
    void checkClassAndFields() {
        onClass("basic.codelab01.Engine")
                .expectFields(
                        Field.field("horsePower", int.class)
                );
    }

    @Test
    void checkConstructor() {
        onClass("basic.codelab01.Engine")
                .callConstructor(20)
                .expectField("horsePower").toHaveValue(20);
    }
}
