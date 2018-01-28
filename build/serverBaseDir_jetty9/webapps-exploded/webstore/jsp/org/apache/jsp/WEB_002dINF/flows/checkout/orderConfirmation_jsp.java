package org.apache.jsp.WEB_002dINF.flows.checkout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderConfirmation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_modelAttribute_class;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_modelAttribute_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_fmt_formatDate_value_type_nobody.release();
    _jspx_tagPool_form_form_modelAttribute_class.release();
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
      response.setContentType("text/html");
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
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" <html> \n");
      out.write("  <head> \n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=\"utf-8\"> \n");
      out.write("<link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\"> \n");
      out.write("      <title>Order Confirmation</title> \n");
      out.write("      </head> \n");
      out.write(" \n");
      out.write("      <body> \n");
      out.write(" \n");
      out.write("         <section> \n");
      out.write("            <div class=\"jumbotron\"> \n");
      out.write("               <div class=\"container\"> \n");
      out.write("                  <h1>Order</h1> \n");
      out.write("                  <p>Order Confirmation</p> \n");
      out.write("               </div> \n");
      out.write("            </div> \n");
      out.write("         </section> \n");
      out.write("         <div class=\"container\"> \n");
      out.write("            <div class=\"row\"> \n");
      out.write("               ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("            </div> \n");
      out.write("         </div> \n");
      out.write("      </body> \n");
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

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_modelAttribute_class.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setModelAttribute("order");
    _jspx_th_form_form_0.setDynamicAttribute(null, "class", new String("form-horizontal"));
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                  <input type=\"hidden\" name=\"_flowExecutionKey\" \n");
          out.write("                     value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flowExecutionKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/> \n");
          out.write(" \n");
          out.write("                  <div \n");
          out.write("                     class=\"well col-xs-10 col-sm-10 col-md-6 col-\n");
          out.write("                     xs-offset-1 col-sm-offset-1 col-md-offset-3\"> \n");
          out.write("                     <div class=\"text-center\"> \n");
          out.write("                        <h1>Receipt</h1> \n");
          out.write("                     </div> \n");
          out.write("                     <div class=\"row\"> \n");
          out.write("                        <div class=\"col-xs-6 col-sm-6 col-md-6\"> \n");
          out.write("                           <address> \n");
          out.write("                              <strong>Shipping Address</strong> <br> \n");
          out.write("                              ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.shippingDetail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br> \n");
          out.write("                              \n");
          out.write("      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.shippingDetail.shippingAddress.doorNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(", \n");
          out.write("            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.shippingDetail.shippingAddress.streetName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                              <br> \n");
          out.write("                                 \n");
          out.write("      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.shippingDetail.shippingAddress.areaName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(",\n");
          out.write("      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.shippingDetail.shippingAddress.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                              <br> \n");
          out.write("                                \n");
          out.write("      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.shippingDetail.shippingAddress.country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(", \n");
          out.write("      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.shippingDetail.shippingAddress.zipCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                              <br> \n");
          out.write("                           </address> \n");
          out.write("                        </div> \n");
          out.write("                        <div class=\"col-xs-6 col-sm-6 col-md-6 text-right\"> \n");
          out.write("                           <p> \n");
          out.write("                              <em>Shipping DateDate: \n");
          out.write("                              ");
          if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("</em> \n");
          out.write("                           </p> \n");
          out.write("                        </div> \n");
          out.write("                     </div> \n");
          out.write("                     <div class=\"row\"> \n");
          out.write("                        <div class=\"col-xs-6 col-sm-6 col-md-6\"> \n");
          out.write("                           <address> \n");
          out.write("                              <strong>Billing Address</strong> <br> \n");
          out.write("                              ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.customer.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br> \n");
          out.write("                              \n");
          out.write("      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.customer.billingAddress.doorNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(",\n");
          out.write("      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.customer.billingAddress.streetName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                              <br> \n");
          out.write("                              \n");
          out.write("      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.customer.billingAddress.areaName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(",\n");
          out.write("      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.customer.billingAddress.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                              <br> \n");
          out.write("                                 \n");
          out.write("     ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.customer.billingAddress.country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(",\n");
          out.write("     ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.customer.billingAddress.zipCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                              <br> <abbr >P:</abbr> \n");
          out.write("                              ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.customer.phoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                           </address> \n");
          out.write("                        </div> \n");
          out.write(" \n");
          out.write("                     </div> \n");
          out.write("                     <div class=\"row\"> \n");
          out.write(" \n");
          out.write("                        <table class=\"table table-hover\"> \n");
          out.write("                           <thead> \n");
          out.write("                              <tr> \n");
          out.write("                                 <th>Product</th> \n");
          out.write("                                 <th>#</th> \n");
          out.write("                                 <th class=\"text-center\">Price</th> \n");
          out.write("                                 <th class=\"text-center\">Total</th> \n");
          out.write("                              </tr> \n");
          out.write("                           </thead> \n");
          out.write("                           <tbody> \n");
          out.write("                              ");
          if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write(" \n");
          out.write(" \n");
          out.write("                              <tr> \n");
          out.write("                                 <td> </td> \n");
          out.write("                                 <td> </td> \n");
          out.write("                                       <td class=\"text-right\"><h4> \n");
          out.write("                                       <strong>Grand Total: \n");
          out.write("                                      </strong> \n");
          out.write("                                    </h4></td> \n");
          out.write("                                 <td class=\"text-center text-danger\"><h4> \n");
          out.write("                                       \n");
          out.write("                              <strong>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.cart.grandTotal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                              </strong> \n");
          out.write("                                    </h4></td> \n");
          out.write("                              </tr> \n");
          out.write("                           </tbody> \n");
          out.write("                        </table> \n");
          out.write("<button id=\"back\" class=\"btn btn-default\" name=\"_eventId_backToCollectShippingDetail\">back</button> \n");
          out.write(" \n");
          out.write("<button type=\"submit\" class=\"btn btn-success\" name=\"_eventId_orderConfirmed\">Confirm\n");
          out.write("  <span class=\"glyphicon glyphicon-chevron-right\"></span> </button> \n");
          out.write("  <button id=\"btnCancel\" class=\"btn btn-default\" name=\"_eventId_cancel\">Cancel</button> \n");
          out.write("                     </div> \n");
          out.write("                  </div> \n");
          out.write("               ");
          int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_0.doFinally();
      _jspx_tagPool_form_form_modelAttribute_class.reuse(_jspx_th_form_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_fmt_formatDate_0.setType("date");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.shippingDetail.shippingDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_c_forEach_0.setVar("cartItem");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.cart.cartItems}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                                 <tr> \n");
          out.write("                                    <td class=\"col-md-9\">\n");
          out.write("                             <em>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartItem.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</em></td> \n");
          out.write("                                    <td class=\"col-md-1\" \n");
          out.write("                                     style=\"text-align: center\"> \n");
          out.write("                                       ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartItem.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td class=\"col-md-1 text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartItem.product.unitPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                     </td>\n");
          out.write("Â Â Â Â Â  Â Â Â Â Â Â Â Â Â Â Â Â Â Â <td class=\"col-md-1 text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartItem.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                     </td>\n");
          out.write("                                  </tr> \n");
          out.write("                              ");
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
