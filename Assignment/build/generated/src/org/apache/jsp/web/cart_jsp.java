package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img src=\"images/logo.png\" width=\"150\">\n");
      out.write("                </div>\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Home</a></li>\n");
      out.write("                        <li><a href=\"\">Product</a></li>                      \n");
      out.write("                        <li><a href=\"\">Account</a></li>\n");
      out.write("                        <li><a href=\"\">Quần Nam </a></li>\n");
      out.write("                        <li><a href=\"\">Áo Nam</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                </nav>\n");
      out.write("                <img src=\"images/cart.png\" width=\"30px\" height=\"30px\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         <!-- cart items details  -->\n");
      out.write("         <div class=\"smail-container cart-page\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Sản Phẩm</th>\n");
      out.write("                <th>Số Lượng</th>\n");
      out.write("                <th>Tổng tiền</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"cart-infor\">\n");
      out.write("                        <img src=\"images/quan/IMG_4419quan-au-9-phan-co-dai.png\" alt=\"\">\n");
      out.write("                        <div>\n");
      out.write("                            <p>Quần âu 9 phân cổ dài</p>\n");
      out.write("                            <small>Giá Thành: 300.000 VNĐ</small><br>\n");
      out.write("                            <a href=\"\">Xóa</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td><input type=\"number\" value=\"1\"></td>\n");
      out.write("                <td>300.000 VNĐ</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         <div class=\"total-price\">\n");
      out.write("             <table>\n");
      out.write("                 <tr>\n");
      out.write("                     <td>Tổng tiền:</td>\n");
      out.write("                     <td>300.000 VNĐ</td>\n");
      out.write("                 </tr>\n");
      out.write("             </table>\n");
      out.write("         </div>\n");
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
