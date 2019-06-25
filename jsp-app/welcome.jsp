<!DOCTYPE html>
<html>
    <body>
        <%String developer=request.getParameter("developer");
        
       
        for(int i=1;i<=10;i++){
            out.println("<h3>Developer : "+developer+"</h3>");
            out.println("<h1> Hello </h1>");
        }
    
    
        %>
    </body>
</html>