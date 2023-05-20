<%-- 
    Document   : Prueba
    Created on : 12 may. 2023, 17:33:46
    Author     : ShuKalx
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    <option name="ControlAdministrador">Select</option>
    
    <%
        try{
          Class.forName("com.mysql.jdbc.Driver");  
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/proyintegrador?user=root&password=");
          Statement st = con.createStatement();
          String query = "select*from administrador";
          
          ResultSet rs=st.executeQuery(query);
          
          while(rs.next()){
           %>
           <option><%=rs.getString("usu")%></option>
           <%
        }        
        }catch(ClassNotFoundException e){ 
        
    %>   
    </body>
</html>
