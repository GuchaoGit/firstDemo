package com.guc.firstdemo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.guc.firstdemo")
public class FirstdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstdemoApplication.class, args);
//        String URL="jdbc:mysql://localhost/test?characterEncoding=utf-8&serverTimezone=GMT%2B8";
//                 String USER="root";
//                 String PASSWORD="guc3306";
//                 try{
//                     1.加载驱动程序
//                     Class.forName("com.mysql.cj.jdbc.Driver");
//                     2.获得数据库链接
//                     Connection conn= DriverManager.getConnection(URL, USER, PASSWORD);
//                     3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
//                     Statement st=conn.createStatement();
//                     ResultSet rs=st.executeQuery("select * from `user`");
//                     4.处理数据库的返回结果(使用ResultSet类)
//                     while(rs.next()){
//                         System.out.println(rs.getString("name")+" "
//                                 +rs.getString("password"));
//                     }
//                     关闭资源
//                     rs.close();
//                     st.close();
//                     conn.close();
//                 }catch (Exception e){
//                     e.printStackTrace();
//                 }
//
    }
}
