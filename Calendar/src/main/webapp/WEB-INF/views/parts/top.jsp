<!DOCTYPE html>
<!--[if IE 8]>         <html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width" />
  <title>Group Calendar</title>

  <!-- If you are using CSS version, only link these 2 files, you may add app.css to use for your overrides if you like. -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/foundation/css/normalize.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/foundation/css/foundation.css" />

  <script src="${pageContext.request.contextPath}/resources/foundation/js/vendor/custom.modernizr.js"></script>
  
  <!-- body content here -->

  <script>
  document.write('<script src=' +
  ('__proto__' in {} ? '${pageContext.request.contextPath}/resources/foundation/js/vendor/zepto' : '${pageContext.request.contextPath}/resources/foundation/js/vendor/jquery') +
  '.js><\/script>')
  </script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.alerts.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.clearing.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.cookie.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.dropdown.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.forms.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.joyride.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.magellan.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.orbit.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.placeholder.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.reveal.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.section.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.tooltips.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.topbar.js"></script>
  <script src="${pageContext.request.contextPath}/resources/foundation/js/foundation/foundation.interchange.js"></script>
  <script>
    $(document).foundation();
  </script>

</head>
<body>
<nav class="top-bar">
  <ul class="title-area">
    <li class="name"><h1><a href="#nogo">Group Calendar</a></h1></li>
  </ul>
  
  <section class="top-bar-section">
    <ul class="right">
    	<li><a href="<%=request.getContextPath()%>/user/login">Login</a></li>
    </ul>
  </section>
</nav>