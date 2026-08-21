package com.example.lap2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class Lap2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lap2Application.class, args);
	}
	// Trả về chuỗi " Hello spring boot api"
	@GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot API";
    }

	// API nhận tên sinh viên và trả về lời chào
	@GetMapping("/greet")
	public String greet(@RequestParam String name) {
		return "Xin chào " + name;
	}

	// students
	@GetMapping("/students/search")
	public String search(
			@RequestParam String keyword,
			@RequestParam(defaultValue = "1") int page) {
		return "keyword=" + keyword + ", page=" + page;
	}

	// Truyền mã sinh viên, trả về thông tin giả lập
	@GetMapping("/students/{id}")
	public String getStudent(@PathVariable int id) {
		return "Sinh viên có mã: " + id;
	}


	// Trả về JSON Object
	@GetMapping("/student")
    public Student getStudent() {
        // Khởi tạo một đối tượng Student và trả về
        return new Student(1, "Nguyễn Văn A", 20);
    }

	// Trả về danh sách (List)
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "A", 20));
		list.add(new Student(2, "B", 21));
		return list;
	}

}


