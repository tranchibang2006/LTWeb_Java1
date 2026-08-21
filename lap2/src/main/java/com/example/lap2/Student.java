package com.example.lap2;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor có tham số để khởi tạo đối tượng nhanh
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Các hàm Getter là BẮT BUỘC để Spring Boot có thể đọc dữ liệu và chuyển thành JSON
    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }
    
    public String getName() {
         return name; 
        }
    public void setName(String name) { 
        this.name = name; 
    }
    
    public int getAge() {
         return age; 
        }
    public void setAge(int age) {
         this.age = age; 
        }
}