package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"web/style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<title>Shop Qu???n ??o</title>\n");
      out.write("              \n");
      out.write("\t</head>\n");
      out.write("\t\n");
      out.write("\t<body>\n");
      out.write("           \n");
      out.write("        <div class=\"header\">\n");
      out.write("\n");
      out.write("       \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                    <a href=\"index.html\"> <img src=\"web/images/logo.png\" width=\"150\"></a>                 \n");
      out.write("                    </div>\n");
      out.write("                    <nav>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"index.html\">Trang Ch???</a></li>\n");
      out.write("                            <li><a href=\"product-detail.html\">S???n Ph???m</a></li>                      \n");
      out.write("                            <li><a href=\"quan.html\">Qu???n Nam </a></li>\n");
      out.write("                            <li><a href=\"quan.html\">??o Nam</a></li>\n");
      out.write("                            <li><a href=\"account.html\">T??i Kho???n</a></li>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                       \n");
      out.write("                    </nav>\n");
      out.write("                  \n");
      out.write("                    <a href=\"cart.html\"> <img src=\"web/images/cart.png\" width=\"30px\" height=\"30px\"></a>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!-- account-page  -->\n");
      out.write("        <div class=\"account-page\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <img src=\"web/images/image1.png\" width=\"100%\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                       <div class=\"form-container\">\n");
      out.write("                           <div class=\"form-btn\">\n");
      out.write("                            <span onclick=\"login()\">????ng Nh???p</span>\n");
      out.write("                            <span onclick=\"register()\" >????ng K??</span>\n");
      out.write("                            <hr id=\"Indicator\"> \n");
      out.write("                            </div>\n");
      out.write("                           <form action=\"login\" id=\"LoginForm\" method=\"POST\">\n");
      out.write("                           <input type=\"text\" placeholder=\"T??n ????ng Nh???p\" name=\"name\"><br>\n");
      out.write("                            <input type=\"password\" placeholder=\" M???t kh???u \" name=\"password\">\n");
      out.write("                            <button type=\"submit\" class=\"btn\" name=\"\" > ????ng Nh??p</button>              \n");
      out.write("                            </form>\n");
      out.write("                          \n");
      out.write("                           \n");
      out.write("                          \n");
      out.write("    \n");
      out.write("                            <form action=\"\" id=\"RegForm\">\n");
      out.write("                                <input type=\"text\" placeholder=\"T??n ????ng Nh???p\" name=\"username\"><br>\n");
      out.write("                                <input type=\"password\" placeholder=\" M???t kh???u \" name=\"password\">\n");
      out.write("                                 <input type=\"email\" placeholder=\"Email\" name=\"email\"><br>\n");
      out.write("                                <button type=\"submit\" class=\"btn\" name=\"\" > ????ng K??</button>\n");
      out.write("                                \n");
      out.write("                                </form>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- js for Form  -->\n");
      out.write("    <script>\n");
      out.write("        var LoginForm = document.getElementById(\"LoginForm\");\n");
      out.write("        var RegForm = document.getElementById(\"RegForm\");\n");
      out.write("        var Indicator = document.getElementById(\"Indicator\");\n");
      out.write("\n");
      out.write("            function register(){\n");
      out.write("                RegForm.style.transform = \"translateX(0px)\";\n");
      out.write("                LoginForm.style.transform =\"translateX(0px)\";\n");
      out.write("                Indicator.style.transform =\"translateX(100px)\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function login(){\n");
      out.write("                RegForm.style.transform = \"translateX(400px)\";\n");
      out.write("                LoginForm.style.transform =\"translateX(400px)\";\n");
      out.write("                Indicator.style.transform =\"translateX(0px)\";\n");
      out.write("            }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <!---- Footer-->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"footer-col-1\">\n");
      out.write("                    <h3>Gi???i thi???u</h3>\n");
      out.write("                    <p>MEN'S CLOTHING STORE l?? n??i ????? c??c b???n trai<br> c???p nh???t \n");
      out.write("                         ???????c nh???ng xu h?????ng m???i nh???t v??? trang ph???c, \n");
      out.write("                        c??ch ??n m???c, c??ch ph???i ?????, ch??m s??c v??? ?????p cho b???n th??n,  c??c b???n g??i c?? th??? v???y t???i sao con trai l???i kh??ng ch????\n");
      out.write("                        ????y s??? l?? n??i thay ?????i b???n.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-col-2\">\n");
      out.write("                    <h3>Follow us</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Facebook:<a href=\"https://www.facebook.com/profile.php?id=100046939372906\">fb.com/ManhHung</a></li>\n");
      out.write("                        \n");
      out.write("                        <li>Email: <a href=\"https://mail.google.com/mail/u/0/#inbox\">ahungthanhgank@gmail.com</a></li>\n");
      out.write("                        <li>S??T: 0963734983</li>\n");
      out.write("                        <li>?????a Ch???: 22 - Y??n ?????ng - ?? Y??n - Nam ?????nh</li>\n");
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
