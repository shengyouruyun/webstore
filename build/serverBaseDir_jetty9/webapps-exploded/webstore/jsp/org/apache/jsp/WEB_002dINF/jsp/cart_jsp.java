package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_value_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html> \n");
      out.write("      <head> \n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html;  \n");
      out.write("      charset=utf-8\"> \n");
      out.write("      <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\"> \n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.1/angular.min.js\"></script> \n");
      out.write("      <script src=\"/webstore/resources/js/controllers.js\"></script> \n");
      out.write(" \n");
      out.write("      <title>Cart</title> \n");
      out.write("      </head> \n");
      out.write("      <body> \n");
      out.write("         <section> \n");
      out.write("            <div class=\"jumbotron\"> \n");
      out.write("               <div class=\"container\"> \n");
      out.write("                 <h1>Cart</h1> \n");
      out.write("                  <p>All the selected products in your cart</p> \n");
      out.write("               </div> \n");
      out.write("           </div> \n");
      out.write("        </section> \n");
      out.write(" \n");
      out.write("        <section class=\"container\" ng-app=\"cartApp\"> \n");
      out.write("           <div ng-controller=\"cartCtrl\" ng-init=\"initCartId('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\"> \n");
      out.write(" \n");
      out.write("               <div> \n");
      out.write("                  <a class=\"btn btn-danger pull-left\" ng-click=\"clearCart()\"> \n");
      out.write("                    \n");
      out.write("                  \t<span class=\"glyphicon glyphicon-remove-sign\"></span> Clear Cart</a>\n");
      out.write("    <a href=\"");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("\" class=\"btn btn-success pull-right\">\n");
      out.write("                   <span class=\"glyphicon-shopping-cart glyphicon\"></span>Check out</a> \n");
      out.write("               </div> \n");
      out.write("               <table class=\"table table-hover\"> \n");
      out.write("                 <tr> \n");
      out.write("                     <th>Product</th> \n");
      out.write("                     <th>Unit price</th> \n");
      out.write("                     <th>Qauntity</th> \n");
      out.write("                     <th>Price</th> \n");
      out.write("                     <th>Action</th> \n");
      out.write("                  </tr> \n");
      out.write("                  <tr ng-repeat=\"item in cart.cartItems\"> \n");
      out.write("                     <td>{{item.product.productId}}-{{item.product.name}}</td> \n");
      out.write("                     <td>{{item.product.unitPrice}}</td> \n");
      out.write("                     <td>{{item.quantity}}</td> \n");
      out.write("                    <td>{{item.totalPrice}}</td> \n");
      out.write("      <td><a href=\"#\" class=\"label label-danger\" ng-click=\"removeFromCart(item.product.productId)\">\n");
      out.write("                  <span class=\"glyphicon glyphicon-remove\" /></span> Remove </a></td> \n");
      out.write("                  </tr> \n");
      out.write("                 <tr> \n");
      out.write("                    <th></th> \n");
      out.write("                    <th></th> \n");
      out.write("                    <th>Grand Total</th> \n");
      out.write("                    <th>{{cart.grandTotal}}</th> \n");
      out.write("                    <th></th> \n");
      out.write("                 </tr> \n");
      out.write("               </table> \n");
      out.write("          \n");
      out.write("               <a href=\"");
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("\" class=\"btn btn-default\"> \n");
      out.write("               <span class=\"glyphicon-hand-left glyphicon\"></span> Continue shopping </a> \n");
      out.write("            </div> \n");
      out.write("         </section> \n");
      out.write("      </body> \n");
      out.write("   </html>");
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

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/checkout?cartId=${cartId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent(null);
    _jspx_th_spring_url_1.setValue("/market/products");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_1);
    }
    return false;
  }
}
