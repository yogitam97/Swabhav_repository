<!DOCTYPE html>
<html>

<body>
    <%
      
        if(session.getAttribute("count")==null){
            session.setAttribute("count",0);
        }
        Object oldValue=session.getAttribute("count");
        int old=(int)oldValue;
        int newValue=old+1;
        session.setAttribute("count",newValue);
            
        out.println("<h3>Old value:"+old+"</h3>");
        
        out.println("<h3>New value:"+newValue+"</h3>");
        out.println(session.getId());
      
        %>
        <a href="summary-app/summary.jsp">Check summary here</a>
</body>

</html>