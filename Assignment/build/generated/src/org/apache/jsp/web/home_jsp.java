package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"web/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <title>Shop Qu???n ??o</title>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar\">\r\n");
      out.write("                    <div class=\"logo\">\r\n");
      out.write("                        <a href=\"product\"> <img src=\"web/images/logo.png\" width=\"150\"></a>                 \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <nav>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"product\">Trang Ch???</a></li>\r\n");
      out.write("                                                           \r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <li><a href=\"login\">T??i Kho???n</a></li>\r\n");
      out.write("                            <a href=\"cart\"> <img src=\"web/images/cart.png\" width=\"30px\" height=\"30px\"></a>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"box\">\r\n");
      out.write("                            <div class=\"container-4\">\r\n");
      out.write("                                <input type=\"text\" id=\"search\" placeholder=\"Search...\" name=\"search\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-2\">\r\n");
      out.write("                    <h1> B???n Mu???n Tr??? Trung N??ng ?????ng <br> Phong C??ch M???i!</h1>\r\n");
      out.write("                    <p> Shop chuy??n cung c???p nh???ng m???u qu???n ??o Unisex ch??? y???u d??nh cho gi???i tr???,<br>\r\n");
      out.write("                        ph?? h???p nh???t v???i c??c nam mang phong c??ch th???i trang ???????ng ph??? H??n Qu???c <br>\r\n");
      out.write("                        s??? khi???n c??c b???n tr??ng c???c k??? n??ng ?????ng v?? thu h??t. \r\n");
      out.write("                    </p>\r\n");
      out.write("                    <a href=\"\" class=\"btn\">Kh??m Ph?? Ngay &#8594</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-2\">\r\n");
      out.write("                    <img src=\"web/images/image1.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!----- S???n Ph???m n???i b???t ---->\r\n");
      out.write("        <div class=\"product\">\r\n");
      out.write("            <div class=\"small-product\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-3\">\r\n");
      out.write("                        <img src=\"web/images/Set-dong-phuc-nam-JK.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-3\">\r\n");
      out.write("                        <img src=\"web/images/Set-2-chiec-gom-ao-blazer.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-3\">\r\n");
      out.write("                        <img src=\"web/images/so-mi-cao-cap-style-han-dep-trai.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!----- C??c S???n Ph???m -->\r\n");
      out.write("        <div class=\"small-product\">\r\n");
      out.write("            <h2 class=\"title\">Xu H?????ng M???i</h2>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-4\">\r\n");
      out.write("                    <img src=\"web/images/quan_ao/1.png\" alt=\"\">\r\n");
      out.write("                    <h4>??o b??ng r??? sinh vi??n </h4>\r\n");
      out.write("                    <p>$250,000 VN??</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-4\">\r\n");
      out.write("                    <img src=\"web/images/quan_ao/2.png\" alt=\"\">\r\n");
      out.write("                    <h4>??o Tshirt nam c?? t??nh ??a n??ng  </h4>\r\n");
      out.write("                    <p>$300,000 VN??</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-4\">\r\n");
      out.write("                    <img src=\"web/images/quan_ao/3.jpg\" alt=\"\">\r\n");
      out.write("                    <h4>??o ph??ng nam form r???ng Style  </h4>\r\n");
      out.write("                    <p>$300,000 VN??</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-4\">\r\n");
      out.write("                    <img src=\"web/images/quan_ao/8.png\" alt=\"\">\r\n");
      out.write("                    <h4>??o blazer k??? ?? xu h?????ng H??n Qu???c</h4>\r\n");
      out.write("                    <p>$500,000 VN??</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!---- Footer-->\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"footer-col-1\">\r\n");
      out.write("                    <h3>Gi???i thi???u</h3>\r\n");
      out.write("                    <p>MEN'S CLOTHING STORE l?? n??i ????? c??c b???n trai<br> c???p nh???t \r\n");
      out.write("                        ???????c nh???ng xu h?????ng m???i nh???t v??? trang ph???c, \r\n");
      out.write("                        c??ch ??n m???c, c??ch ph???i ?????, ch??m s??c v??? ?????p cho b???n th??n,  c??c b???n g??i c?? th??? v???y t???i sao con trai l???i kh??ng ch????\r\n");
      out.write("                        ????y s??? l?? n??i thay ?????i b???n.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-col-2\">\r\n");
      out.write("                    <h3>Follow us</h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>Facebook:<a href=\"https://www.facebook.com/profile.php?id=100046939372906\">fb.com/ManhHung</a></li>\r\n");
      out.write("\r\n");
      out.write("                        <li>Email: <a href=\"https://mail.google.com/mail/u/0/#inbox\">ahungthanhgank@gmail.com</a></li>\r\n");
      out.write("                        <li>S??T: 0963734983</li>\r\n");
      out.write("                        <li>?????a Ch???: 22 - Y??n ?????ng - ?? Y??n - Nam ?????nh</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>          \r\n");
      out.write("                <div class=\"footer-col-3\">\r\n");
      out.write("\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"\">About</a></li>\r\n");
      out.write("                        <li><a href=\"\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>    \r\n");
      out.write("\r\n");
      out.write("                <p class=\"copyright\">Copyright 2020 - Manh Hung Store </p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoriesList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <li><a href=\"product?action=getProductByCate&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>   \r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
