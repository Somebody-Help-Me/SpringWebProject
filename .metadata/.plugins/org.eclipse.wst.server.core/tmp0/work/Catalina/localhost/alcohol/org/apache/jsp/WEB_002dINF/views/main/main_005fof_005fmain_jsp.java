/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-05-04 00:42:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_005fof_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"author\" content=\"\" />\r\n");
      out.write("<title>인류의 적, 마셔 없애자</title>\r\n");
      out.write("<!-- Favicon-->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\"\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/startbootstrap-agency-gh-pages/assets/logo.jfif\" />\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!-- Font Awesome icons (free version)-->\r\n");
      out.write("<script src=\"https://use.fontawesome.com/releases/v6.3.0/js/all.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- Google fonts-->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/startbootstrap-agency-gh-pages/css/styles.css?ver=1\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("	<!-- Navigation-->\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-dark fixed-top\" id=\"mainNav\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"#page-top\">Alcoholic</a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarResponsive\"\r\n");
      out.write("				aria-controls=\"navbarResponsive\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				Menu <i class=\"fas fa-bars ms-1\"></i>\r\n");
      out.write("			</button>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<!-- Masthead-->\r\n");
      out.write("	<header class=\"masthead\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"masthead-subheading\">\r\n");
      out.write("				<span class=\"text-black\">인류의 적, 마셔 없애자</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"masthead-heading text-uppercase\">\r\n");
      out.write("				<span class=\"text-black\">주 당 들</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<a class=\"btn btn-primary btn-xl text-uppercase\" href=\"main.do\"><span\r\n");
      out.write("				class=\"btn-span\">쇼핑하기</span></a> <a\r\n");
      out.write("				class=\"btn btn-primary btn-xl text-uppercase\" href=\"#services\"><span\r\n");
      out.write("				class=\"btn-span\">구독하기</span></a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- ======= Footer ======= -->\r\n");
      out.write("	<footer id=\"footer\" class=\"footer\">\r\n");
      out.write("		<div class=\"copyright\">\r\n");
      out.write("			&copy; Copyright <strong><span>GoodCheese by\r\n");
      out.write("					NiceAdmin.</span></strong>. All Rights Reserved\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"credits\">\r\n");
      out.write("			<!-- All the links in the footer should remain intact. -->\r\n");
      out.write("			<!-- You can delete the links only if you purchased the pro version. -->\r\n");
      out.write("			<!-- Licensing information: https://bootstrapmade.com/license/ -->\r\n");
      out.write("			<!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->\r\n");
      out.write("			Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Bootstrap core JS-->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<!-- Core theme JS-->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/startbootstrap-agency-gh-pages/js/scripts.js\"></script>\r\n");
      out.write("	");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("	<!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->\r\n");
      out.write("	<!-- * *                               SB Forms JS                               * *-->\r\n");
      out.write("	<!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->\r\n");
      out.write("	<!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->\r\n");
      out.write("	<script src=\"https://cdn.startbootstrap.com/sb-forms-latest.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
