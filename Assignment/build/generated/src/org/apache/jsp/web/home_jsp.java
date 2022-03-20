package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("\r\n");
      out.write("\t<title>Shop Quần Áo</title>\r\n");
      out.write("              \r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                <a href=\"product\"> <img src=\"web/images/logo.png\" width=\"150\"></a>                 \r\n");
      out.write("                </div>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"product\">Trang Chủ</a></li>\r\n");
      out.write("                        <li><a href=\"product-detail.html\">Sản Phẩm</a></li>                                    \r\n");
      out.write("                        <li><a href=\"quan.html\">Quần Nam </a></li>\r\n");
      out.write("                        <li><a href=\"quan.html\">Áo Nam</a></li>\r\n");
      out.write("                        <li><a href=\"account.html\">Tài Khoản</a></li>\r\n");
      out.write("                        <a href=\"cart.html\"> <img src=\"web/images/cart.png\" width=\"30px\" height=\"30px\"></a>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("                        <div class=\"container-4\">\r\n");
      out.write("                          <input type=\"text\" id=\"search\" placeholder=\"Search...\" name=\"search\" />\r\n");
      out.write("                       \r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-2\">\r\n");
      out.write("                <h1> Bạn Muốn Trẻ Trung Năng Động <br> Phong Cách Mới!</h1>\r\n");
      out.write("                <p> Shop chuyên cung cấp những mẫu quần áo Unisex chủ yếu dành cho giới trẻ,<br>\r\n");
      out.write("                    phù hợp nhất với các nam mang phong cách thời trang đường phố Hàn Quốc <br>\r\n");
      out.write("                    sẽ khiến các bạn trông cực kỳ năng động và thu hút. \r\n");
      out.write("                </p>\r\n");
      out.write("               <a href=\"\" class=\"btn\">Khám Phá Ngay &#8594</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-2\">\r\n");
      out.write("                <img src=\"web/images/image1.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\t\r\n");
      out.write("    <!----- Sản Phẩm nổi bật ---->\r\n");
      out.write("    <div class=\"product\">\r\n");
      out.write("        <div class=\"small-product\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                    <img src=\"web/images/Set-dong-phuc-nam-JK.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                    <img src=\"web/images/Set-2-chiec-gom-ao-blazer.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                    <img src=\"web/images/so-mi-cao-cap-style-han-dep-trai.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("    </div>\r\n");
      out.write("    <!----- Các Sản Phẩm -->\r\n");
      out.write("    <div class=\"small-product\">\r\n");
      out.write("        <h2 class=\"title\">Xu Hướng Mới</h2>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-4\">\r\n");
      out.write("                <img src=\"web/images/ao/1.png\" alt=\"\">\r\n");
      out.write("                <h4>Áo bóng rổ sinh viên </h4>\r\n");
      out.write("                <p>$250,000 VNĐ</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-4\">\r\n");
      out.write("                <img src=\"web/images/ao/2.png\" alt=\"\">\r\n");
      out.write("                <h4>Áo Tshirt nam cá tính đa năng  </h4>\r\n");
      out.write("                <p>$300,000 VNĐ</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-4\">\r\n");
      out.write("                <img src=\"web/images/ao/3.jpg\" alt=\"\">\r\n");
      out.write("                <h4>Áo phông nam form rộng Style  </h4>\r\n");
      out.write("                <p>$300,000 VNĐ</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-4\">\r\n");
      out.write("                <img src=\"web/images/ao/8.png\" alt=\"\">\r\n");
      out.write("                <h4>Áo blazer kẻ ô xu hướng Hàn Quốc</h4>\r\n");
      out.write("                <p>$500,000 VNĐ</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!---- Footer-->\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"footer-col-1\">\r\n");
      out.write("                    <h3>Giới thiệu</h3>\r\n");
      out.write("                    <p>MEN'S CLOTHING STORE là nơi để các bạn trai<br> cập nhật \r\n");
      out.write("                         được những xu hướng mới nhất về trang phục, \r\n");
      out.write("                        cách ăn mặc, cách phối đồ, chăm sóc vẻ đẹp cho bản thân,  các bạn gái có thể vậy tại sao con trai lại không chứ?\r\n");
      out.write("                        Đây sẽ là nơi thay đổi bạn.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-col-2\">\r\n");
      out.write("                    <h3>Follow us</h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>Facebook:<a href=\"https://www.facebook.com/profile.php?id=100046939372906\">fb.com/ManhHung</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li>Email: <a href=\"https://mail.google.com/mail/u/0/#inbox\">ahungthanhgank@gmail.com</a></li>\r\n");
      out.write("                        <li>SĐT: 0963734983</li>\r\n");
      out.write("                        <li>Địa Chỉ: 22 - Yên Đồng - Ý Yên - Nam Định</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>          \r\n");
      out.write("                <div class=\"footer-col-3\">\r\n");
      out.write("                    \r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"\">About</a></li>\r\n");
      out.write("                        <li><a href=\"\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>    \r\n");
      out.write("             \r\n");
      out.write("              <p class=\"copyright\">Copyright 2020 - Manh Hung Store </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("              \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\t</body>\r\n");
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
