
<html>

<head>

    <link rel="stylesheet"  type="text/css"  href="style.css">


</head>




<body>
    <%

    HttpSession currentsession= request.getSession(false);
    if(currentsession!=null)
    {
        currentsession.invalidate();
    }
   
        response.sendRedirect("index.html");
    
    
    
    %>
</body>

</html>