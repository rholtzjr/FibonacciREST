package org.holtz.fibonacci.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "fibonacci")
public class FibonacciBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<String> index;

    public FibonacciBean() {
    }

    @XmlElement(name = "index")
    public List<String> getIndex() {
        return index;
    }

    public void setIndex(List<String> input) {
        this.index = input;
    }
}
