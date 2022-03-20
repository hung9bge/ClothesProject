package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("\t<title>Shop Quần Áo</title>\n");
      out.write("              \n");
      out.write("\t</head>\n");
      out.write("\t\n");
      out.write("\t<body>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("\n");
      out.write("       \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                    <a href=\"index.html\"> <img src=\"images/logo.png\" width=\"150\"></a>                 \n");
      out.write("                    </div>\n");
      out.write("                    <nav>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"index.html\">Trang Chủ</a></li>\n");
      out.write("                            <li><a href=\"product-detail.html\">Sản Phẩm</a></li>                      \n");
      out.write("                            <li><a href=\"quan.html\">Quần Nam </a></li>\n");
      out.write("                            <li><a href=\"quan.html\">Áo Nam</a></li>\n");
      out.write("                            <li><a href=\"account.html\">Tài Khoản</a></li>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                        \n");
      out.write("                    </nav>\n");
      out.write("                    <a href=\"cart.html\"> <img src=\"images/cart.png\" width=\"30px\" height=\"30px\"></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("          <!----- Details Các Sản Phẩm -->\n");
      out.write("          <div class=\"smail-container\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-2\">\n");
      out.write("                    <img src=\"images/quan/11.png\" width=\"100%\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-2\">\n");
      out.write("                    <p>Home/Quần Nam</p>\n");
      out.write("                    <h1>Quần âu 9 phân cổ dài</h1>\n");
      out.write("                    <h4>300.000 VNĐ</h4>\n");
      out.write("                    <select>\n");
      out.write("                        <option>Chọn Size</option>\n");
      out.write("                        <option>XXL</option>\n");
      out.write("                        <option>XL</option>\n");
      out.write("                        <option>L</option>\n");
      out.write("                        <option>M</option>\n");
      out.write("                        <option>S</option>\n");
      out.write("                        <input type=\"number\" value=\"1\">\n");
      out.write("                        <a href=\"\" class=\"btn\"> Add To Cart</a>\n");
      out.write("                        <h3>Free Ship</h3>\n");
      out.write("                        <p>\n");
      out.write("                            Hàng về tận nơi từ 12 – 20 ngày.<br>\n");
      out.write("                             Hàng được order từ Trung Quốc về nên được đóng gói rất cẩn thận. \n");
      out.write("                        </p>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- -----  title----- -->\n");
      out.write("          <div class=\"smail-container\">\n");
      out.write("             <div class=\"row row-2\">\n");
      out.write("                 <h2>Sản Phẩm Tương Tự</h2>\n");
      out.write("                 <p>Xem Thêm</p>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    <!----- Các Sản Phẩm -->\n");
      out.write("    <div class=\"small-product\">\n");
      out.write("        <h2 class=\"title\">Quần Nam</h2>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("                <img src=\"images/quan/11.png\" alt=\"\">\n");
      out.write("                <h4>Áo bóng rổ sinh viên </h4>\n");
      out.write("                <p>$250,000 VNĐ</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("                <img src=\"images/quan/12.jpg\" alt=\"\">\n");
      out.write("                <h4>Áo Tshirt nam cá tính đa năng  </h4>\n");
      out.write("                <p>$300,000 VNĐ</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("                <img src=\"images/quan/13.jpg\" alt=\"\">\n");
      out.write("                <h4>Áo phông nam form rộng Style  </h4>\n");
      out.write("                <p>$300,000 VNĐ</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("                <img src=\"images/quan/14.jpg\" alt=\"\">\n");
      out.write("                <h4>Áo blazer kẻ ô xu hướng Hàn Quốc</h4>\n");
      out.write("                <p>$500,000 VNĐ</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("                <img src=\"images/quan/15.jpg\" alt=\"\">\n");
      out.write("                <h4>Áo bóng rổ sinh viên </h4>\n");
      out.write("                <p>$250,000 VNĐ</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("                <img src=\"images/quan/16.jpg\" alt=\"\">\n");
      out.write("                <h4>Áo Tshirt nam cá tính đa năng  </h4>\n");
      out.write("                <p>$300,000 VNĐ</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("                <img src=\"images/quan/17.jpg\" alt=\"\">\n");
      out.write("                <h4>Áo phông nam form rộng Style  </h4>\n");
      out.write("                <p>$300,000 VNĐ</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("                <img src=\"images/quan/18.jpg\" alt=\"\">\n");
      out.write("                <h4>Áo blazer kẻ ô xu hướng Hàn Quốc</h4>\n");
      out.write("                <p>$500,000 VNĐ</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("     \n");
      out.write("        <div class=\"page-btn\">\n");
      out.write("            <span>1</span>\n");
      out.write("            <span>2</span>\n");
      out.write("            <span>3</span>\n");
      out.write("            <span>&#8594;</span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!---- Footer-->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"footer-col-1\">\n");
      out.write("                    <h3>Giới thiệu</h3>\n");
      out.write("                    <p>MEN'S CLOTHING STORE là nơi để các bạn trai<br> cập nhật \n");
      out.write("                         được những xu hướng mới nhất về trang phục, \n");
      out.write("                        cách ăn mặc, cách phối đồ, chăm sóc vẻ đẹp cho bản thân,  các bạn gái có thể vậy tại sao con trai lại không chứ?\n");
      out.write("                        Đây sẽ là nơi thay đổi bạn.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-col-2\">\n");
      out.write("                    <h3>Follow us</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Facebook:<a href=\"https://www.facebook.com/profile.php?id=100046939372906\">fb.com/ManhHung</a></li>\n");
      out.write("                        \n");
      out.write("                        <li>Email: <a href=\"https://mail.google.com/mail/u/0/#inbox\">ahungthanhgank@gmail.com</a></li>\n");
      out.write("                        <li>SĐT: 0963734983</li>\n");
      out.write("                        <li>Địa Chỉ: 22 - Yên Đồng - Ý Yên - Nam Định</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>          \n");
      out.write("                <div class=\"footer-col-3\">\n");
      out.write("                    \n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">About</a></li>\n");
      out.write("                        <li><a href=\"\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>    \n");
      out.write("             \n");
      out.write("              <p class=\"copyright\">Copyright 2020 - Manh Hung Store </p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
