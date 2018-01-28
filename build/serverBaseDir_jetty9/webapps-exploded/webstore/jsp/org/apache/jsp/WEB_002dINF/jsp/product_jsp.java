package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js\"></script>\n");
      out.write("\t<script src=\"/webstore/resources/js/controllers.js\"></script>\n");
      out.write("\t<title> Product </title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<section>\n");
      out.write("\t<div class=\"jumbotron\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h1>Products</h1>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\t<section class= \"container\" ng-app=\"cartApp\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-5\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<img src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" alt=\"image\"  style = \"width:100%\"/>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-5\">\n");
      out.write("\n");
      out.write("\t\t\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<strong>Item Code:</strong>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"label label-warning\">\n");
      out.write("\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<strong>\n");
      out.write("\t\t\t\t\t\tManufacture: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.manufacturer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t\t\t</strong>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<strong>\n");
      out.write("\t\t\t\t\t\tCategory: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t\t\t</strong>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<strong>\n");
      out.write("\t\t\t\t\t\tAvailble units in stock: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.unitsInStock}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t\t\t</strong>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.unitPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" USD</h4>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("\" class=\"btn btn-default\">\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon-hand-left glyphicon\"></span>Back\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t<p ng-controller=\"cartCtrl\">\n");
      out.write("\t<a href=\"#\" class=\"btn btn-warning btn-large\" ng-click=\"addToCart('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon-shopping-cart glyphicon\"></span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tOrder Now\n");
      out.write("\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("<a href=\"");
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("\" class=\"btn btn-default\"> \n");
      out.write("<span class=\"glyphicon-hand-right glyphicon\"></span> View Cart</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</section>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/img/${product.productId}.jpg", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue("/market/products");
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
    _jspx_th_spring_url_1.setValue("/cart/");
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
