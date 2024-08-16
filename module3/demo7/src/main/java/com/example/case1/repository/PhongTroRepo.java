package com.example.case1.repository;

import com.example.case1.dto.PhongTroDto;
import com.example.case1.model.PhongTro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhongTroRepo implements IPhongTroRepo {
    private static final String GET_All = "SELECT * FROM PhongTro";
    private static final String GET_ALL_DTO = "SELECT phongtro.id, phongtro.name, phoneNumber, startDate,description, thanhtoan.thanhtoan as thanhtoan from phongtro left join thanhtoan on thanhtoan.id = phongtro.thanhtoan_id;";
    private static final String SAVE = "INSERT INTO phongtro (name, phoneNumber, startDate, description, thanhToan_id) VALUES (?,?,?,?,?)";
    private static final String DELETE_BY_ID = "DELETE FROM phongtro WHERE id = ?";
    private static final String FIND_BY_ID = "SELECT * FROM phongtro WHERE id = ?";
    private static final String UPDATE = "update phongtro set name = ?, phoneNumber = ?, startDate = ?, description = ?, thanhtoan_id = ? where id = ?;";
    private static final String SEARCH_DTO = "phongtro.id , phongtro.name, phoneNumber,startDate, description, thanhtoan.thanhtoan as thanhtoan from phongtro join thanhtoan on thanhtoan.id = phongtro.thanhtoan_id where phongtro.name like concat ('%', ?, '%') and thanhtoan.id = ?;\"";

    @Override
    public List<PhongTro> findAll() {
        List<PhongTro> phongTroList = new ArrayList<PhongTro>();
        Connection connection = null ;
        try {
            connection = DBConnect.getConnection();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_All);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phoneNumber");
                String startDate = resultSet.getString("startDate");
                String description =resultSet.getString("description");
                int thanhToan = resultSet.getInt("thanhToan");
                phongTroList.add(new PhongTro(id, name, phoneNumber, startDate, description, thanhToan));
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return phongTroList;
    }

    @Override
    public List<PhongTroDto> findAllDto() {
        List<PhongTroDto> phongTroDtoList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DBConnect.getConnection();
        }catch (SQLException e ){
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_DTO);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = Integer.parseInt(resultSet.getString("id"));
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phoneNumber");
                String startDate   = resultSet.getString("startDate");
                String description = resultSet.getString("description");
                String thanhToan   = resultSet.getString("thanhToan");
                phongTroDtoList.add(new PhongTroDto(id , name, phoneNumber, startDate, description, thanhToan));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return phongTroDtoList;
    }

    @Override
    public boolean add(PhongTro phongTro) {
        Connection connection = null ;
        int rowEffected = 0;
        try {
            connection = DBConnect.getConnection();
        }catch (SQLException e ){
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE);
            preparedStatement.setString(1 , phongTro.getName());
            preparedStatement.setString(2 , phongTro.getNumberPhone());
            preparedStatement.setString(3 , phongTro.getStartDate());
            preparedStatement.setString(4 , phongTro.getDescription());
            preparedStatement.setInt(5 , phongTro.getThanhToan());
            rowEffected = preparedStatement.executeUpdate();
        }catch (SQLException e){
            return false ;
        }finally {
            try {
                connection.close();
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
        return rowEffected > 0;
    }

    @Override
    public boolean deleteById(int id) {
        Connection connection = null;
        int rowEffected = 0;
        try {
            connection = DBConnect.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);
            preparedStatement.setInt(1, id);
            rowEffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return rowEffected > 0;
    }

    @Override
    public PhongTro findById(int id) {
        PhongTro phongTro = null ;
        Connection connection = null;
        try {
            connection = DBConnect.getConnection();
        }catch (SQLException e ){
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phoneNumber");
                String startDate = resultSet.getString("startDate");
                String description = resultSet.getString("description");
                int thanhToan = resultSet.getInt("thanhToan_id");
                phongTro = new PhongTro(id, name, phoneNumber, startDate, description, thanhToan);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return phongTro ;
    }

    @Override
    public boolean update(PhongTro phongTro) {
        int updateId = phongTro.getId();
        Connection connection = null ;
        int rowEffected = 0;
        try {
            connection = DBConnect.getConnection();
        }catch (SQLException e ){
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, phongTro.getName());
            preparedStatement.setString(2, phongTro.getNumberPhone());
            preparedStatement.setString(3, phongTro.getStartDate());
            preparedStatement.setString(4, phongTro.getDescription());
            preparedStatement.setInt(5, phongTro.getThanhToan());
            preparedStatement.setInt(6, updateId);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
        return rowEffected > 0;
    }

    @Override
    public List<PhongTroDto> search(String name, int thanhToan) {
        List<PhongTroDto> foundPhongTroDtoList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DBConnect.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_DTO);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, thanhToan);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String foundName = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phoneNumber");
                String startDate = resultSet.getString("startDate");
                String description = resultSet.getString("description");
                String foundThanhToan = resultSet.getString("thanhToan");
                foundPhongTroDtoList.add(new PhongTroDto(id , foundName, phoneNumber, startDate, description, foundThanhToan));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return foundPhongTroDtoList;
    }
}
