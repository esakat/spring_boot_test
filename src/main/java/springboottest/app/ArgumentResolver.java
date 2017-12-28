package springboottest.app;

import java.io.InputStream;

/**
 * Created by tom_red on 2017/12/28.
 */
public interface ArgumentResolver {
    Argument resolve(InputStream stream);
}
