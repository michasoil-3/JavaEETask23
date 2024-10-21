<%@ page import="db.DBManager" %>
<%@ page import="models.Article" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String category = request.getParameter("category"); %>
<html>
<head>
    <title>Home</title>
    <%@ include file="links.jsp" %>
    <script>
        console.log("<%=category%>");
    </script>
</head>
<body>
    <%@ include file="navbar.jsp" %>
    <% for (Article article: DBManager.getAllArticles()) { %>
    <% if (category == null || category.isEmpty() || article.getCategory().equals(category)) { %>
    <div class="container mt-2 border border-2 border-secondary bg-info">
        <h3><%=article.getTitle()%></h3>
        <% if (article.getImageUrl() != null) { %>
        <img src="<%=article.getImageUrl()%>" class="img-fluid" alt="Article image hosted on Pexels" width="600px">
        <% } %>
        <p><i><%=article.getContent()%></i></p>
        <h5>Author: <b><%=article.getAuthor()%></b></h5>
        <% if (article.isMisinformation()) { %>
            <span>
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-exclamation-octagon" viewBox="0 0 16 16">
                <path d="M4.54.146A.5.5 0 0 1 4.893 0h6.214a.5.5 0 0 1 .353.146l4.394 4.394a.5.5 0 0 1 .146.353v6.214a.5.5 0 0 1-.146.353l-4.394 4.394a.5.5 0 0 1-.353.146H4.893a.5.5 0 0 1-.353-.146L.146 11.46A.5.5 0 0 1 0 11.107V4.893a.5.5 0 0 1 .146-.353zM5.1 1 1 5.1v5.8L5.1 15h5.8l4.1-4.1V5.1L10.9 1z"></path>
                <path d="M7.002 11a1 1 0 1 1 2 0 1 1 0 0 1-2 0M7.1 4.995a.905.905 0 1 1 1.8 0l-.35 3.507a.552.552 0 0 1-1.1 0z"></path>
            </svg>
            <label class="text-danger"><i>This article has been detected to contain misinformation.</i></label>
        </span>
        <% } %>
    </div>
    <% } %>
    <% } %>
    <div class="container mt-2">
        <p>Image credits go to the following:</p>
        <ul>
            <li>Shane Albuquerque (Pexels)</li>
            <li>Nijat Salamov (Pexels)</li>
            <li>Trinity Kubassek (Pexels)</li>

        </ul>
    </div>
</body>
</html>
