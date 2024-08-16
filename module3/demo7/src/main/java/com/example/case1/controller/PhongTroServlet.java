package com.example.case1.controller;

import com.example.case1.dto.PhongTroDto;
import com.example.case1.model.PhongTro;
import com.example.case1.model.ThanhToan;
import com.example.case1.service.IPhongTroService;
import com.example.case1.service.IThanhToanService;
import com.example.case1.service.PhongTroService;
import com.example.case1.service.ThanhToanService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PhongTroServlet" , value = "/phongtro")

public class PhongTroServlet extends HttpServlet {
    private IPhongTroService phongTroService = new PhongTroService();
    private IThanhToanService thanhToanService = new ThanhToanService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "add":
                showAddForm(request, response);
                break;
            case "delete":
                deleteById(request, response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "search":
                search(request,response);
                break;
            case "list":
                showList(request, response);
                break;
            default:
                showList(request, response);
        }
    }

    private void showAddForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ThanhToan> thanhToanList = thanhToanService.getAll();
        request.setAttribute("thanhToanList", thanhToanList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/add.jsp");
        dispatcher.forward(request, response);
    }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int editId = Integer.parseInt(request.getParameter("id"));
        PhongTro phongTro = phongTroService.findById(editId);
        request.setAttribute("phongTro", phongTro);
        List<ThanhToan> thanhToanList = thanhToanService.getAll();
        request.setAttribute("thanhToanList", thanhToanList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/edit.jsp");
        dispatcher.forward(request, response);
    }
    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PhongTroDto> phongTroDtoList = phongTroService.findAllDto();
        request.setAttribute("phongTroDtoList", phongTroDtoList);
        List<ThanhToan> thanhToanList = thanhToanService.getAll();
        request.setAttribute("thanhToanList", thanhToanList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        dispatcher.forward(request,response);
    }
    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchName = request.getParameter("searchName");
        int searchThanhToan = Integer.parseInt(request.getParameter("searchThanhToan"));
        System.out.println(searchName + searchThanhToan);
        List<PhongTroDto> phongTroDtoList = phongTroService.search(searchName, searchThanhToan);
        request.setAttribute("phongTroDtoList", phongTroDtoList);
        List<ThanhToan> thanhToanList = thanhToanService.getAll();
        request.setAttribute("thanhToanList", thanhToanList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        dispatcher.forward(request,response);
    }
    private boolean deleteById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int deleteId = Integer.parseInt(request.getParameter("deleteId"));
        response.sendRedirect("/phongtro?action=list");
        return phongTroService.deleteById(deleteId);
    }

    protected void  doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "add":
                add(request, response);
                break;
            case "delete":
                deleteById(request, response);
                break;
            case "update":
                update(request, response);
                break;
            case "search":
                search(request, response);
                break;
            case "list":
                showList(request, response);
                break;
            default:
                showList(request, response);
        }
    }
    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String phoneNumber = request.getParameter("phoneNumber");
        String startDate = request.getParameter("startDate");
        String description = request.getParameter("description");
        int thanhToan = Integer.parseInt(request.getParameter("thanhToan"));
        boolean isOK = phongTroService.update(new PhongTro(id, name, phoneNumber, startDate, description, thanhToan));
        String message = isOK?"OK":"NOTOK";
        response.sendRedirect("/phongtro?action=list&mess=" + message);
    }
    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String phoneNumber = request.getParameter("phoneNumber");
        String startDate = request.getParameter("startDate");
        String description = request.getParameter("description");
        int thanhToan = Integer.parseInt(request.getParameter("thanhToan"));
        boolean isOK = phongTroService.add(new PhongTro(name , phoneNumber , startDate , description , thanhToan));
        String message = isOK?"OK":"NOTOK";
        response.sendRedirect("/phongtro?action=list&mess=" + message);
    }
}

