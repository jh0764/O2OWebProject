<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko-KR">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <meta http-equiv="X-UA-Compatible" content="ie=edge">

  <meta name="copyright" content="MACode ID, https://macodeid.com/">
  
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  
  <!--   구글폰트(버튼) -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding:wght@700&display=swap" rel="stylesheet">

  <title>MaRoo</title>

  <link rel="stylesheet" href="../resources/css/maicons.css">

  <link rel="stylesheet" href="../resources/css/bootstrap.css">

  <link rel="stylesheet" href="../resources/vendor/animate/animate.css">

  <link rel="stylesheet" href="../resources/css/theme.css">
  
  <!-- 부트스트랩  -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  
<style type="text/css">
  
li {
	list-style: none;
}  
  

  
/* nav */
.search {
  position: relative;
  width: 300px;
  left: 5px;
  
}

input {
  width: 100%;
  border: 1px solid #bbb;
  border-radius: 8px;
  padding: 10px 12px;
  font-size: 12px;
}
input:focus{
	outline:1px solid #FFCD4A;
}
  
#img1 {
  position : absolute;
  width: 17px;
  top: 10px;
  right: 7px;
  margin: 0;
  
}  

/* 마루 사이즈 */
header img {
  width: 150px;
  margin-bottom: 5px;
}
  
/* 버튼 */

.button-55 {
  align-self: center;
  background-color: #fff;
  background-image: none;
  background-position: 0 90%;
  background-repeat: repeat no-repeat;
  background-size: 4px 3px;
  border-radius: 15px 225px 255px 15px 15px 255px 225px 15px;
  border-style: solid;
  border-width: 2px;
  box-shadow: rgba(0, 0, 0, .2) 15px 28px 25px -18px;
  box-sizing: border-box;
  color: #FFCD4A;
  cursor: pointer;
  display: inline-block;
  font-family: Neucha, sans-serif;
  font-size: 1rem;
  line-height: 23px;
  outline: none;
  padding: .75rem;
  text-decoration: none;
  transition: all 235ms ease-in-out;
  border-bottom-left-radius: 15px 255px;
  border-bottom-right-radius: 225px 15px;
  border-top-left-radius: 255px 15px;
  border-top-right-radius: 15px 225px;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
  
}

.button-55:hover {
  box-shadow: rgba(0, 0, 0, .3) 2px 8px 8px -5px;
  transform: translate3d(0, 2px, 0);
  
}

}
.button-55:focus {
  box-shadow: rgba(0, 0, 0, .3) 2px 8px 4px -6px;
  
} 

 
table {
  border-spacing: 80px;
  border-collapse: separate;
}

table td {
  width: 500px;
  height: 200px;
  padding: 5px -9px;
}


.cell_padding {
	padding : 3em 1em;
}

.service{
	background-image: url("https://dmmj3ljielax6.cloudfront.net/upload/service/73756793-16d5-4884-977b-0fceb355e571.jpg");
    background-size: cover;
    background-position: 50% 50%;
    position: relative;
    height: 20rem;
    z-index: 1;
} 

.contents {
	position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
    width: 100%;
    max-width: 43.75rem;
    text-align: center;
    padding: 0 1rem;
}

.page-footer .bg-image {
 	width: 1250px;
 	height: 390px;
}

/* 카드*/

.request-card {
    padding: 1rem;
    border: 0.0625rem solid #e1e1e1;
    border-radius: 4px;
    height: 15.5rem;
    display: flex;
    flex-direction: column;
    width: 350px;
}

.request-card-header {
	color: #323232;
    margin-bottom: 0;
    font-size: 20px;
    font-weight: 700;
}

.request-card-body {
    margin-top: 1rem;
}

.btn-update{
	font-weight: 500;
	text-align: center;
    vertical-align: middle;
    font-size: 1rem;
    line-height: 1.5;
    border: 0.0625rem solid transparent;
    border-radius: 0.25rem;
    display: block;
    width: 100%;
    background-color: #FFCD4A;
    margin: -76px 10px 16px 0px;
}

.btn-cancle{
     font-weight: 500;
     text-align: center;
     vertical-align: middle;
     font-size: 1rem;
     line-height: 1.5;
     border: 0.0625rem solid transparent;
     border-radius: 0.25rem;
     display: block;
     width: 100%;
     background-color: #FEEBB6;
     margin: -12px -36px 87px 0px;
     height: 46px;
 }

/*  푸터  */
.callnumber{
    padding-bottom: 0.1875rem;
    font-size: 1.25rem;
    font-weight: 500;
    font-stretch: normal;
    color: #FFCD4A;
 }
.callnumberdown{
    margin: 0;
    font-size: .875rem;
    line-height: normal;
    letter-spacing: normal;
    color: #737373;
}
#footermenu1{
    margin: 0;
    font-size: .875rem;
    line-height: normal;
    letter-spacing: normal;
    color: #737373;
    position: absolute;
    bottom:49px;
}
#footermenu2{
	margin: 0;
    font-size: .875rem;
    line-height: normal;
    letter-spacing: normal;
    color: #737373;
    
}
#footermenu3{
	margin: 0;
    font-size: .875rem;
    line-height: normal;
    letter-spacing: normal;
    color: #737373;
    
}  
 
.page-footer {
width: 100%; bottom:0;
}
</style>
  

  
</head>
<body>




  <!-- Back to top button -->
  <div class="back-to-top"></div>
  
  <header>
    <c:catch>
<c:choose>
<c:when test="${ empty sessionScope.id }">

<nav class="navbar navbar-expand-lg navbar-light bg-white sticky" data-offset="500">
      <div class="container">
        <a href="<%=request.getContextPath() %>/" class="navbar-brand"><img id="logo1" src="<%=request.getContextPath() %>/resources/img/logo1.jpg" ></a>

        <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="navbar-collapse collapse" id="navbarContent">
           
           <!--search바  -->
           <div class="search">
              <input type="text" placeholder="어떤 서비스가 필요하세요?">
              <img id="img1" src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png">
            </div>
            
          <ul class="navbar-nav ml-auto">
            
            <li class="nav-item">
              <a class="nav-link" href="about.html">고수찾기</a>
            </li>  
            <li class="nav-item active">
              <a class="nav-link" href="<%=request.getContextPath() %>/member/login">로그인</a>
            </li>
            <li class="nav-item">
              <button class="button-55" role="button" onclick="location.href='<%=request.getContextPath() %>/member/insert'">회원가입</button>
            </li>
          </ul>
        </div>

      </div>
    </nav>
</c:when>
<c:otherwise>
    	<nav class="navbar navbar-expand-lg navbar-light bg-white sticky" data-offset="500">
        <div class="container">
          <a href="<%=request.getContextPath() %>/" class="navbar-brand"><img id="logo1" src="<%=request.getContextPath() %>/resources/img/logo1.jpg" ></a>

          <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="navbar-collapse collapse" id="navbarContent">
             
             <!--search바  -->
             <div class="search">
                <input type="text" placeholder="어떤 서비스가 필요하세요?">
                <img id="img1" src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png">
              </div>
              
            <ul class="navbar-nav ml-auto">
              
              <li class="nav-item">
                <a class="nav-link" href="about.html">고수찾기</a>
              </li>  
              <li class="nav-item active">
                <a class="nav-link" href="<%=request.getContextPath() %>/mypage/info">마이페이지</a>
              </li>
              <li class="nav-item">
                <button class="button-55" role="button" onclick="location.href='<%=request.getContextPath() %>/member/logout'">로그아웃</button>
              </li>
            </ul>
          </div>

        </div>
      </nav>
</c:otherwise>
</c:choose>
</c:catch>
  </header>

  <input type="hidden" name="id" value="${sessionScope.id }">
  <input type="hidden" name="email" value="${memberDTO.email }">
  <input type="hidden" name="password" value="${memberDTO.password }">


<div class="container">
    <span><h3 style="margin-top: 100px; margin-left: 80px;"><b>받은 견적</b></h3></span>
<table>
<tr>
	<c:forEach var="i" begin="0" end="${getProEstimateDTO.size() - 1}" step="1">
<td>
	<form class="request-card" action="<%=request.getContextPath() %>/requests/estimate"  method="get">
		<div class="request-card-header">${getProEstimateDTO.get(i).get(0).service_name }</div>
		<div class="request-card-body">

			<div style="height: 70px;">${date.get(i)}</div>
            <button type="button" class="btn-cancle">취소하기</button>
            <input type="submit" class="btn-update" value="자세히 보기">
		</div>
		  <input type="hidden" name="estimates_id" value="${getProEstimateDTO.get(i).get(0).estimates_id }">
          <input type="hidden" name="service_name" value="${getProEstimateDTO.get(i).get(0).service_name }">
	</form>
</td>
        <c:if test="${(i+1) % 3 == 0}">
        </tr><tr>
        </c:if>
	</c:forEach>
</tr>
</table>


</div>


<!--   푸터 -->

  <footer class="page-footer bg-image" style="background-image: url(<%=request.getContextPath() %>/resources/img/footer1.jpg);" >
    <div class="container" style="width: 1250px; height: 390px;">
      <div class="row mb-5">
        <div class="col-lg-3 py-3">
          
          <div class="callnumber">1600-8282</div>
			<p class="callnumberdown">평일 10:00 ~ 18:00 (점심시간 13:00 ~ 14:00 제외)</p>
          <div class="social-media-button">
            <a href="#"><span class="mai-logo-facebook-f"></span></a>
            <a href="#"><span class="mai-logo-twitter"></span></a>
            <a href="#"><span class="mai-logo-google-plus-g"></span></a>
            <a href="#"><span class="mai-logo-instagram"></span></a>
            <a href="#"><span class="mai-logo-youtube"></span></a>
          </div>
        </div>
        <div class="col-lg-3 py-3">
          <h5>Company</h5>
          <ul class="footer-menu" id="footermenu1">
            <li><b>마루소개</b></li>
            <li>마루메인</li>
            <li>Prime</li>
            <li>엔터프라이즈</li>
            <li>프리랜서 클럽</li>
          </ul>
          
         
        </div>
        <div class="col-lg-3 py-3">
          <ul class="footer-menu" id="footermenu2">
          	<li><b>고객안내</b></li>
            <li>이용안내</li>
            <li>안전정책</li>
            <li>예상금액</li>
            <li>고수찾기</li>
            <li>마루보증</li>
          </ul>
        </div>
        <div class="col-lg-3 py-3">
           <ul class="footer-menu" id="footermenu3">
          	<li><b>주고안내</b></li>
            <li>이용안내</li>
            <li>주고가이드</li>
            <li>주고가입</li>
            <li>주고센터</li>
            </ul>
        </div>
      </div>
      <p class="text-center" id="copyright">(주)마루ㅣ부산시 동천로 109 삼한골든게이트 7층ㅣ대표: 1조ㅣ개인정보관리책임자: 1조ㅣ사업자등록번호:678-12-78901</p>
    </div>
  </footer>
 
<script src="../resources/js/jquery-3.5.1.min.js"></script>

<script src="../resources/js/bootstrap.bundle.min.js"></script>

<script src="../resources/js/google-maps.js"></script>

<script src="../resources/vendor/wow/wow.min.js"></script>

<script src="../resources/js/theme.js"></script>


<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAIA_zqjFMsJM_sxP9-6Pde5vVCTyJmUHM&callback=initMap"></script>

</body>
</html>



