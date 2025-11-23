package com.vtn.tag;

import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import lombok.Setter;

import java.io.IOException;
import java.util.Objects;

@Setter
public class TagWithAttr extends SimpleTagSupport {
    private String value;

    public void doTag() throws IOException {
        getJspContext().getOut().println(Objects.requireNonNullElse(value, "Hello TagWithAttr Tag!"));
    }
}
