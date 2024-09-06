package infrastructure.db.oracle.interfaces;

import java.sql.SQLException;

public interface IUserOracleRepository {
    public static void insertUserByEmail(
            String email, String password
    ) throws SQLException {

    }
}
