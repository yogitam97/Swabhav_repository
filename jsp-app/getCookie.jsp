<!DOCTYPE html>
<html>

<body>
    <%
        Cookie cookies[]=request.getCookies();
        if(cookies==null){
            out.println("Cookies expired");
        }else{
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("Color")){
            out.println("<div style=\"background-color:"+cookie.getValue()+"\">This is cookie</div>");
            }
        }
    }
        
        %>
</body>

</html>