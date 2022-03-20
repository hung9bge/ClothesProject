<%-- 
    Document   : product_detail
    Created on : Mar 18, 2022, 3:07:14 AM
    Author     : HUNGLM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        
                    </nav>
                    <a href="cart.html"> <img src="images/cart.png" width="30px" height="30px"></a>
            </div>
        </div>
          <!----- Details Các Sản Phẩm -->
          <div class="smail-container">
              <div class="row">
                <div class="col-2">
                    <img src="images/quan/11.png" width="100%">
                </div>
                <div class="col-2">
                    <p>Home/Quần Nam</p>
                    <h1>Quần âu 9 phân cổ dài</h1>
                    <h4>300.000 VNĐ</h4>
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