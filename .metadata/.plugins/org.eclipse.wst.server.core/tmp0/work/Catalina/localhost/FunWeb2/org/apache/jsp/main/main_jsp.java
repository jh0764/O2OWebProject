/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.76
 * Generated at: 2022-05-23 08:40:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>member/main.jsp</title>\r\n");
      out.write("<link href=\"../css/default.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"../css/front.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"http://ie7-js.googlecode.com/svn/version/2.1(beta4)/IE9.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"http://ie7-js.googlecode.com/svn/version/2.1(beta4)/ie7-squish.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write(" <script src=\"../script/DD_belatedPNG_0.0.8a.js\"></script>\r\n");
      out.write(" <script>\r\n");
      out.write("   /* EXAMPLE */\r\n");
      out.write("   DD_belatedPNG.fix('#wrap');\r\n");
      out.write("   DD_belatedPNG.fix('#main_img');   \r\n");
      out.write("\r\n");
      out.write(" </script>\r\n");
      out.write(" <![endif]--> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("<!-- 헤더파일들어가는 곳 -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/top.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- 헤더파일들어가는 곳 -->\r\n");
      out.write("<!-- 메인이미지 들어가는곳 -->\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("<div id=\"main_img\"><img src=\"../images/main_img.jpg\"\r\n");
      out.write(" width=\"971\" height=\"282\"></div>\r\n");
      out.write("<!-- 메인이미지 들어가는곳 -->\r\n");
      out.write("<!-- 메인 콘텐츠 들어가는 곳 -->\r\n");
      out.write("<article id=\"front\">\r\n");
      out.write("<div id=\"solution\">\r\n");
      out.write("<div id=\"hosting\">\r\n");
      out.write("<h3>Web Hosting Solution</h3>\r\n");
      out.write("<p>Lorem impsun Lorem impsunLorem impsunLorem\r\n");
      out.write(" impsunLorem impsunLorem impsunLorem impsunLorem\r\n");
      out.write("  impsunLorem impsunLorem impsun....</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"security\">\r\n");
      out.write("<h3>Web Security Solution</h3>\r\n");
      out.write("<p>Lorem impsun Lorem impsunLorem impsunLorem\r\n");
      out.write(" impsunLorem impsunLorem impsunLorem impsunLorem\r\n");
      out.write("  impsunLorem impsunLorem impsun....</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"payment\">\r\n");
      out.write("<h3>Web Payment Solution</h3>\r\n");
      out.write("<p>Lorem impsun Lorem impsunLorem impsunLorem\r\n");
      out.write(" impsunLorem impsunLorem impsunLorem impsunLorem\r\n");
      out.write("  impsunLorem impsunLorem impsun....</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("<div id=\"sec_news\">\r\n");
      out.write("<h3><span class=\"orange\">Security</span> News</h3>\r\n");
      out.write("<dl>\r\n");
      out.write("<dt>Vivamus id ligula....</dt>\r\n");
      out.write("<dd>Proin quis ante Proin quis anteProin \r\n");
      out.write("quis anteProin quis anteProin quis anteProin \r\n");
      out.write("quis ante......</dd>\r\n");
      out.write("</dl>\r\n");
      out.write("<dl>\r\n");
      out.write("<dt>Vivamus id ligula....</dt>\r\n");
      out.write("<dd>Proin quis ante Proin quis anteProin \r\n");
      out.write("quis anteProin quis anteProin quis anteProin \r\n");
      out.write("quis ante......</dd>\r\n");
      out.write("</dl>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"news_notice\">\r\n");
      out.write("<h3 class=\"brown\">News &amp; Notice</h3>\r\n");
      out.write("<table>\r\n");
      out.write("<tr><td class=\"contxt\"><a href=\"#\">Vivans....</a></td>\r\n");
      out.write("    <td>2012.11.02</td></tr>\r\n");
      out.write("<tr><td class=\"contxt\"><a href=\"#\">Vivans....</a></td>\r\n");
      out.write("    <td>2012.11.02</td></tr>\r\n");
      out.write("<tr><td class=\"contxt\"><a href=\"#\">Vivans....</a></td>\r\n");
      out.write("    <td>2012.11.02</td></tr>\r\n");
      out.write("<tr><td class=\"contxt\"><a href=\"#\">Vivans....</a></td>\r\n");
      out.write("    <td>2012.11.02</td></tr>\r\n");
      out.write("<tr><td class=\"contxt\"><a href=\"#\">Vivans....</a></td>\r\n");
      out.write("    <td>2012.11.02</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</article>\r\n");
      out.write("<!-- 메인 콘텐츠 들어가는 곳 -->\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("<!-- 푸터 들어가는 곳 -->\r\n");
      out.write("<footer>\r\n");
      out.write("<hr>\r\n");
      out.write("<div id=\"copy\">All contents Copyright 2011 FunWeb 2011 FunWeb \r\n");
      out.write("Inc. all rights reserved<br>\r\n");
      out.write("Contact mail:funweb@funwebbiz.com Tel +82 64 123 4315\r\n");
      out.write("Fax +82 64 123 4321</div>\r\n");
      out.write("<div id=\"social\"><img src=\"../images/facebook.gif\" width=\"33\" \r\n");
      out.write("height=\"33\" alt=\"Facebook\">\r\n");
      out.write("<img src=\"../images/twitter.gif\" width=\"34\" height=\"34\"\r\n");
      out.write("alt=\"Twitter\"></div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- 푸터 들어가는 곳 -->\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
