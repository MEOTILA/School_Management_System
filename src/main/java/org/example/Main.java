package org.example;

import org.example.base.config.ApplicationContext;
import org.example.entity.Admin;
import org.example.repository.AdminRepository;
import org.example.service.AdminService;
import org.example.service.AdminServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AdminService adminService= ApplicationContext.getAdminService();
        Admin admin=new Admin();
        admin.setFirstName("Shari");
        admin.setLastName("Yahyaei");
        adminService.save(admin);


    }
}