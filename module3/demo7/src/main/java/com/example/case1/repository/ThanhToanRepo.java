package com.example.case1.repository;

import com.example.case1.model.ThanhToan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThanhToanRepo implements IThanhToanRepo{
    private static final String GET_ALL = "SELECT * FROM ThanhToan";
    @Override
    public List<ThanhToan> findAll() {
        List<ThanhToan> thanhToanList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DBConnect.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String thanhtoan = resultSet.getString("thanhtoan");
                thanhToanList.add(new ThanhToan(id, thanhtoan));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return thanhToanList;
    }
}
