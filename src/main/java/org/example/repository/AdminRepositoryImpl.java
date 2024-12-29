package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminRepositoryImpl extends BaseRepositoryImpl<Integer, Admin> implements AdminRepository {
    public AdminRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return " Admin ";
    }

    @Override
    public String getColumnName() {
        return " ( first_name , last_name ) ";
    }

    @Override
    public String getCountOfParams() {
        return "(?,?)";
    }

    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, Admin type, boolean isCountOnly) throws SQLException {
        preparedStatement.setString(1, type.getFirstName());
        preparedStatement.setString(2, type.getLastName());


    }


}
