package com.vtn.tag;

import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import lombok.Setter;

import java.io.IOException;

@Setter
public class TagWithAttr extends SimpleTagSupport {
    private String value;

    public void doTag() throws IOException {
        if (value != null) {
            getJspContext().getOut().println(value);
        } else {
            getJspContext().getOut().println("Hello TagWithAttr Tag!");
        }
    }
}
