<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%
    String[] messages = (String[]) request.getAttribute("welcomeMessages");
    String welcomeMessage = "";

    for (String message : messages) {
        welcomeMessage += message + " ";
    }

    out.print(welcomeMessage);
%>
</body>
</html>
