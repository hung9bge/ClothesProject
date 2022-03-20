<%-- 
    Document   : account
    Created on : Mar 18, 2022, 8:54:32 PM
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
        <!-- account-page  -->
        <div class="account-page">
            <div class="container">
                <div class="row">
                    <div class="col-2">
                        <img src="images/image1.png" width="100%">
                    </div>
                    <div class="col-2">
                       <div class="form-container">
                           <div class="form-btn">
                            <span onclick="login()">Đăng Nhập</span>
                            <span onclick="register()" >Đăng Ký</span>
                            <hr id="Indicator"> 
                            </div>
                           <form action="login" id="LoginForm" method="POST">
                           <input type="text" placeholder="Tên Đăng Nhập" name="name"><br>
                            <input type="password" placeholder=" Mật khẩu " name="password">
                            <button type="submit" class="btn" name="" > Đăng Nhâp</button>              
                            </form>
                          
                           
                          
    
                            <form action="" id="RegForm">
                                <input type="text" placeholder="Tên Đăng Nhập" name="username"><br>
                                <input type="password" placeholder=" Mật khẩu " name="password">
                                 <input type="email" placeholder="Email" name="email"><br>
                                <button type="submit" class="btn" name="" > Đăng Ký</button>
                                
                                </form>
                       </div>
                    </div>
                </div>
            </div>
        </div>
        

        <!-- js for Form  -->
    <script>
        var LoginForm = document.getElementById("LoginForm");
        var RegForm = document.getElementById("RegForm");
        var Indicator = document.getElementById("Indicator");

            function register(){
                RegForm.style.transform = "translateX(0px)";
                LoginForm.style.transform ="translateX(0px)";
                Indicator.style.transform ="translateX(100px)";
            }

            function login(){
                RegForm.style.transform = "translateX(400px)";
                LoginForm.style.transform ="translateX(400px)";
                Indicator.style.transform ="translateX(0px)";
            }
    </script>

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