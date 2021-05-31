import com.x.utils.QueryrunnerUtil;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class TestConnection {
    @Test
    public void connection() throws SQLException {
        QueryrunnerUtil.getQueryrunner().query("select count(*) from address", new ScalarHandler<Integer>());
    }
}
