package com.vtn.tag;

import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import lombok.Setter;
import lombok.SneakyThrows;
import net.logicsquad.minifier.css.CSSMinifier;
import net.logicsquad.minifier.js.JSMinifier;

import java.io.StringReader;
import java.io.StringWriter;

@Setter
public class Compress extends SimpleTagSupport {
    private Type type;

    @SneakyThrows
    public void doTag() {
        if (Type.CSS == type) {

            StringWriter sw = new StringWriter();
            getJspBody().invoke(sw);
            CSSMinifier css = new CSSMinifier(new StringReader(sw.toString()));
            StringWriter out = new StringWriter();
            css.minify(out);
            getJspContext().getOut().write("<style type=\"text/css\">");
            getJspContext().getOut().write(out.toString());
            getJspContext().getOut().write("</style>");


        } else {
            StringWriter sw = new StringWriter();
            getJspBody().invoke(sw);
            JSMinifier css = new JSMinifier(new StringReader(sw.toString()));
            StringWriter out = new StringWriter();
            css.minify(out);
            getJspContext().getOut().write("<script type=\"application/javascript\">");
            getJspContext().getOut().write(out.toString());
            getJspContext().getOut().write("</script>");
        }

    }

    public enum Type {
        CSS, JS
    }


}
