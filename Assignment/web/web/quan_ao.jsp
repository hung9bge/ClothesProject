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
                        <a href="cart.html"> <img src="web/images/cart.png" width="30px" height="30px"></a>
                        </ul>
                        <div class="box">
                            <div class="container-4">
                                <input type="text" id="search" placeholder="Search..." name="search" />

                            </div>
                        </div>
                    </nav>
                </div>

                <!----- Các Sản Phẩm -->
                <div class="small-product">
                    <h2 class="title">${category.name}</h2>
                    <div class="row">
                        <c:forEach items="${productsList}" var="o" begin="1" end="8">
                            <div class="col-4">
                                <a href="product?action=getProductById&id=${o.id}">
                            <img src="web/images/quan_ao/${o.img}" alt="">
                            <h4>${o.name}</h4>
                            <p>${o.price }</p>
                                </a>
                        </div>
                        </c:forEach>
                        
                    </div>
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