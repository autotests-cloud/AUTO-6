package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Хочу что-бы было хорошо, что-бы прям вот и хорошо")
    void test() {

        step("Open QA.GURU", () -> {
            // todo
        });

        step("$(".btn.min")", () -> {
            // todo
        });

        step("$("".xdget-block.xdget-tag.btn.btn-link.pull-right.btn-registerЭЭ).click", () -> {
            // todo
        });

    }
}