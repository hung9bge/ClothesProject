<%-- 
    Document   : home
    Created on : Mar 8, 2022, 1:40:13 AM
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
                            <a href="cart"> <img src="web/images/cart.png" width="30px" height="30px"></a>
                        </ul>
                        <div class="box">
                            <div class="container-4">
                                <input type="text" id="search" placeholder="Search..." name="search" />
                            </div>
                        </div>
                    </nav>


                </div>

            </div>
            <div class="row">
                <div class="col-2">
                    <h1> Bạn Muốn Trẻ Trung Năng Động <br> Phong Cách Mới!</h1>
                    <p> Shop chuyên cung cấp những mẫu quần áo Unisex chủ yếu dành cho giới trẻ,<br>
                        phù hợp nhất với các nam mang phong cách thời trang đường phố Hàn Quốc <br>
                        sẽ khiến các bạn trông cực kỳ năng động và thu hút. 
                    </p>
                    <a href="" class="btn">Khám Phá Ngay &#8594</a>
                </div>
                <div class="col-2">
                    <img src="web/images/image1.png" alt="">
                </div>
            </div>
        </div>

        <!----- Sản Phẩm nổi bật ---->
        <div class="product">
            <div class="small-product">
                <div class="row">
                    <div class="col-3">
                        <img src="web/images/Set-dong-phuc-nam-JK.png" alt="">
                    </div>
                    <div class="col-3">
                        <img src="web/images/Set-2-chiec-gom-ao-blazer.png" alt="">
                    </div>
                    <div class="col-3">
                        <img src="web/images/so-mi-cao-cap-style-han-dep-trai.png" alt="">
                    </div>

                </div>
            </div>

        </div>
        <!----- Các Sản Phẩm -->
        <div class="small-product">
            <h2 class="title">Xu Hướng Mới</h2>
            <div class="row">
                <div class="col-4">
                    <img src="web/images/quan_ao/1.png" alt="">
                    <h4>Áo bóng rổ sinh viên </h4>
                    <p>$250,000 VNĐ</p>
                </div>
                <div class="col-4">
                    <img src="web/images/quan_ao/2.png" alt="">
                    <h4>Áo Tshirt nam cá tính đa năng  </h4>
                    <p>$300,000 VNĐ</p>
                </div>
                <div class="col-4">
                    <img src="web/images/quan_ao/3.jpg" alt="">
                    <h4>Áo phông nam form rộng Style  </h4>
                    <p>$300,000 VNĐ</p>
                </div>
                <div class="col-4">
                    <img src="web/images/quan_ao/8.png" alt="">
                    <h4>Áo blazer kẻ ô xu hướng Hàn Quốc</h4>
                    <p>$500,000 VNĐ</p>
                </div>
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