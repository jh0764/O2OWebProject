/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.76
 * Generated at: 2022-05-17 07:57:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.center;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import comment.CommentDTO;
import comment.CommentDAO;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import board.BoardDTO;
import board.BoardDAO;

public final class noticeSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("board.BoardDAO");
    _jspx_imports_classes.add("comment.CommentDAO");
    _jspx_imports_classes.add("board.BoardDTO");
    _jspx_imports_classes.add("comment.CommentDTO");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.text.DateFormat");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>center/noticeSearch.jsp</title>\r\n");
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
      out.write("<div id=\"wrap\">\r\n");
      out.write("<!-- 헤더들어가는 곳 -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/top.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- 헤더들어가는 곳 -->\r\n");
      out.write("<!-- 본문들어가는 곳 -->\r\n");
      out.write("<!-- 메인이미지 -->\r\n");
      out.write("<div id=\"sub_img_center\"></div>\r\n");
      out.write("<!-- 메인이미지 -->\r\n");
      out.write("\r\n");
      out.write("<!-- 왼쪽메뉴 -->\r\n");
      out.write("<nav id=\"sub_menu\">\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a href=\"../center/notice.jsp\">Notice</a></li>\r\n");
      out.write("<li><a href=\"#\">Public News</a></li>\r\n");
      out.write("<li><a href=\"../fcenter/fnotice.jsp\">Driver Download</a></li>\r\n");
      out.write("<li><a href=\"#\">Service Policy</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- 왼쪽메뉴 -->\r\n");

request.setCharacterEncoding("utf-8");
String search = request.getParameter("search");
String ns = request.getParameter("ns");
if(search==null || search.equals("")){
	
      out.write("<script type=\"text/javascript\"> \r\n");
      out.write("	\r\n");
      out.write("	alert(\"검색내용을 입력해주세요\");\r\n");
      out.write("	history.back();\r\n");
      out.write("	\r\n");
      out.write("	</script>");
 
}
CommentDAO commentDAO = new CommentDAO();
CommentDTO commetDTO;

BoardDAO boardDAO = new BoardDAO();


// 모든형을 배열에 저장 => 업캐스팅 데이터 저장

// 한페이지에 보여줄 글개수 지정
int pageSize=10;
int pageSizeR=5;
// 페이지 번호 가져오기

String pageNum = request.getParameter("pageNum");

//페이지 번호가 없으면 "1"페이지 지정
if(pageNum == null) {
	pageNum="1";
}

// pageNum pageSize 조합해서 => startRow 시작하는 행번호  => 식(알고리즘)
// PageNum => 문자열 정수형 변경
int currentPage = Integer.parseInt(pageNum);

// pageNum pageSize => startRow
// 1		10		=>	 	=> (1-1) * 10 + 1=> 0 + 1=>1
// 2		10		=>		=> (2-1) * 10 + 1=> 10 + 1=>11
// 3		10		=>		=> (3-1) * 10 + 1=> 20 + 1=>21
int startRow = (currentPage - 1) * pageSize + 1;

//startRow pageSize 조합해서 => endRow 끝나는 행번호 구하기
// 	1		10					10
//	11		10					20
//	21		10					30

int endRow = startRow + pageSize - 1;

// List boardList=boardDAO.getBoardList();

//BoardDTO형만 배열에 저장
// List<BoardDTO> boardList=boardDAO.getBoardList(startRow, pageSize);
List<BoardDTO> searchList=boardDAO.getSearchList(ns, search, startRow, pageSize);

// 날짜 => 문자열(원하는 포맷) 변경
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

      out.write("\r\n");
      out.write("<!-- 게시판 -->\r\n");
      out.write("<article>\r\n");
      out.write("<h1>게시물</h1>\r\n");
      out.write("<table id=\"notice\">\r\n");
      out.write("<tr><th class=\"tno\">No.</th>\r\n");
      out.write("    <th class=\"ttitle\">Title</th>\r\n");
      out.write("    <th class=\"twrite\" style=\"font-size: 8pt\">작성자</th>\r\n");
      out.write("    <th class=\"tdate\" style=\"font-size: 8pt\">작성날짜</th>\r\n");
      out.write("    <th class=\"tread\" style=\"font-size: 8pt\" >조회수</th>\r\n");
      out.write("    <th class=\"tread\" style=\"font-size: 8pt\" >추천수</tr>\r\n");
      out.write("    ");
int countComment;
    for(int i = 0; i < searchList.size(); i++){
    	// 배열 한칸 데이터 가져올때 get()
    	BoardDTO boardDTO = searchList.get(i);
      out.write("\r\n");
      out.write("    	<tr onclick=\"location.href='content.jsp?num=");
      out.print(boardDTO.getNum());
      out.write("'\" style=\"cursor: pointer;\"><td>");
      out.print( boardDTO.getNum());
      out.write("</td>\r\n");
      out.write("    	 ");
countComment = commentDAO.getCommentCount(boardDTO.getNum());
      out.write("\r\n");
      out.write("    	<td class=\"left\">");
      out.print( boardDTO.getSubject());
      out.write(' ');
      out.write('(');
      out.print(countComment);
      out.write(")</td>\r\n");
      out.write("        <td>");
      out.print(boardDTO.getName());
      out.write("</td><td>");
      out.print(dateFormat.format(boardDTO.getDate()));
      out.write("</td><td>");
      out.print( boardDTO.getReadcount());
      out.write("</td>\r\n");
      out.write("        <td style=\"color: red;\">");
      out.print(boardDTO.getRecommend() );
      out.write("</td></tr>\r\n");
      out.write("        \r\n");
      out.write("   ");
 countComment = 0;}
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"searchPro.jsp\">\r\n");
      out.write("<form action=\"noticeSearch.jsp\" method=\"get\">\r\n");
      out.write("<select name=\"ns\">\r\n");
      out.write("	<option value=\"subject\">제목</option>\r\n");
      out.write("	<option value=\"name\">작성자</option>\r\n");
      out.write("	<option value=\"content\">내용</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"text\" name=\"search\" class=\"input_box\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.search}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<input type=\"submit\" value=\"글검색\" class=\"btn\" style=\"cursor: pointer;\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");

String id = (String)session.getAttribute("id");
if (id != null) {

      out.write("\r\n");
      out.write("<input type=\"button\" value=\"글쓰기\" class=\"btn\" onclick=\"location.href='write.jsp'\" style=\"cursor: pointer; float: left;\">\r\n");
} 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("<div id=\"page_control\">\r\n");

// 1 ~ 10 11~ 20 페이지번호 구하기
// 한화면 보여줄 페이지개수 설정
int pageBlock=3;

//시작하는 페이지 번호
// pageNum(currentPage) pageBlock => startPage
// 		1~10(0~9)			10		=>	0*10 + 1 => 1
//		11~20(10~19)		10		=>	1*10 + 1 =>11
//		21~30(20~29)		10		=>	2*10 + 1 =>21
int startPage = (currentPage-1) / pageBlock * pageBlock+1; 
//끝나는 페이지 번호
int endPage = startPage + pageSize - 1;



// 구한 끝나는 페이지번호 10, 실제 페이지 번호 2
// 글개수 구하기

// 전체페이지 개수 구하기 글개수 50 , 한화면에 보여줄 글개수 10 => 페이지개수 5 + 0 => 5
// 전체페이지 개수 구하기 글개수 50 , 한화면에 보여줄 글개수 10 => 페이지개수 5 + 1 => 6
// int PageCount=글개수/pageSize + (글개수%pageSize==0?0:1);
int count = boardDAO.getboardCount();

int pageCount = count/pageSize + (count%pageSize==0?0:1);
if(endPage > pageCount){
	endPage=pageCount;
	}

      out.write("\r\n");
      out.write("\r\n");

if(startPage > pageBlock){
	
      out.write("\r\n");
      out.write("	<a href=\"noticeSearch.jsp?pageNum=");
      out.print(startPage-pageBlock);
      out.write("&ns=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ns}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&search=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.search}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Prev</a>\r\n");
      out.write("	");

}

      out.write('\r');
      out.write('\n');
for(int i=startPage; i<=endPage; i++) {


      out.write("\r\n");
      out.write("<a href=\"noticeSearch.jsp?pageNum=");
      out.print(i);
      out.write("&ns=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ns}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&search=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.search}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a>\r\n");


}

      out.write('\r');
      out.write('\n');
 if(endPage < pageCount){

      out.write("\r\n");
      out.write("<a href=\"noticeSearch.jsp?pageNum=");
      out.print(startPage+pageBlock);
      out.write("&ns=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ns}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&search=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.search}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Next</a>\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</article>\r\n");
      out.write("<!-- 게시판 -->\r\n");
      out.write("<!-- 본문들어가는 곳 -->\r\n");
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
