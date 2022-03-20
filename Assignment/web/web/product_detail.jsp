<%-- 
    Document   : product_detail
    Created on : Mar 18, 2022, 3:07:14 AM
    Author     : HUNGLM
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="web/style.css">

	<title>Shop Quần Áo</title>
              
	</head>
	
	<body>
        
        <div class="header">

       
            <div class="container">
                <div class="navbar">
                    <div class="logo">
                    <a href="product"> <img src="web/images/logo.png" width="150"></a>                 
                    </div>
                    <nav>
                        <ul>
                            <li><a href="product">Trang Chủ</a></li>
                           <c:forEach items="${categoriesList}" var="o">
                                <li><a href="product?action=getProductByCate&id=${o.id}">${o.name}</a></li>   
                            </c:forEach>
                            <li><a href="login">Tài Khoản</a></li>

                            
                        </ul>
                        
                    </nav>
                    <a href="cart.html"> <img src="web/images/cart.png" width="30px" height="30px"></a>
            </div>
        </div>
          <!----- Details Các Sản Phẩm -->
          <div class="smail-container">
              <div class="row">
                  
                <div class="col-2">
                    <img src="web/images/quan_ao/${productDetail.img}" width="100%">
                </div>
                <div class="col-2">
                    <h1>${productDetail.name}</h1>
                    <h4>${productDetail.price}</h4>
                    <select>
                        <option>Chọn Size</option>
                        <option>XXL</option>
                        <option>XL</option>
                        <option>L</option>
                        <option>M</option>
                        <option>S</option>
                        <input type="number" value="1">
                        <a href="" class="btn"> Add To Cart</a>
                        <h3>Free Ship</h3>
                        <p>
                            Hàng về tận nơi từ 12 – 20 ngày.<br>
                             Hàng được order từ Trung Quốc về nên được đóng gói rất cẩn thận. 
                        </p>
                    </select>
                </div>
            </div>
          </div>
          <!-- -----  title----- -->
          <div class="smail-container">
             <div class="row row-2">
                 <h2>Sản Phẩm Tương Tự</h2>
                 <p>Xem Thêm</p>

             </div>
        </div>
        
    <!----- Các Sản Phẩm -->
    <div class="small-product">
        <div class="page-btn">
            <span>1</span>
            <span>2</span>
            <span>3</span>
            <span>&#8594;</span>
        </div>
    </div>
    <!---- Footer-->
    <div class="footer">
        
            <div class="row">
                <div class="footer-col-1">
                    <h3>Giới thiệu</h3>
                    <p>MEN'S CLOTHING STORE là nơi để các bạn trai<br> cập nhật 
                         được những xu hướng mới nhất về trang phục, 
                        cách ăn mặc, cách phối đồ, chăm sóc vẻ đẹp cho bản thân,  các bạn gái có thể vậy tại sao con trai lại không chứ?
                        Đây sẽ là nơi thay đổi bạn.</p>
                </div>
                <div class="footer-col-2">
                    <h3>Follow us</h3>
                    <ul>
                        <li>Facebook:<a href="https://www.facebook.com/profile.php?id=100046939372906">fb.com/ManhHung</a></li>
                        
                        <li>Email: <a href="https://mail.google.com/mail/u/0/#inbox">ahungthanhgank@gmail.com</a></li>
                        <li>SĐT: 0963734983</li>
                        <li>Địa Chỉ: 22 - Yên Đồng - Ý Yên - Nam Định</li>
                    </ul>
                </div>          
                <div class="footer-col-3">
                    
                    <ul>
                        <li><a href="">About</a></li>
                        <li><a href="">Contact</a></li>
                    </ul>
                </div>    
             
              <p class="copyright">Copyright 2020 - Manh Hung Store </p>
            </div>
            
              
    </div>
    
	</body>
</html>