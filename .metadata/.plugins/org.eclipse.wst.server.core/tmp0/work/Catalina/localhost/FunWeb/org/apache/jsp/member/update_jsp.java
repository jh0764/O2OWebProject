/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.76
 * Generated at: 2022-05-18 01:18:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.MemberDTO;
import member.MemberDAO;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.MemberDAO");
    _jspx_imports_classes.add("member.MemberDTO");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>member/update.jsp</title>\r\n");
      out.write("<link href=\"../css/default.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"../css/subpage.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"http://ie7-js.googlecode.com/svn/version/2.1(beta4)/IE9.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"http://ie7-js.googlecode.com/svn/version/2.1(beta4)/ie7-squish.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write(" <script src=\"../script/DD_belatedPNG_0.0.8a.js\"></script>\r\n");
      out.write(" <script>\r\n");
      out.write("   /* EXAMPLE */\r\n");
      out.write("   DD_belatedPNG.fix('#wrap');\r\n");
      out.write("   DD_belatedPNG.fix('#main_img');   \r\n");
      out.write("\r\n");
      out.write(" </script>\r\n");
      out.write(" <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../script/jquery-3.6.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("	$('#idcheck').click(function(){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url:'joinIdCheck2.jsp',\r\n");
      out.write("			data:{'id':$('#id').val()},\r\n");
      out.write("			success:function(rdata){\r\n");
      out.write("				// id=\"iddiv\"에 들고온 데이터 rdata를 넣기\r\n");
      out.write("				$('#duplicateId').html(rdata);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	//id=\"join\" submit() 이벤트\r\n");
      out.write("	\r\n");
      out.write("	$('#join').submit(function(){\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		if($('#id').val()==\"\"){\r\n");
      out.write("			alert(\"아이디 입력하세요\");\r\n");
      out.write("			$('#id').focus();\r\n");
      out.write("			return false;\r\n");
      out.write("			}\r\n");
      out.write("		if($('#Pass').val()==\"\"){\r\n");
      out.write("		alert(\"비밀번호 입력하세요\");\r\n");
      out.write("		$('#Pass').focus();\r\n");
      out.write("		return false;\r\n");
      out.write("		}\r\n");
      out.write("		if($('#Pass2').val()==\"\"){\r\n");
      out.write("		alert(\"비밀번호 확인 입력하세요\");\r\n");
      out.write("		$('#Pass2').focus();\r\n");
      out.write("		return false;\r\n");
      out.write("		}\r\n");
      out.write("		if($('#email').val()==\"\"){\r\n");
      out.write("			alert(\"이메일 입력하세요\");\r\n");
      out.write("			$('#email').focus();\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		if($('#name').val()==\"\"){\r\n");
      out.write("			alert(\"이름 입력하세요\");\r\n");
      out.write("			$('#name').focus();\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		if($('#Pass').val()!=$('#Pass2').val()){\r\n");
      out.write("			alert(\"비밀번호가 일치하지 않습니다\");\r\n");
      out.write("			$('#Pass').focus();\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("	\r\n");
      out.write("	function fn_Checkaddr() {\r\n");
      out.write("		new daum.Postcode(\r\n");
      out.write("				{\r\n");
      out.write("					oncomplete : function(data) {\r\n");
      out.write("						// 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("\r\n");
      out.write("						// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("\r\n");
      out.write("						var fullAddr = ''; // 최종 주소 변수\r\n");
      out.write("\r\n");
      out.write("						var extraAddr = ''; // 조합형 주소 변수\r\n");
      out.write("\r\n");
      out.write("						// 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("\r\n");
      out.write("						if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("\r\n");
      out.write("							fullAddr = data.roadAddress;\r\n");
      out.write("\r\n");
      out.write("						} else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("\r\n");
      out.write("							fullAddr = data.jibunAddress;\r\n");
      out.write("\r\n");
      out.write("						}\r\n");
      out.write("\r\n");
      out.write("						// 사용자가 선택한 주소가 도로명 타입일때 조합한다.\r\n");
      out.write("\r\n");
      out.write("						if (data.userSelectedType === 'R') {\r\n");
      out.write("\r\n");
      out.write("							//법정동명이 있을 경우 추가한다.\r\n");
      out.write("\r\n");
      out.write("							if (data.bname !== '') {\r\n");
      out.write("\r\n");
      out.write("								extraAddr += data.bname;\r\n");
      out.write("\r\n");
      out.write("							}\r\n");
      out.write("\r\n");
      out.write("							// 건물명이 있을 경우 추가한다.\r\n");
      out.write("\r\n");
      out.write("							if (data.buildingName !== '') {\r\n");
      out.write("\r\n");
      out.write("								extraAddr += (extraAddr !== '' ? ', '\r\n");
      out.write("										+ data.buildingName : data.buildingName);\r\n");
      out.write("\r\n");
      out.write("							}\r\n");
      out.write("\r\n");
      out.write("							// 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.\r\n");
      out.write("\r\n");
      out.write("							fullAddr += (extraAddr !== '' ? ' (' + extraAddr\r\n");
      out.write("									+ ')' : '');\r\n");
      out.write("\r\n");
      out.write("						}\r\n");
      out.write("\r\n");
      out.write("						// 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("\r\n");
      out.write("						document.getElementById('addr1').value = data.zonecode + fullAddr; //5자리 새우편번호 사용\r\n");
      out.write("\r\n");
      out.write("						document.getElementById('addr2').focus();\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("					}\r\n");
      out.write("				}).open();\r\n");
      out.write("		window.close();\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("<!-- 헤더들어가는 곳 -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/top.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- 헤더들어가는 곳 -->\r\n");
      out.write("\r\n");
      out.write("<!-- 본문들어가는 곳 -->\r\n");
      out.write("<!-- 본문메인이미지 -->\r\n");
      out.write("<div id=\"sub_img_member\"></div>\r\n");
      out.write("<!-- 본문메인이미지 -->\r\n");
      out.write("<!-- 왼쪽메뉴 -->\r\n");
      out.write("<nav id=\"sub_menu\">\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a href=\"#\">Join us</a></li>\r\n");
      out.write("<li><a href=\"#\">Privacy policy</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- 왼쪽메뉴 -->\r\n");
      out.write("<!-- 본문내용 -->\r\n");

String id = (String)session.getAttribute("id");
out.print(id);
MemberDAO memberDAO = new MemberDAO();

MemberDTO memberDTO = memberDAO.getMember(id);

      out.write("\r\n");
      out.write("<article>\r\n");
      out.write("<h1>회원가입</h1>\r\n");
      out.write("<form action=\"updatePro.jsp\" name=\"fr\" id=\"join\" method=\"post\">\r\n");
      out.write("<fieldset>\r\n");
      out.write("<legend>기본정보</legend>\r\n");
      out.write("<label>ID</label>\r\n");
      out.write("<input type=\"text\" name=\"id\" id=\"id\" class=\"id\" value=\"");
      out.print(memberDTO.getId());
      out.write("\">\r\n");
      out.write("<input type=\"button\" value=\"중복확인\" id=\"idcheck\" class=\"dup\"  style=\"cursor: pointer;\"><br>\r\n");
      out.write("<div id=\"duplicateId\"></div>\r\n");
      out.write("<label>비밀번호 변경</label>\r\n");
      out.write("<input type=\"password\" name=\"pass\" id=\"Pass\"><br>\r\n");
      out.write("<label>비밀번호 확인</label>\r\n");
      out.write("<input type=\"password\" name=\"pass2\" id=\"Pass2\"><br>\r\n");
      out.write("<label>이름</label>\r\n");
      out.write("<input type=\"text\" name=\"name\" value=\"");
      out.print(memberDTO.getName());
      out.write("\"><br>\r\n");
      out.write("<label>E-Mail</label>\r\n");
      out.write("<input type=\"email\" name=\"email\" value=\"");
      out.print(memberDTO.getEmail());
      out.write("\"><br>\r\n");
      out.write("</fieldset>\r\n");
      out.write("\r\n");
      out.write("<fieldset>\r\n");
      out.write("<legend>선택정보</legend>\r\n");
      out.write("<label>주소</label>\r\n");
      out.write("<input type=\"text\" name=\"address\" value=\"");
      out.print(memberDTO.getAddress());
      out.write("\" id=\"addr1\" >\r\n");
      out.write("<input type=\"button\" value=\"주소검색\" class=\"dup\"  onclick=\"fn_Checkaddr()\" style=\"cursor: pointer;\"><br>\r\n");
      out.write("<label>상세주소</label>\r\n");
      out.write("<input type=\"text\" value=\"address2\" id=\"addr1\" ><br>\r\n");
      out.write("<label>집전화</label>\r\n");
      out.write("<input type=\"text\" name=\"phone\" value=\"");
      out.print(memberDTO.getPhone());
      out.write("\"><br>\r\n");
      out.write("<label>개인번호</label>\r\n");
      out.write("<input type=\"text\" name=\"mobile\" value=\"");
      out.print(memberDTO.getMobile());
      out.write("\"><br>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("<div id=\"buttons\">\r\n");
      out.write("<input type=\"submit\" value=\"회원정보수정\" class=\"submit\" style=\"cursor: pointer;\">\r\n");
      out.write("<input type=\"reset\" value=\"취소\" class=\"cancel\" style=\"cursor: pointer;\">\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</article>\r\n");
      out.write("<!-- 본문내용 -->\r\n");
      out.write("<!-- 본문들어가는 곳 -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("<!-- 푸터들어가는 곳 -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/bottom.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- 푸터들어가는 곳 -->\r\n");
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
