package springboottest.app;

import org.springframework.stereotype.Component;

/**
 * Created by tom_red on 2017/12/28.
 */
@Component
public class AddCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
