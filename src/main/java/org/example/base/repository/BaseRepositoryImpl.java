package org.example.base.repository;

import lombok.RequiredArgsConstructor;
import org.example.base.model.BaseEntity;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RequiredArgsConstructor
public abstract class BaseRepositoryImpl<ID extends Serializable, T extends BaseEntity<ID>> implements BaseRepository<ID, T> {
    protected final Connection connection;


    @Override

    public void save(T entity) {
        String sql = "INSERT INTO " + getTableName() + " " + getColumnName() + " VALUES" + getCountOfParams();

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            fillParamForStatement(statement, entity, false);
            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public abstract String getTableName();

    public abstract String getColumnName();

    public abstract String getCountOfParams();

    public abstract void fillParamForStatement(PreparedStatement preparedStatement,
                                               T type,
                                               boolean isCountOnly) throws SQLException;


}
