<% String username=request.getParameter("name");
    String pass=request.getParameter("password");
    if(username.equals("admin") && pass.equals("admin")){
        out.println("<h3>Authentication successfull "+username+"</h3>");
    }
    else{
        out.println("<h3>Authentication failed!!<a href='login.html'>Login</a></h3>");
    }
    %>