<%-- 
    Document   : product_detail
    Created on : Mar 18, 2022, 3:07:14 AM
    Author     : HUNGLM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">

	<title>Shop Quần Áo</title>
              
	</head>
	
	<body>
        
        <div class="header">

       
            <div class="container">
                <div class="navbar">
                    <div class="logo">
                    <a href="index.html"> <img src="images/logo.png" width="150"></a>                 
                    </div>
                    <nav>
                        <ul>
                            <li><a href="index.html">Trang Chủ</a></li>
                            <li><a href="product-detail.html">Sản Phẩm</a></li>                      
                            <li><a href="quan.html">Quần Nam </a></li>
                            <li><a href="quan.html">Áo Nam</a></li>
                            <li><a href="account.html">Tài Khoản</a></li>

                        </ul>
                        <a href="cart.html"> <img src="images/cart.png" width="30px" height="30px"></a>
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
        <h2 class="title">Quần Nam</h2>
        <div class="row">
            <div class="col-4">
                <img src="images/quan/11.png" alt="">
                <h4>Áo bóng rổ sinh viên </h4>
                <p>$250,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/12.jpg" alt="">
                <h4>Áo Tshirt nam cá tính đa năng  </h4>
                <p>$300,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/13.jpg" alt="">
                <h4>Áo phông nam form rộng Style  </h4>
                <p>$300,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/14.jpg" alt="">
                <h4>Áo blazer kẻ ô xu hướng Hàn Quốc</h4>
                <p>$500,000 VNĐ</p>
            </div>
        </div>
        <div class="row">
            <div class="col-4">
                <img src="images/quan/15.jpg" alt="">
                <h4>Áo bóng rổ sinh viên </h4>
                <p>$250,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/16.jpg" alt="">
                <h4>Áo Tshirt nam cá tính đa năng  </h4>
                <p>$300,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/17.jpg" alt="">
                <h4>Áo phông nam form rộng Style  </h4>
                <p>$300,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/18.jpg" alt="">
                <h4>Áo blazer kẻ ô xu hướng Hàn Quốc</h4>
                <p>$500,000 VNĐ</p>
            </div>
        </div>
        <div class="row">
            <div class="col-4">
                <img src="images/quan/IMG_4762Quan-bo-nam-ong-rong-dep.jpg" alt="">
                <h4>Áo bóng rổ sinh viên </h4>
                <p>$250,000 VNĐ</p>
            </div>
           
            <div class="col-4">
                <img src="images/quan/IMG_4792Quan-bo-ong-rong-dai-phu-hop-deo-converse-ban-han.jpg" alt="">
                <h4>Áo bóng rổ sinh viên </h4>
                <p>$250,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/IMG_4825Quan-jean-ong-suong-hoc-sinh-han.jpg" alt="">
                <h4>Áo Tshirt nam cá tính đa năng  </h4>
                <p>$300,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/IMG_8349quan-bo-nam-form-rong-de-phoi-do.jpg" alt="">
                <h4>Áo phông nam form rộng Style  </h4>
                <p>$300,000 VNĐ</p>
            </div>
            
           </div>
    
        <div class="row">
            <div class="col-4">
                <img src="images/quan/Quan-au-thu-dong-phong-cach-hongkongIMG_9594.png" alt="">
                <h4>Áo bóng rổ sinh viên </h4>
                <p>$250,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/Quan-form-rong-vai-soc-ke-thu-dong-nam-sinhIMG_9650.jpg" alt="">
                <h4>Áo Tshirt nam cá tính đa năng  </h4>
                <p>$300,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/IMG_7450Quan-jean-ong-suong-style-han-quoc-rach.jpg" alt="">
                <h4>Áo phông nam form rộng Style  </h4>
                <p>$300,000 VNĐ</p>
            </div>
            <div class="col-4">
                <img src="images/quan/IMG_8322Quan-nam-xu-huong-sinh-vien-phong-cach-han.jpg" alt="">
                <h4>Áo blazer kẻ ô xu hướng Hàn Quốc</h4>
                <p>$500,000 VNĐ</p>
            </div>
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