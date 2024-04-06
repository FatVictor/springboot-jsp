package com.vtn.tag;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

import java.io.IOException;

public class HelloTag extends SimpleTagSupport {
    public void doTag() throws IOException {
        JspWriter out = getJspContext().getOut();
        out.println("Hello HelloTag Tag!");
    }

}
