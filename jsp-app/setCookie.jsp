<!DOCTYPE html>
<html>
    <body>
        <%
        Cookie cookie=new Cookie("Color","yellow");
        cookie.setMaxAge(60*60*24*7);
        response.addCookie(cookie);
        out.println(cookie.getName());
        %>
    </body>
</html>