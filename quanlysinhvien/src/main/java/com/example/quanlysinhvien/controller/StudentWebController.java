package com.example.quanlysinhvien.controller;

import com.example.quanlysinhvien.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Chú ý: Đây là @Controller, KHÔNG PHẢI @RestController
public class StudentWebController {

    @Autowired
    private StudentService studentService;

    // Khi gõ http://localhost:8080/giao-dien-sinh-vien trên trình duyệt
    @GetMapping("/giao-dien-sinh-vien")
    public String showStudentPage(Model model) {
        
        // 1. Lấy dữ liệu từ Service (giống hệt cách API làm)
        var students = studentService.search(null); // Lấy tất cả sinh viên
        
        // 2. Nhét dữ liệu vào Model với tên biến là "studentList"
        model.addAttribute("studentList", students);
        
        // 3. Trả về đúng tên file HTML (không cần đuôi .html) nằm trong thư mục templates
        return "students"; 
    }
}
