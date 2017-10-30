<%@ page isErrorPage="true" errorPage="error.jsp" %>

<!-- <%@include file="include.html" %>  -->

<%
 application.getInitParameter("GOPI");
 int i = (5-2)/(4-3);
%>

DIRECTIVES
DECLARATIONS
SCRIPTLETS 
EXPRESSION
ACTION 
<!--  COMMENT -->

<jsp:include page="include.html"></jsp:include>

IMPLICT OBJECTS 

application -- ServerletContext
session -- HttpSession
request - HttpServletRequest
response -- HttpServeltResponse
out - Output Stream -- PrintWriter
page -- this
exception -- for error handling
config -- ServletConfig
pageContext  -- environment of the same page....