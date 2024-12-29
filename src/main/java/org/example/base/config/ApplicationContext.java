package org.example.base.config;

import org.example.repository.AdminRepository;
import org.example.repository.AdminRepositoryImpl;
import org.example.service.AdminService;
import org.example.service.AdminServiceImpl;

import java.sql.Connection;

public class ApplicationContext {
    private static Connection CONNECTION;
    private static final AdminRepository ADMINREPOSITORY;
    private static final AdminService ADMINSERVICE;

    static {
        CONNECTION = DatabaseConnection.getConnection();
        ADMINREPOSITORY =new AdminRepositoryImpl(CONNECTION);
        ADMINSERVICE=new AdminServiceImpl(ADMINREPOSITORY);

    }
    public static AdminService getAdminService() {
        return ADMINSERVICE;
    }

}
