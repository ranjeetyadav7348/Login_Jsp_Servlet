<html>

<head>

    <link rel="stylesheet" type="text/css" href="style.css">

</head>

<% 
    HttpSession session1 = request.getSession(false);

    if (session1 != null && session1.getAttribute("username") != null) {
        String us = (String) session1.getAttribute("username");
%>

<body>
    <div class="container">
        <h1>Welcome, <%= us %>!</h1>
        <p>We're delighted to have you on our platform. 🌟</p>
        <h3>Explore, learn, and connect with our vibrant community! 🚀</h3>
        <p>Feel free to stay as long as you like, and when you're ready,</p> 
        <p>you can <a href="logout.jsp">LOGOUT</a> securely.</p>
    </div>
</body>

<%  
    } else {
        response.sendRedirect("login.jsp");
    }
%>

</html>
